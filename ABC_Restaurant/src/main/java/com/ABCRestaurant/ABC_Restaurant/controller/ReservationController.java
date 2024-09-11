package com.ABCRestaurant.ABC_Restaurant.controller;

import com.ABCRestaurant.ABC_Restaurant.dto.ReservationDTO;
import com.ABCRestaurant.ABC_Restaurant.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/reservation")
@CrossOrigin
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @GetMapping("/getReservations")
    public List<ReservationDTO> getReservations(){
        return reservationService.getAllReservations();
    }

    @PostMapping("/saveReservation")
    public ReservationDTO saveReservation(@RequestBody ReservationDTO reservationDTO){
        return reservationService.saveReservation(reservationDTO);
    }

    @PutMapping("/updateReservation")
    public ReservationDTO updateReservation(@RequestBody ReservationDTO reservationDTO){
        return reservationService.updateReservation(reservationDTO);
    }

    @DeleteMapping("/deleteReservation/{Id}")
    public boolean deleteResById(@PathVariable int Id){
        return reservationService.deleteResById(Id);
    }
}
