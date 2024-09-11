package com.ABCRestaurant.ABC_Restaurant.service;

import com.ABCRestaurant.ABC_Restaurant.dto.UserRegDTO;
import com.ABCRestaurant.ABC_Restaurant.entity.UserReg;
import com.ABCRestaurant.ABC_Restaurant.repo.UserRegRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserRegService {
    @Autowired
    private UserRegRepo userRegRepo;

    @Autowired
    private ModelMapper modelMapper;

    public UserRegDTO saveUser(UserRegDTO userRegDTO){
        userRegRepo.save(modelMapper.map(userRegDTO, UserReg.class));
        return userRegDTO;
    }
    public List<UserRegDTO> getAllUsers(){
        List<UserReg> userList=userRegRepo.findAll();
        return modelMapper.map(userList, new TypeToken<List<UserRegDTO>>(){}.getType());
    }
    public UserRegDTO updateUser(UserRegDTO userRegDTO){
        userRegRepo.save(modelMapper.map(userRegDTO,UserReg.class));
        return userRegDTO;
    }
    public boolean deleteUser(UserRegDTO userRegDTO){
        userRegRepo.delete(modelMapper.map(userRegDTO,UserReg.class));
        return true;
    }


    public UserRegDTO getUserById(String userId){
        UserReg userReg=userRegRepo.getUserByID(userId);
        return modelMapper.map(userReg,UserRegDTO.class);
    }

    public UserRegDTO getEmailAndPassword(String email, String password){
        UserReg userReg= userRegRepo.getEmailAndPassword(email,password);
        return modelMapper.map(userReg,UserRegDTO.class);
    }
    public boolean deleteUsrById(int userId){
        userRegRepo.deleteUsrById(userId);
        return true;
    }
}
