package com.ABCRestaurant.ABC_Restaurant.service;

import com.ABCRestaurant.ABC_Restaurant.dto.ReservationDTO;
import com.ABCRestaurant.ABC_Restaurant.dto.UserRegDTO;
import com.ABCRestaurant.ABC_Restaurant.entity.Reservation;
import com.ABCRestaurant.ABC_Restaurant.entity.UserReg;
import com.ABCRestaurant.ABC_Restaurant.repo.ReservationRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ReservationService {
    @Autowired
    private ReservationRepo reservationRepo;

    @Autowired
    private ModelMapper modelMapper;

    public ReservationDTO saveReservation(ReservationDTO reservationDTO){
        reservationRepo.save(modelMapper.map(reservationDTO, Reservation.class));
        return reservationDTO;
    }

    public List<ReservationDTO> getAllReservations(){
        List<Reservation> reservationsList=reservationRepo.findAll();
        return modelMapper.map(reservationsList, new TypeToken<List<ReservationDTO>>(){}.getType());
    }

    public ReservationDTO updateReservation(ReservationDTO reservationDTO){
        reservationRepo.save(modelMapper.map(reservationDTO,Reservation.class));
        return reservationDTO;
    }

    public boolean deleteResById(int Id){
        reservationRepo.deleteResById(Id);
        return true;
    }
}
