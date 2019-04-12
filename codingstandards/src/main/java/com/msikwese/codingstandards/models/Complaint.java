package com.msikwese.codingstandards.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String title;

    @NotNull
    private String content;

    @ManyToOne
    @JoinColumn(name = "complainant_id")
    private Customer complainant;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Customer getComplainant() {
        return complainant;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setComplainant(Customer complainant) {
        this.complainant = complainant;
    }
}
