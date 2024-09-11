package com.ABCRestaurant.ABC_Restaurant.repo;

import com.ABCRestaurant.ABC_Restaurant.entity.UserReg;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserRegRepo extends JpaRepository<UserReg,Integer>{

    @Query(value = "SELECT * FROM user_reg WHERE id = ?1", nativeQuery = true)
    UserReg getUserByID(String userId);

    @Query(value = "SELECT * FROM user_reg WHERE email = ?1 and password = ?2", nativeQuery = true)
    UserReg getEmailAndPassword(String email, String password);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM user_reg WHERE id = ?1", nativeQuery = true)
    void deleteUsrById (int  userId);

}
