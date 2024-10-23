package uz.script.menu.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.script.menu.configs.TableName;


public enum Role {
    ROLE_USER,
    ROLE_ADMIN,
}
