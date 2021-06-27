package com.epharma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.epharma.entity.Medicine;
import com.epharma.service.MedicineService;

@Controller
public class MedicineController {

	@Autowired
	MedicineService service;

	
	@GetMapping("/home")
	public String medicineForm() {
		return "medical";
		
	}
	@PostMapping("/home")
	public String medicineValidation(@ModelAttribute("med") Medicine med) {	
		System.out.println(med);
	   service.addMedicineDetailsInDB(med);
		return "redirect:/listofmedicins";
	}

	@GetMapping("/expirymedicins")
	public String showExpiryMedicineList(Model model) {
		List<Medicine> allmedicins = service.getExpiryMedicineList();
		System.out.println(allmedicins);
		model.addAttribute("expiredmedicines", allmedicins);
		return "expirymedicines";
	}
	
	@GetMapping("/listofmedicins")
	public String showAllMedicineList(Model model) {
		List<Medicine> allmedicins = service.getAllMedicins();
		System.out.println(allmedicins);
		model.addAttribute("allmedicineslist", allmedicins);
		return "medicinelist";
	}

}



