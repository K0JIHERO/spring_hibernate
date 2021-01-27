package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   User getByCar(int series, String model);
   List<User> listUsers();
   void deleteAll();
}
