package com.example.imageservice.controller;

import com.example.imageservice.entity.Image;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class ImageController {
    // http://10.1.11.60:8761/image/getListImage
    @GetMapping("/getListImage")
    List<Image> getListImage() {
        return List.of(
                new Image("lion", "null"),
                new Image("lion", "null"),
                new Image("lion", "null")
        );
    }

}
