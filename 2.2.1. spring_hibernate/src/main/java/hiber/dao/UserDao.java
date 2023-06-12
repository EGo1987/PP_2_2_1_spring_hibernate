package hiber.dao;

import hiber.model.User;
import hiber.model.Car;

import java.util.List;

public interface UserDao {
   void add(User user);
   Object getUserFromCar(String model, Integer series);
   List<User> listUsers();
}