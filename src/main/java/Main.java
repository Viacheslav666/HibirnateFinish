import DAO.RoleDAO;
import DAOimpl.RoleDaoImpl;
import DAOimpl.UserDaoImpl;
import Entiti.Role;
import Entiti.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RoleDAO roleDAO =new RoleDaoImpl();
        UserDaoImpl userDao = new UserDaoImpl();
        Role kam = new Role("KAM");
        Role rkam = new Role("RKAM");
        List<Role> roles = new ArrayList<>();
        roles.add(roleDAO.createRole(rkam));
        roles.add(roleDAO.createRole(kam));
        User user = new User("Kiril", "Monster", "123", kam);
        User user1 = new User("Slava", "Cheep", "123", rkam);
        userDao.creatUSerRole(user);
        userDao.getUserRole(2);
        userDao.setUser(user1);
        userDao.deleteUser(1);

    }
}
