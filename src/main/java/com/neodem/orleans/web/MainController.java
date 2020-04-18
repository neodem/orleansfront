package com.neodem.orleans.web;

import com.neodem.orleans.objects.PublicGameState;
import com.neodem.orleans.service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Vincent Fumo (neodem@gmail.com)
 * Created on 1/20/20
 */
@Controller
public class MainController {

    @Resource
    private GameService gameService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "you suck");
        return "vue";
    }

    @RequestMapping("/init")
    public String init(@RequestParam(value = "playerNames") List<String> names, Model model) {
        PublicGameState gameState = gameService.initGame(names);
        model.addAttribute("gameState", gameState);
        return "game";
    }
}
