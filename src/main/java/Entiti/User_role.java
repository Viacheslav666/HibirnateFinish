package Entiti;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "User_role")
public class User_role {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUserRole;

    @ManyToMany
    @JoinTable(
            name = "User",
            joinColumns = @JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "id_role")
    )
    private List<User> users;
    private static EntityManager createEntityManager() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        return entityManagerFactory.createEntityManager();
    }
    public User getUserRole(User user) {
        EntityManager entityManager = createEntityManager();
         Query query = entityManager.createNativeQuery("SELECT * FROM User_role, User_role.class");
        return (User) query;
    }

}
