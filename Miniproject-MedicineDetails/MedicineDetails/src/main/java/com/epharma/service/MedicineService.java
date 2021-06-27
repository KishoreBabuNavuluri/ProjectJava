package com.epharma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epharma.DAO.MedicineRepository;
import com.epharma.entity.Medicine;

@Service
public class MedicineService {
	
	@Autowired
	MedicineRepository jpa;

	public Medicine addMedicineDetailsInDB(Medicine med) {
		return jpa.save(med);
		
	}
	public List<Medicine> getExpiryMedicineList() {
		return jpa.expiredMedicines();
		
	}
	public List<Medicine> getAllMedicins(){
		return jpa.findAll();
	}
 
}
