package ru.dgmz2.web.accent.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.dgmz2.web.accent.entities.Document;
import ru.dgmz2.web.accent.repositories.DocumentRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by net_master on 13.10.2016.
 */
@RestController
@CrossOrigin
public class RestDocsController {

    @Autowired
    private DocumentRepository documentRepository;

    @RequestMapping(value = "/listDocFolderAndDate/{id}/{d1}/{d2}", method = RequestMethod.GET,
            headers = "Accept=application/json")
    public List<Document> findDocsFolderAndDate(@PathVariable("id") Long id,
                                                @PathVariable("d1") String d1,
                                                @PathVariable("d2") String d2) {

        Date date1 = new Date();
        Date date2 = date1;

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        try{
            date1 = formatter.parse(d1);
            date2 = formatter.parse(d2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(d1+ " " + d2);
        System.out.println(date1+ " " + date2);
        List<Document> documents = documentRepository.findDocsFolderAndDate(date1, date2, id);
        return documents;
    }

    @RequestMapping(value = "/listDocsFolder/{id}", method = RequestMethod.GET,
            headers = "Accept=application/json")
    public List<Document> findDocs(@PathVariable("id") Long id) {

        Date date1 = new Date();
        Date date2 = date1;

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        try{
            date1 = formatter.parse("01-01-2016");
            date2 = formatter.parse("15-01-2016");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date1+ " " + date2);
        List<Document> documents = documentRepository.findDocsFolderAndDate(date1, date2, id);
        return documents;
    }
}

