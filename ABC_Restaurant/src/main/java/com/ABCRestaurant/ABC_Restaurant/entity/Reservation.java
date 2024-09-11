package com.ABCRestaurant.ABC_Restaurant.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Reservation {
    @Id
    private int Id;
    private String Name;
    private String Phone;
    private String Persons_count;
    private String Date;
    private String Time;
    private String Massege;
}
