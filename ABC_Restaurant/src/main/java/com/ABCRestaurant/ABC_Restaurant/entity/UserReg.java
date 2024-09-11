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
public class UserReg {
    @Id
    private int Id;
    private String Name;
    private String Email;
    private String Mobile;
    private String Password;
}
