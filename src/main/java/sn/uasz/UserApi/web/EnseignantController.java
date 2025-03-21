package sn.uasz.UserApi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sn.uasz.UserApi.entities.Enseignant;
import sn.uasz.UserApi.repositories.EnseignantRepository;

import java.util.List;

@Controller
public class EnseignantController {

    @Autowired
    EnseignantRepository enseignantRepository;

    @GetMapping("/index")
    public String index(Model model){
        List<Enseignant> enseignants=enseignantRepository.findAll();
        model.addAttribute("listeEnseignants",enseignants);
        return "enseignant/enseignants";
    }
    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(Model model){
        model.addAttribute("enseignant", new Enseignant());
        return "enseignant/formEnseignant";
    }
    @PostMapping(path= "/save")
    public String save(Enseignant p){
        enseignantRepository.save(p);
        return "redirect:/index";
    }
    @RequestMapping("/editEnseignant")
    public String editEnseignant(Model model, @RequestParam(name = "id") Long id){
        Enseignant enseignant=enseignantRepository.findById(id).orElse(null);
        if (enseignant==null) throw new RuntimeException("Enseignant introuvable");
        model.addAttribute("enseignant", enseignant);
        return "enseignant/editEnseignant";
    }

    @GetMapping("/deleteEnseignant")
    public String delete (@RequestParam(name = "id") Long id){
        enseignantRepository.deleteById(id);
        return "redirect:/index";
    }

}
