package ru.dgmz2.web.accent.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "entities")
public class Entities {

    @Id
    @Column(name = "ent_id")
    private Long id;

    @Column(name = "ent_name")
    private String entName;

    public Entities() {
    }

    public Entities(String entName, Long id) {
        this.entName = entName;
        this.id = id;
    }

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
