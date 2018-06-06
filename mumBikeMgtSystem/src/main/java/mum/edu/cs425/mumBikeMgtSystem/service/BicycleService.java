package mum.edu.cs425.mumBikeMgtSystem.service;

import java.util.List;

import mum.edu.cs425.mumBikeMgtSystem.model.Bicycle;

public interface BicycleService {
	public List<Bicycle> getAllBicycles();
	public Bicycle getBicycleById(long id);
	public void saveOrUpdate(Bicycle bicycle);
	public void deleteBicycle(long id);
}