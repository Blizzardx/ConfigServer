package com.example;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.ws.Response;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

@Controller
public class SystemController
{
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
    public com.example.Response upload(
            @RequestParam(value = "filename") String filename,
            @RequestParam(value = "fileformat") String fileformat,
            @RequestParam(value = "path") String path,
            @RequestParam(value = "file", required = true) MultipartFile file
    ) {
        try {
            File voiceDir = new File("D:\\\\config\\");
            if (!voiceDir.exists()) {
                voiceDir.mkdirs();
            }
            if (file.isEmpty())
            {
                return new com.example.Response(EnumConstants.ErrorInfo.VoiceFileIsull);
            }
            if (!filename.endsWith(".bytes")) {
                return new com.example.Response(EnumConstants.ErrorInfo.VoiceFileSuffixError);
            }

            FileUtils.writeByteArrayToFile(new File(voiceDir.getPath() + "/" + filename), file.getBytes());

            return new com.example.Response(EnumConstants.ErrorInfo.SystemError);
        } catch (Exception e) {
            return new com.example.Response(EnumConstants.ErrorInfo.SystemError);
        }
    }

}
