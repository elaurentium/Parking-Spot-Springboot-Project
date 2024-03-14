package com.api.parkingcontrol.services;

import com.api.parkingcontrol.repositories.ParkingSportRepository;
import org.springframework.stereotype.Service;

@Service
public class ParkingSportService {
//    depois implementar regra de negocios

    final ParkingSportRepository parkingSportRepository;

    public ParkingSportService(ParkingSportRepository parkingSportRepository) {
        this.parkingSportRepository = parkingSportRepository;
    }
}
