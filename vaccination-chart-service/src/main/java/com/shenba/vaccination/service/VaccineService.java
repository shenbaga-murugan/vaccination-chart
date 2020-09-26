package com.shenba.vaccination.service;

import java.util.List;

import com.shenba.vaccination.domain.Vaccine;

/**
 * @author Shenbaga Murugan
 */
public interface VaccineService {
    List<Vaccine> getVaccines();
    Vaccine saveVaccine(Vaccine vaccine);
}
