package DAOimpl;

import DAO.RoleDAO;
import Entiti.Role;

import javax.persistence.*;
import java.util.List;

public class RoleDaoImpl implements RoleDAO {
    private static EntityManager createEntityManager() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        return entityManagerFactory.createEntityManager();
    }
        public Role createRole (Role role){
            EntityManager entityManager = createEntityManager();
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(role);
            transaction.commit();
            entityManager.close();

    return role ;
        }

        public void deleteRole ( int id){
        EntityManager entityManager = createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Role role =  entityManager.find(Role.class, id);
        entityManager.remove(role);
        transaction.commit();
        entityManager.close();
        }

        public List<Role> getAllRole () {

            EntityManager entityManager =createEntityManager();
            Query query =  entityManager.createNativeQuery("SELECT * FROM role", Role.class);
            return query.getResultList();
        }

        public  Role updateRole (Role role){
            EntityManager entityManager = createEntityManager();
            entityManager.merge(role);
            entityManager.close();
            return role;

        }

}