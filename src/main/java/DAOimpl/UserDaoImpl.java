package DAOimpl;

import DAO.UserDAO;
import Entiti.Role;
import Entiti.User;

import javax.persistence.*;
import java.util.List;

public class UserDaoImpl implements UserDAO {
    private static EntityManager createEntityManager() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        return entityManagerFactory.createEntityManager();
    }
    public List getAllUser() {
        EntityManager entityManager =createEntityManager();
        Query query =  entityManager.createNativeQuery("SELECT * FROM user", User.class);
        return query.getResultList();
    }

    public User getUserID(int id) {
        EntityManager entityManager = createEntityManager();
        return entityManager.find(User.class, id);

    }

    public User getUserRole(User user) {

    }
    public void deleteUser(int id) {
        EntityManager entityManager = createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        User user =  entityManager.find(User.class, id);
        entityManager.remove(user);
        transaction.commit();
        entityManager.close();

    }

    public User creatUSerRole(User user) {
        EntityManager entityManager = createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(user);
        transaction.commit();
        entityManager.close();

        return user;

    }

    public User setUser(User user) {
        EntityManager entityManager = createEntityManager();
        entityManager.merge(user);
        entityManager.close();
return user;
    }
}
