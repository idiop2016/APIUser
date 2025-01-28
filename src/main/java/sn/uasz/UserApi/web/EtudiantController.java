package sn.uasz.UserApi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import sn.uasz.UserApi.entities.Enseignant;
import sn.uasz.UserApi.repositories.EtudiantRepository;
import sn.uasz.UserApi.entities.Etudiant;

import java.util.List;

@Controller
public class EtudiantController {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @GetMapping("/etudiant/index")
    public String index(Model model) {
        List<Etudiant> etudiantList = etudiantRepository.findAll();
        model.addAttribute("listeEtudiants", etudiantList);
        return "etudiant/index"; 
    }

    @GetMapping("/etudiant/{id}")
    public String getEtudiant(@PathVariable Long id, Model model) {
        Etudiant etudiant = etudiantRepository.findById(id).orElse(null);
        model.addAttribute("etudiant", etudiant);
        return "etudiant/detail"; 
    }

    @PostMapping("/etudiant")
    public String createEtudiant(@ModelAttribute Etudiant etudiant) {
        etudiantRepository.save(etudiant);
        return "redirect:/etudiant/index";
    }

    @PostMapping("/etudiant/{id}")
    public String updateEtudiant(@PathVariable Long id, Model model) {
        Etudiant etu=etudiantRepository.findById(id).orElse(null);
        if (etu==null) throw new RuntimeException("Etudiant introuvable");
        model.addAttribute("enseignant", etu);
        return "etudiant/editEtudiant";
    }

    @GetMapping("/etudiant/delete/{id}")
    public String deleteEtudiant(@PathVariable Long id) {
        etudiantRepository.deleteById(id);
        return "redirect:/etudiant/index";
    }
}