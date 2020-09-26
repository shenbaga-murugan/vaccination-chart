package com.shenba.vaccination.service.impl;

import com.shenba.vaccination.domain.Vaccine;
import com.shenba.vaccination.repository.VaccineRepository;
import com.shenba.vaccination.service.VaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Shenbaga Murugan
 */
@Service
public class VaccineServiceImpl implements VaccineService {

    @Autowired
    private VaccineRepository vaccineRepository;

    @Override
    public List<Vaccine> getVaccines() {
        return vaccineRepository.findAll();
    }

    @Override
    public Vaccine saveVaccine(Vaccine vaccine) {
        return vaccineRepository.save(vaccine);
    }
}
