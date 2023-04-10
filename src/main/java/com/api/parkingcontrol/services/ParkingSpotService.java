package com.api.parkingcontrol.services;

import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//bing do spring
@Service
public class ParkingSpotService {

    //Ponto de injeção que avisa o spring para injetar as dependencias.
    @Autowired
    ParkingSpotRepository parkingSpotRepository;
}
