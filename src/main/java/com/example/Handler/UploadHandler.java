package com.example.Handler;

import com.example.Common.EnumConstants;
import org.apache.commons.io.FileUtils;
import org.apache.tomcat.util.descriptor.tld.TldRuleSet;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.zip.CRC32;

/**
 * Created by Administrator on 2016/3/2.
 */
public class UploadHandler
{
    public com.example.Common.Response Upload(String filename,String fileformat,String path, MultipartFile file)
    {
        try {
            File voiceDir = new File("D:\\\\config\\");
            if (!voiceDir.exists()) {
                voiceDir.mkdirs();
            }
            if (file.isEmpty())
            {
                return new com.example.Common.Response(EnumConstants.ErrorInfo.VoiceFileIsull);
            }
            if (!filename.endsWith(".bytes")) {
                return new com.example.Common.Response(EnumConstants.ErrorInfo.VoiceFileSuffixError);
            }

            byte[] fileContent = file.getBytes();
            long sign = GetSign(fileContent);

            FileUtils.writeByteArrayToFile(new File(voiceDir.getPath() + "/" + filename), fileContent);

            return new com.example.Common.Response(EnumConstants.ErrorInfo.SystemError);
        } catch (Exception e) {
            return new com.example.Common.Response(EnumConstants.ErrorInfo.SystemError);
        }
    }
    private long GetSign(byte[] content)
    {
        CRC32 crc32 = new CRC32();
        crc32.update(content);
        long res = crc32.getValue();
        System.out.println("Sign = " + res);
        return res;
    }
    private void LoadVersionFile()
    {

    }
    private void SaveVersionFile()
    {

    }
    private void UpdateConfigFile(String filename)
    {

    }

}
