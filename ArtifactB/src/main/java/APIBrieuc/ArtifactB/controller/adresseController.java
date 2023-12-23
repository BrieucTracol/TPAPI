package APIBrieuc.ArtifactB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class adresseController {

    @GetMapping("/adresse")
    public String adresse(Model model) {
        return "adresse";
    }
}