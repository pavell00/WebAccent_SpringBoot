package ru.dgmz2.web.accent.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ru.dgmz2.web.accent.entities.Document;
import ru.dgmz2.web.accent.repositories.DocumentRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@Controller
public class DocumentController {

    @Autowired
    private DocumentRepository documentRepository;


    @RequestMapping(value = "/treeDocuments")
    public String TreeDocuments( Model model) {

//            System.out.println(d1);
        //List<Document> documents = documentRepository.findByDocDateBetweenOrderByDocDateAsc(d1, d2);
//            model.addAttribute("treeDocs", treeDocs);
        return "treeDocs2";
    }

    @RequestMapping(value = "/gridDocsOfDate", method = RequestMethod.GET)
    public String getDocsOfDate(@RequestParam(required = false) String sd1, @RequestParam(required = false) String sd2,
                                final RedirectAttributes redirectAttributes, Model model) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        try {

            Date d1 = sd1 == null ? new Date() : formatter.parse(sd1);
            Date d2 = sd2 == null ? new Date() : formatter.parse(sd2);

            List<Document> documents = documentRepository.findByDocDateBetweenOrderByDocDateAsc(d1, d2);

            model.addAttribute("sd1", sd1);
            model.addAttribute("sd2", sd2);
            model.addAttribute("allDocuments", documents);
            return "gridDocsOfDate";
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "gridDocsOfDate";
    }

    @RequestMapping("/documents")
    public String home(Model model) {
        Date d1 = new GregorianCalendar(2016, 0, 1).getTime();
        Date d2 = new GregorianCalendar(2016, 0, 3).getTime();
        List<Document> docList = documentRepository.findByDocDateBetweenOrderByDocDateAsc(d1, d2);
        model.addAttribute("documents", docList);
//        model.addAttribute("conf", myconf);
        return "documents";
    }
}
