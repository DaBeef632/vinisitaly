package com.vinisitaly.webpage.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "country")
@Getter
@Setter
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private Long id;

    @Column(name="country_name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "country")
    private Set<Region> regions;
}
