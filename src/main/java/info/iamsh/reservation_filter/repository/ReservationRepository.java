package info.iamsh.reservation_filter.repository;

import info.iamsh.reservation_filter.entity.ConditionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository


public interface ReservationRepository extends JpaRepository<ConditionEntity, Long> {

    //LAYER 3)

    List<ConditionEntity> findAll();

    ConditionEntity save(ConditionEntity conditionEntity);

    @Query(value = "SELECT c FROM ConditionEntity c WHERE c.ageFrom <= ?1 and c.ageTo>=?1 and c.gender=?2 and c.roomType>=?3 order by  c.roomType desc")

// //AIM:
// @Query(value = "SELECT *" +
//           "FROM filtered_rooms_entity " +
//           "JOIN rooms ON filtered_rooms_entity.id = rooms.id " +
//           "JOIN  conditions ON filtered_rooms_entity.id = conditions.id" ,nativeQuery = true)


// //AIM:
// @Query(value = "select roomEntity from  RoomEntity roomEntity join FilteredRoomsEntity filtereredRoom on filtereredRoom.id=roomEntity.id join FilteredRoomsEntity filteredRoom  on roomEntity.id=filteredRoom.id")
    List<ConditionEntity> getBy(Integer age, Integer gender, Integer roomType);

}
