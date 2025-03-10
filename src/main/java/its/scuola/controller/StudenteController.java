package its.scuola.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import its.scuola.service.StudenteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class StudenteController {
    private static final Logger logger =LoggerFactory.getLogger(StudenteController.class);

    @Autowired
    private StudenteService studenteService;
    @GetMapping("/upload")
    public String showUploadPage() {
        return "upload";
    }
    @PostMapping("/upload")
    public String uploadJson(@RequestParam("file") MultipartFile file, Model model) {
        logger.info("Ricevuto file: {}", file.getOriginalFilename());
        if(file.isEmpty()) {
            logger.error("Tentativo di caricamento di un file vuoto.");
            model.addAttribute("message", "Errore: file è vuoto!");
            return "uploadResult";
        }
        try {
            studenteService.salvaStudenteDaJson(file);
            model.addAttribute("message", "File caricato con successo!");
            logger.info("Caricamento completato con successo.");
        } catch (IOException e) {
            logger.error("Errore nel caricamento del file", e);
            model.addAttribute("message", "Errore nel caricamento del file!");
        }
        return "uploadResult";
    }        
}
