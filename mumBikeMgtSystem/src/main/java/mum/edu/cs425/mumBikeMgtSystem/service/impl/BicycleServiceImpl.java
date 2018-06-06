package mum.edu.cs425.mumBikeMgtSystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.cs425.mumBikeMgtSystem.dao.BicycleRepository;
import mum.edu.cs425.mumBikeMgtSystem.model.Bicycle;
import mum.edu.cs425.mumBikeMgtSystem.service.BicycleService;

@Service
@Transactional
public class BicycleServiceImpl implements BicycleService {
	@Autowired
	private BicycleRepository bicycleRepo;
	
	@Override
	public List<Bicycle> getAllBicycles() {
		
		return (List<Bicycle>) bicycleRepo.findAll();
	}

	@Override
	public Bicycle getBicycleById(long id) {
		return bicycleRepo.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Bicycle u) {
		bicycleRepo.save(u);
		
	}

	@Override
	public void deleteBicycle(long id) {
		bicycleRepo.deleteById(id);
		
	}

}

