package db.hibernate.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Table(name = "student")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    @Id
    @GeneratedValue()
    private UUID id;
    private String name;
    private Integer mark;
}
