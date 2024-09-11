package com.ABCRestaurant.ABC_Restaurant.repo;

import com.ABCRestaurant.ABC_Restaurant.entity.Reservation;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.Query;

public interface ReservationRepo extends JpaRepository<Reservation,Integer>{

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM reservation WHERE id = ?1", nativeQuery = true)
    void deleteResById (int Id);
}
