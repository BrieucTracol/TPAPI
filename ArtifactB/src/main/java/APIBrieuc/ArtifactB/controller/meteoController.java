package APIBrieuc.ArtifactB.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class meteoController {

    @GetMapping("/adresse")
    public String meteo(Model model) {
        return "meteo";
    }

    @PostMapping("/meteo")
    public String postForm(@RequestParam("address") String address, Model model){
        model.addAttribute("address", address);
        return "meteo";

    }
}

