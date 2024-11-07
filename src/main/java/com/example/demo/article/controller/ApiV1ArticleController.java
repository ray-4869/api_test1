package com.example.demo.article.controller;

import com.example.demo.article.dto.ArticleDTO;
import com.example.demo.article.entity.Article;
import com.example.demo.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/articles")
@RequiredArgsConstructor
public class ApiV1ArticleController {
    private final ArticleService articleService;

    @GetMapping("")
    public List<ArticleDTO> list () {
        List<ArticleDTO> articleList = new ArrayList<>();

        articleList.add(new ArticleDTO(new Article("제목1","내용1")));
        articleList.add(new ArticleDTO(new Article("제목2","내용2")));
        articleList.add(new ArticleDTO(new Article("제목3","내용3")));

        return articleList;
    }

    @GetMapping("/{id}")
    public String getArticle() {
        return "단건";
    }

    @PostMapping("")
    public String create() {
        return "등록";
    }

    @PatchMapping("/{id}")
    public String modify() {
        return "수정";
    }

    @DeleteMapping("/{id}")
    public String delete() {
        return "삭제";
    }

}
