package com.justsmile.astrivest.index;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {

    @GetMapping({"/", "/index"})
    public String index(final Model model) {
        model.addAttribute("msg", "Astrivest");
        return "index";
    }
}
