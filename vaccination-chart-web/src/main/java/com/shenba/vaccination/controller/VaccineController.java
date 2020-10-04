package com.shenba.vaccination.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shenba.vaccination.domain.Vaccine;
import com.shenba.vaccination.service.VaccineService;

/**
 * @author Shenbaga Murugan
 */
@Controller
@RequestMapping(path = "/vaccine")
public class VaccineController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(VaccineController.class);

    @Autowired
    private VaccineService vaccineService;

    @PostMapping(path = "/save.do")
    public ModelAndView addVaccine(@ModelAttribute("vaccine") Vaccine vaccine) {
    	vaccineService.saveVaccine(vaccine);
    	LOGGER.info("Saved {} vaccine to DB.", vaccine);
    	return new ModelAndView("redirect:/vaccine/list.do");
    }

    @GetMapping(path = "/add.do")
    public String addVaccine(Model model) {
    	model.addAttribute(new Vaccine());
        return "vaccineInformation";
    }
    
    @GetMapping(path = "/list.do")
    public String getAllVaccines(Model model) {
    	List<Vaccine> vaccineList = vaccineService.getVaccines();
    	LOGGER.info("Fetched total of {} vaccines from DB.", vaccineList.size());
    	model.addAttribute("vaccineList", vaccineService.getVaccines());
        return "vaccineList";
    }

}
