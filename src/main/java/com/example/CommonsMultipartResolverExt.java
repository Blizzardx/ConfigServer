package com.example;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUpload;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/2/29.
 */
public class CommonsMultipartResolverExt extends CommonsMultipartResolver {
    @Override
    protected MultipartParsingResult parseRequest(HttpServletRequest request)
            throws MultipartException {

        String encoding = determineEncoding(request);
        FileUpload fileUpload = prepareFileUpload(encoding);
        try {
            List<FileItem> fileItems = ((ServletFileUpload) fileUpload).parseRequest(request);
            MultipartParsingResult multipartParsingResult = parseFileItems(fileItems, encoding);
            Map<String, String[]> paramMap = multipartParsingResult.getMultipartParameters();
            for(Map.Entry<String, String[]> entry : paramMap.entrySet()){
                String[] ss = entry.getValue();
                for(int i = 0; i < ss.length; i++){
                    ss[i] = UrlUtil.urlDecode(ss[i]);
                }
            }
            return multipartParsingResult;
        }
        catch (FileUploadBase.SizeLimitExceededException ex) {
            throw new MaxUploadSizeExceededException(fileUpload.getSizeMax(), ex);
        }
        catch (FileUploadException ex) {
            throw new MultipartException("Could not parse multipart servlet request", ex);
        }
    }
}
