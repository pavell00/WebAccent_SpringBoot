package ru.dgmz2.web.accent;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.dgmz2.web.accent.entities.Document;
import ru.dgmz2.web.accent.repositories.DocumentRepository;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class DocumentsTest extends WebAccentSpringBootApplicationTests {

    @Autowired
    private DocumentRepository documentRepository;

    @Test
    public void loadAll() {
        List<Document> documents = documentRepository.findAll();
        Assert.assertNotEquals(documents.size(), 0);
    }

    @Test
    public void loadDocsOfPeriod(){
        Date d1 = new GregorianCalendar(2016, 0, 1).getTime();
        Date d2 = new GregorianCalendar(2016, 0, 3).getTime();

        List<Document> documents = documentRepository.findByDocDateBetween(d1, d2);
        System.out.println("records " + documents.size());

        for (Document doc : documents) {
            System.out.println(doc.getId()+" "+doc.getDocDate()+" "+doc.getDocName()+" "+doc.getDocNo());
        }
    }

    @Test
    public void loadDocsOfPeriodOrdered(){
        Date d1 = new GregorianCalendar(2016, 0, 1).getTime();
        Date d2 = new GregorianCalendar(2016, 0, 2).getTime();

        List<Document> documents = documentRepository.findByDocDateBetweenOrderByDocDateAsc(d1, d2);
        System.out.println("records " + documents.size());
        for (Document doc : documents) {
            System.out.println(doc.getId()+" "+doc.getDocDate()+" "+doc.getDocName()+" "+doc.getDocNo());
        }
    }

    @Test
    public void loadDocsPeriodAndFolder(){
        Date d1 = new GregorianCalendar(2016, 0, 1).getTime();
        Date d2 = new GregorianCalendar(2016, 0, 12).getTime();
        Long id = 222l;

        List<Document> documents = documentRepository.findDocsFolderAndDate(d1, d2, id);
        System.out.println("records " + documents.size());
        for (Document doc : documents) {
            System.out.println(doc.getId()+" "+doc.getDocDate()+" "+doc.getDocName()+" "+doc.getDocNo()+
                   " "+doc.getFolderId()+" "+doc.getDocSum()+" "+doc.getDocDone()
            );
        }
    }
}
