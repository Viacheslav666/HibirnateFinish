package Entiti;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Role")
@ToString
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class Role {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_role")
    private int idRole;
@Column(name = "name_role")
private String nameRole;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "user_role",
    joinColumns = @JoinColumn(name = "id_role"),
    inverseJoinColumns = @JoinColumn(name = "id_user"))
    private List<User> roles;


 public Role(String nameRole){
     this.nameRole = nameRole;
}
}
