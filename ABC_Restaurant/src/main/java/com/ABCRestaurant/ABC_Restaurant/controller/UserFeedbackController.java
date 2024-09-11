package com.ABCRestaurant.ABC_Restaurant.controller;

import com.ABCRestaurant.ABC_Restaurant.dto.UserFeedbackDTO;
import com.ABCRestaurant.ABC_Restaurant.service.UserFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin
public class UserFeedbackController {
    @Autowired
    private UserFeedbackService userFeedbackService;

    @GetMapping("/getFeedbacks")
    public List<UserFeedbackDTO> getFeedbacks(){
        return userFeedbackService.getAllFeedbacks();
    }

    @PostMapping("/saveFeedback")
    public UserFeedbackDTO saveFeedbacks(@RequestBody UserFeedbackDTO userFeedbackDTO){
        return userFeedbackService.saveFeedback(userFeedbackDTO);
    }

    @PutMapping("/updateFeedback")
    public UserFeedbackDTO updateFeedback(@RequestBody UserFeedbackDTO userFeedbackDTO){
        return userFeedbackService.updateFeedback(userFeedbackDTO);
    }

    @DeleteMapping("/deleteFeedback/{Id}")
    public boolean deleteFeedbackById(@PathVariable int Id){
        return userFeedbackService.deleteFeedbackById(Id);
    }

}
