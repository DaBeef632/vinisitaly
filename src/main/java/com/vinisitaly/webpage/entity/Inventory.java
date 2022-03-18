package com.vinisitaly.webpage.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.swing.*;
import java.util.Date;

@Entity
@Table(name = "inventory")
@Getter @Setter
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "wine_id", nullable = false)
    private Wine wine;

    @Column(name = "unit_cost")
    private float unit_cost;

    @Column(name = "case_cost")
    private float case_cost;

    @Column(name = "quantity")
    private int quantity;

    @Column(name= "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "last_updated")
    @UpdateTimestamp
    private Date lastUpdated;

}
