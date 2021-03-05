package com.fetchdata.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Class {
    @Id
    private String id;

    private String index;
    private String name;
    private String desc;
    private String proficiencies;
    private String url;

    public Class() {
    }

    public Class(String id, String index, String name, String desc, String proficiencies, String url) {
        this.id = id;
        this.index = index;
        this.name = name;
        this.desc = desc;
        this.proficiencies = proficiencies;
        this.url = url;
    }

    public String getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(String proficiencies) {
        this.proficiencies = proficiencies;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @javax.persistence.Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
