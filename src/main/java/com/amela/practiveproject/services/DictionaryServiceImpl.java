package com.amela.practiveproject.services;

import models.Dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryServiceImpl {
    private static Map<Integer, Dictionary> dictionaries = new HashMap<>();

    static {
        dictionaries.put(1, new Dictionary("hello", "xinchao"));
        dictionaries.put(2, new Dictionary("beatiful", "xinh dep"));
        dictionaries.put(3, new Dictionary("perfact", "hoan hao"));
        dictionaries.put(4, new Dictionary("friendly", "than thien"));
        dictionaries.put(5, new Dictionary("energy", "nang luong"));
        dictionaries.put(6, new Dictionary("respect", "ton trong"));
        dictionaries.put(7, new Dictionary("company", "cong ty"));
        dictionaries.put(8, new Dictionary("innovation", "su doi moi"));
        dictionaries.put(9, new Dictionary("solution", "phuong phap"));
        dictionaries.put(10, new Dictionary("Vladimir Putin", "đại đế"));
    }

    public List<Dictionary> findAll() {
        return new ArrayList<>(dictionaries.values());
    }
}
