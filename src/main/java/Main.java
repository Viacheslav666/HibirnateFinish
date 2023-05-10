import DAO.RoleDAO;
import DAOimpl.RoleDaoImpl;
import Entiti.Role;

public class Main {
    public static void main(String[] args) {
        RoleDAO roleDAO =new RoleDaoImpl();
        Role kam = new Role("KAM");

        System.out.println(roleDAO.getAllRole());

    }
}
