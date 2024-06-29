package com.example.Graddle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StylesController {
    private StylesClient stylesClient;

    @Autowired
    public StylesController(StylesClient stylesClient){
        this.stylesClient = stylesClient;
    }

    @GetMapping("/allStyles")
    public ResponseEntity<StylesResponse> returnAllStyles(){
        StylesResponse stylesResponse = stylesClient.returnStyles();
        return ResponseEntity.ok(stylesResponse);
    }

}
