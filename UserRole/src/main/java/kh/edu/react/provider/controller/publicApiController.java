package kh.edu.react.provider.controller;


import kh.edu.react.provider.service.PublicApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping
public class publicApiController {

    @Autowired
    private PublicApiService publicApiService;

    @GetMapping("/trades")
    public String trades(@RequestParam Map<String, String> params) {
        return publicApiService.getTradeData(params);
    }

}
