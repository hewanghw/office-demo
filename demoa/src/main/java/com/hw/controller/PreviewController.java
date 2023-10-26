package com.hw.controller;

import com.hw.service.PreviewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RequestMapping("/file")
@RestController
public class PreviewController {
    private final PreviewService service;

    public PreviewController(PreviewService service) {
        this.service = service;
    }

    @GetMapping("/preview")
    public void onlinePreview(@RequestParam("url") String url, HttpServletResponse response) throws Exception{
        service.onlinePreview(url,response);
    }
}
