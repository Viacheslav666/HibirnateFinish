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
    @ManyToMany(mappedBy = "User_role", cascade = CascadeType.ALL)
    private List<UserRole> roles;


 public Role(String nameRole){
     this.nameRole = nameRole;
}
}
