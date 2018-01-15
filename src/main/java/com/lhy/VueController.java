package com.lhy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")

public class VueController {

    @RequestMapping("")
    public String index(ModelMap map) {
        map.put("name", "sking");
        return "index";
    }
}
