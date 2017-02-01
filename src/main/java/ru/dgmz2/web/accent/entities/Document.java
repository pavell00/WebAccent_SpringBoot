package ru.dgmz2.web.accent.entities;

import java.util.Date;

import javax.persistence.*;
//import java.time.LocalDate;

@Entity
@Table(name = "vw_documents")
public class Document {

    @Id
    @Column(name = "doc_id")
    private Long id;

    @Column(name = "doc_name")
    private String docName;

    @Column(name = "doc_no")
    private String docNo;

    @Column(name = "doc_date")
//    @Temporal(value= TemporalType.DATE)
//    private LocalDate docDate;
    private Date docDate;

    @Column(name = "fld_id")
    private Long folderId;

    @Column(name = "doc_sum")
    private Float docSum;

    @Column(name = "doc_done")
    private Integer docDone;

    @Column(name = "doc_date_str")
    private String docDateStr;

    public Document() {
    }

    public Document(Date docDate, Long id, String docName, String docNo) {
        this.docDate = docDate;
        this.id = id;
        this.docName = docName;
        this.docNo = docNo;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFolderId() {
        return folderId;
    }

    public void setFolderId(Long folderId) {
        this.folderId = folderId;
    }

    public Float getDocSum() {
        return docSum;
    }

    public void setDocSum(Float docSum) {
        this.docSum = docSum;
    }

    public Integer getDocDone() {
        return docDone;
    }

    public void setDocDone(Integer docDone) {
        this.docDone = docDone;
    }

    public String getDocDateStr() {
        return docDateStr;
    }

    public void setDocDateStr(String docDateStr) {
        this.docDateStr = docDateStr;
    }
}
