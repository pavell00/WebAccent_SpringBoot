package ru.dgmz2.web.accent.service;

import ru.dgmz2.web.accent.entities.Document;

import java.util.Date;
import java.util.List;

/**
 * Created by net_master on 05.05.2016.
 */
public interface DocumentService {

//    Document addDocument(Document document);
//    void delete(Long id);
//    Document findByNumber(String number);
//    List<Document> findAll();

    List<Document> findByDocDateBetween(Date startDate, Date endDate);
    List<Document> findByDocDateBetweenOrderByDocDateAsc(Date startDate, Date endDate);
}
