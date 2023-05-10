package DAO;

import Entiti.Role;

import java.util.List;

public interface RoleDAO {
    public Role createRole(Role role);

    public void deleteRole(int id);

    public List<Role> getAllRole();

    public Role updateRole(Role role);
}
