package com.vinisitaly.webpage.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "wine")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Wine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private WineCategory category;

    @Column(name= "sku")
    private  String sku;

    @Column(name= "name")
    private String name;

    @Column(name= "color")
    private String color;

    @Column(name = "grapes")
    private String grapes;

    @Column(name = "vintage_year")
    private int vintageYear;

    @Column(name = "denomination")
    private String denomination;

    @Column(name = "type_of_soil")
    private String typeOfSoil;

    @Column(name = "alcholo_percentage" )
    private Float alcoholPercentage;

    @Column(name= "harvest")
    private String harvest;

    @Column(name= "vine_training_system")
    private String vineTrainingSystem;

    @Column(name = "grapes_per_hectare_kg")
    private int grapesPerHectareKg;

    @Column(name = "serving_temp_c")
    private String servingTempInC;

    @Column(name = "tasting_notes")
    private String tastingNotes;

    @Column(name= "aged")
    private String aged;

    @Column(name = "vinification")
    private String vinification;

    @Column(name= "food_pairing")
    private String foodPairing;

    @Column(name= "bottle_size")
    private Float bottleSize;

    @Column(name= "image_url")
    private String imageUrl;

    @Column(name= "active")
    private boolean active;

    @Column(name= "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "last_updated")
    @UpdateTimestamp
    private Date lastUpdated;


}
