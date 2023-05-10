package Entiti;

import lombok.*;
import sun.util.resources.CalendarData;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "`User`")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private int idUser;
    @Column(name = "name_user")
    private String nameUser;
    @Column(name = "login_user")
    private String loginUser;
    @Column(name = "password_user")
    private String passwordUser;
    @Column(name = "data_creation")
    private Date dataCreation;
    @Column(name = "data_update")
    private Date dateUpdate;

    public User(String nameUser, String loginUser, String passwordUser) {
        this.nameUser = nameUser;
        this.loginUser = loginUser;
        this.passwordUser = passwordUser;
        this.dataCreation = new Date();
    }
}
