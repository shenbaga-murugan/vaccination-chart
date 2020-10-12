package com.shenba.vaccination.controller.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shenba.vaccination.domain.Vaccine;
import com.shenba.vaccination.service.VaccineService;

/**
 * @author Shenbaga Murugan
 *
 */
@RestController
@RequestMapping(path = "/vaccines")
public class VaccineRestController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(VaccineRestController.class);

    @Autowired
    private VaccineService vaccineService;
    
    @GetMapping(path = "")
    public List<Vaccine> getAllVaccines() {
    	List<Vaccine> vaccineList = vaccineService.getVaccines();
    	LOGGER.info("Fetched total of {} vaccines from DB.", vaccineList.size());
    	return vaccineList;
    }
    
    @PostMapping(path = "")
    public Vaccine saveVaccine(@RequestBody Vaccine vaccine) {
    	Vaccine savdeVaccine = vaccineService.saveVaccine(vaccine);
    	LOGGER.info("Saved {} vaccine to DB.", vaccine);
    	return savdeVaccine;
    }

}
