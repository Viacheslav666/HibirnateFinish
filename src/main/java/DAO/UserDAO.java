package DAO;

import Entiti.Role;
import Entiti.User;
import Entiti.User_role;

import java.util.List;

public interface UserDAO {
public List<User> getAllUser();

public User getUserID(int id);

public User getUserRole(User user);
public void deleteUser(int id);
public User creatUSerRole(User user);
public User setUser(User user);

}