package com.msikwese.codingstandards.models;

import javax.persistence.*;
import java.sql.Time;

@Entity
public class ComplaintResolution {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    @JoinColumn(name = "complaint_id")
    private Complaint complaint;

    @OneToOne
    @JoinColumn(name = "arbitrator_id")
    private User arbitrator;

    private String resolution;

    public long getId() {
        return id;
    }

    public Complaint getComplaint() {
        return complaint;
    }

    public void setComplaint(Complaint complaint) {
        this.complaint = complaint;
    }

    public User getArbitrator() {
        return arbitrator;
    }

    public void setArbitrator(User arbitrator) {
        this.arbitrator = arbitrator;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}
