//package info.iamsh.reservation_filter.entity;
//
//import lombok.Data;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//
//@Entity
//@Data
//public class FilteredRoomsEntity {
//
//    @Id
//    Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "condition_id",referencedColumnName = "id")
//    ConditionEntity condition;
//
//    @ManyToOne
//    @JoinColumn(name = "room_id",referencedColumnName = "id")
//    RoomEntity room;
//
//}
