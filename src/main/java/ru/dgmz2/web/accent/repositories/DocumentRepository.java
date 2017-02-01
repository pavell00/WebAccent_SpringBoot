package ru.dgmz2.web.accent.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.dgmz2.web.accent.entities.Document;

//import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {

//    @Query("select id, docNo, docName, docDate from Document where docNo like %:number%")
//    List<Document> findByDocNo(@Param("number") String number);
//
//    @Query("select doc_id, doc_no, doc_name, doc_date from Documents")
//    Document getAllDocs();

    @Query("select d from Document d where d.docDate between :d1 and :d2 order by d.docDate")
    List<Document> findByDocDateBetween(@Param("d1") Date d1, @Param("d2") Date d2);

    List<Document> findByDocDateBetweenOrderByDocDateAsc(@Param("d1") Date d1, @Param("d2") Date d2);

    @Query("select d from Document d where d.docDate between :d1 and :d2 and d.folderId = :id order by d.docDate")
    List<Document> findDocsFolderAndDate(@Param("d1") Date d1, @Param("d2") Date d2, @Param("id") Long id);
}
