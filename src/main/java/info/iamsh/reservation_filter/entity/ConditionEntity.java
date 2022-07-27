package info.iamsh.reservation_filter.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "Conditions")
public class ConditionEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "gender")
    private Integer gender;

    @Column(name = "age_from")
    private Integer ageFrom;

    @Column(name = "age_to")
    private Integer ageTo;

    @Column(name = "room_id")
    private Integer roomId;

    @Column(name = "room_type", columnDefinition = "integer default 3")
    private Integer roomType; // 1 gold, 2 platinum 3 silver  (default 3)// order by descending




}
