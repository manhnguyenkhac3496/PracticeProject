package com.amela.practiveproject.controllers;

import com.amela.practiveproject.services.DictionaryServiceImpl;
import models.Dictionary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class DictionaryController {
    private DictionaryServiceImpl dictionaryService = new DictionaryServiceImpl();

    @GetMapping(value = "/search")
    public String search() {
        return "index";
    }

    @PostMapping(value = "/result")
    public String meaning(@RequestParam String keyword, Model model) {
        List<Dictionary> dictionaries = this.dictionaryService.findAll();

        for (int i = 0; i < dictionaries.size(); i++) {
            if (keyword.equalsIgnoreCase(dictionaries.get(i).getEn())) {
                model.addAttribute("word", dictionaries.get(i).getVi());
                model.addAttribute("key", keyword);

                return "mean";
            }
        }
        return "mean";
    }
}
