package uz.script.menu.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.script.menu.configs.TableName;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = TableName.ROLES)
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String name;
}
