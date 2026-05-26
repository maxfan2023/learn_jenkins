package com.example.demo.controller;

import com.example.demo.domain.Tour;
import com.example.demo.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class TourController {

    @Autowired
    private TourService tourService;
    @GetMapping("rest/tour/search/{id}")
    public ResponseEntity<Tour> search(@PathVariable("id") Integer id){
        Tour tour =tourService.getTourById(id).orElse(null);
        return  new ResponseEntity<Tour>(tour, HttpStatus.OK);
    }

    @PostMapping("rest/tour/create")
    public ResponseEntity<Tour> search(@RequestBody com.example.demo.domain.Tour tour){
        return  new ResponseEntity<Tour>(tourService.createTour(tour), HttpStatus.OK);
    }
}
