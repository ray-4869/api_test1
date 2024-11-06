package com.example.demo.article.controller;

import com.example.demo.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ApiV1ArticleController {
    private final ArticleService articleService;

    @GetMapping("/articles/{id}")
    public String getArticle() {
        return "";
    }

    @PostMapping("/articles")
    public String create() {
        return "";
    }

    @PatchMapping("/articles/{id}")
    public String modify() {
        return "";
    }

    @DeleteMapping("/articles/{id}")
    public String delete() {
        return "";
    }
}
