package com.example.Controller;

import com.example.Common.EnumConstants;
import com.example.Handler.UploadHandler;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
public class SystemController
{
    private UploadHandler m_Handler = new UploadHandler();

    //get game type list
    @RequestMapping("/config/list_game_type")
    @ResponseBody
    public String list_game_type()
    {
        return "list_game_type ";
    }
    //get game version list
    @RequestMapping("/config/list_version")
    @ResponseBody
    public String list_version(@RequestParam(value="game_type") String name)
    {
        return "list_version " + name;
    }
    //get game config list
    @RequestMapping("/config/list_config")
    @ResponseBody
    public String list_config(@RequestParam(value="game_type") String game_type,@RequestParam(value="server_version") String server_version)
    {
        return "list_config " + game_type + " : " + server_version;
    }
    @RequestMapping(value = "/config/upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @ResponseBody
    public com.example.Common.Response upload(
            @RequestParam(value = "filename") String filename,
            @RequestParam(value = "fileformat") String fileformat,
            @RequestParam(value = "path") String path,
            @RequestParam(value = "file", required = true) MultipartFile file
    ) {
        return m_Handler.Upload(filename,fileformat,path,file);
    }

}
