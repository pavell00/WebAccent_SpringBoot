package ru.dgmz2.web.accent.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ru.dgmz2.web.accent.entities.Agent;
import ru.dgmz2.web.accent.entities.Document;
import ru.dgmz2.web.accent.repositories.DocumentRepository;
import ru.dgmz2.web.accent.service.DocumentService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by net_master on 19.05.2016.
 */
@Controller
public class WelcomeController {

    @Autowired
    DocumentRepository documentRepository;

    @RequestMapping("/welcome")
    public String welcome(Model model) {
//        model.addAttribute("conf", myconf);
        return "welcome";
    }

    @RequestMapping("/test")
    public String test(Model model) {
//        Date d1 = new GregorianCalendar(2016, 0, 1).getTime();
//        Date d2 = new GregorianCalendar(2016, 0, 2).getTime();
//
//        List<Document> documents = documentRepository.findByDocDateBetweenOrderByDocDateAsc(d1, d2);
//
//        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
//        DATE_FORMAT = new SimpleDateFormat("dd/MM/yy");
//        String date = DATE_FORMAT.format(d1);
//        model.addAttribute("StartDate", date);
//        model.addAttribute("EndDate", d2);
//        model.addAttribute("allDocuments", documents);
        return "treeDocs2";
    }
}