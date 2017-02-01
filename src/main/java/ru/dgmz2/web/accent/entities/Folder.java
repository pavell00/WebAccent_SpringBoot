package ru.dgmz2.web.accent.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@NamedNativeQuery(name = "Folder.getAll", query = "select * from folders", resultClass = Folder.class)
@Table(name = "vw_Folders")
public class Folder {

    @Id
    @Column(name = "fld_id")
    private Long id;

    @Column(name = "fld_name")
    private String fldName;

    @Column(name = "root_id")
    private Long rootId;

    @Column(name = "label")
    private String label;

    @Column(name = "data")
    private Long data;

    @Column(name = "expanded_icon")
    private String expandedIcon;

    @Column(name = "collapsed_icon")
    private String collapsedIcon;

    @Column(name = "leaf")
    private Boolean leaf;

    public Folder() {
    }

    public Folder(Long id, String fldName, Long rootId) {
        this.id = id;
        this.fldName = fldName;
        this.rootId = rootId;
    }

    public String getFldName() {
        return fldName;
    }

    public void setFldName(String fldName) {
        this.fldName = fldName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRootId() {
        return rootId;
    }

    public void setRootId(Long rootId) {
        this.rootId = rootId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Long getData() {
        return data;
    }

    public void setData(Long data) {
        this.data = data;
    }

    public String getExpandedIcon() {
        return expandedIcon;
    }

    public void setExpandedIcon(String expandedIcon) {
        this.expandedIcon = expandedIcon;
    }

    public String getCollapsedIcon() {
        return collapsedIcon;
    }

    public void setCollapsedIcon(String collapsedIcon) {
        this.collapsedIcon = collapsedIcon;
    }

    public Boolean getLeaf() {
        return leaf;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }
}
