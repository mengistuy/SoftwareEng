package mum.edu.cs425.mumBikeMgtSystem.dao;
import org.springframework.data.repository.CrudRepository;
import mum.edu.cs425.mumBikeMgtSystem.model.Bicycle;
public interface BicycleRepository extends CrudRepository<Bicycle,Long> {

}
