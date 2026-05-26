package com.example.demo.service;


import com.example.demo.domain.Tour;
import com.example.demo.repo.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class TourService {
    @Autowired
    private TourRepository tourRepository;

    public Optional<Tour> getTourById(Integer id)
    {
        return  tourRepository.findById(id);
    }

    public Tour createTour(com.example.demo.domain.Tour tour){
        return   tourRepository.save(tour);
    }
}
