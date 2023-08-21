package com.archive.version_1_archive.dto;

import jakarta.persistence.*;
import lombok.Getter;

import java.sql.Date;

@Getter
@Entity
@Table(name = "archive")
public class Archive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "datissuance")
    private Date whenDate;
    @Column(name = "fond")
    private String fond;
    @Column(name = "description")
    private String description;
    @Column(name = "affairs")
    private String affairs;
    @Column(name = "whomissued")
    private String whomIssued;
    @Column(name = "returndate")
    private Date returnDate;

    public void setId(Long id) {
        this.id = id;
    }

    public void setWhenDate(Date whenDate) {
        this.whenDate = whenDate;
    }

    public void setFond(String fond) {
        this.fond = fond;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAffairs(String affairs) {
        this.affairs = affairs;
    }

    public void setWhomIssued(String whomIssued) {
        this.whomIssued = whomIssued;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Archive{" +
                "id=" + id +
                ", whenDate=" + whenDate +
                ", fond='" + fond + '\'' +
                ", description='" + description + '\'' +
                ", affairs='" + affairs + '\'' +
                ", whomIssued='" + whomIssued + '\'' +
                ", returnDate=" + returnDate +
                '}';
    }

    public Archive() {
    }

    public Archive(Date whenDate, String fond, String description, String affairs, String whomIssued, Date returnDate) {
        this.whenDate = whenDate;
        this.fond = fond;
        this.description = description;
        this.affairs = affairs;
        this.whomIssued = whomIssued;
        this.returnDate = returnDate;
    }
}
