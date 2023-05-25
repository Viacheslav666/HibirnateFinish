package Entiti;

import lombok.*;
import sun.util.resources.LocaleData;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Locale;

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
    private LocalDate dataCreation;
    @Column(name = "data_update")
    private LocalDate dateUpdate;
    @ManyToMany
    private List <Role> roles;

    public User(String nameUser, String loginUser, String passwordUser, Role role) {
        this.nameUser = nameUser;
        this.loginUser = loginUser;
        this.passwordUser = passwordUser;
        this.dataCreation = LocalDate.now();

    }
}
