package com.saeg.ssr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import java.util.Arrays;

@Controller
public class ItemController {

    @GetMapping("/items")
    public String getItems(@RequestParam String hawbid, Model model) {
        // ここでhawbidに基づいてアイテムを検索します。
        // この例では、ダミーデータを使用します。
        List<Item> items = Arrays.asList(new Item(hawbid, "com.saeg.ssr.Application.Item 1"), new Item(hawbid, "com.saeg.ssr.Application.Item 2"));

        model.addAttribute("items", items);
        return "items";
    }
}