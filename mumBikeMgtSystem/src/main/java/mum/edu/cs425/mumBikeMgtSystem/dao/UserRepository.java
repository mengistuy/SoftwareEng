package mum.edu.cs425.mumBikeMgtSystem.dao;
import org.springframework.data.repository.CrudRepository;

import mum.edu.cs425.mumBikeMgtSystem.model.User;
public interface UserRepository extends CrudRepository<User,Long> {

}
