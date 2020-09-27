package com.hak.mygarden.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="plants")
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "common_name")
    private String common_name;
    @Column( name = "scientific_name")
    private String scientific_name;
    @Column( name = "quantity")
    private String quantity;
    @Column( name = "birthday")
    private String birthday = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

    @Override
    public String toString() {
        return String.join(",", id.toString(), common_name, scientific_name, quantity, birthday);
    }
}
