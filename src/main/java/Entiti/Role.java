package Entiti;

import lombok.*;

import javax.persistence.*;

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

 public Role(String nameRole){
     this.nameRole = nameRole;
}
}
