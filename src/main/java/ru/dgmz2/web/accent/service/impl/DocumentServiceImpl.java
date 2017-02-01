package ru.dgmz2.web.accent.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.dgmz2.web.accent.entities.Document;
import ru.dgmz2.web.accent.repositories.DocumentRepository;
import ru.dgmz2.web.accent.service.DocumentService;

import java.util.Date;
import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    private DocumentRepository documentRepository;
/*
    @Override
    public Document addDocument(Document document) {
        Document savedDoc = documentRepository.saveAndFlush(document);

        return savedDoc;
    }

    @Override
    public void delete(Long id) {
        documentRepository.delete(id);
    }

    @Override
    public Document getByNumber(String number) {
        return documentRepository.findByNumber(number);
    }

    @Override
    public List<Document> getAllDocs() {
        return null;
    }
*/
    @Override
    public List<Document> findByDocDateBetween(Date startDate, Date endDate) {
        return findByDocDateBetween(startDate, endDate);
    }

    @Override
    public List<Document> findByDocDateBetweenOrderByDocDateAsc(Date startDate, Date endDate) {
        return findByDocDateBetweenOrderByDocDateAsc(startDate, endDate);
    }
}
