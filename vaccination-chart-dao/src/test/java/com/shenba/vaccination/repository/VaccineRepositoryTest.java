package com.shenba.vaccination.repository;

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.shenba.vaccination.domain.Vaccine;

/**
 * 
 * @author Shenbaga Murugan
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class VaccineRepositoryTest {
	
	@Mock
	private VaccineRepository vaccineTestRepository;
	
	@Before
	public void init() {
		when(vaccineTestRepository.findAll()).thenReturn(new ArrayList<Vaccine>());
		when(vaccineTestRepository.save(any())).thenReturn(new Vaccine());
	}
	
	@Test
	public void whenFindAll_thenReturnVaccineList() {
		List<Vaccine> vaccines = vaccineTestRepository.findAll();
		assertNotNull(vaccines);
	}
	
	@Test
	public void whenSave_thenReturnSavedVaccine() {
		Vaccine vaccine = vaccineTestRepository.save(new Vaccine());
		assertNotNull(vaccine);
	}
	
}
