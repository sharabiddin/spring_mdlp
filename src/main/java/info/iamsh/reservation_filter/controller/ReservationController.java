package info.iamsh.reservation_filter.controller;


import info.iamsh.reservation_filter.entity.ConditionEntity;
import info.iamsh.reservation_filter.entity.UserEntity;
import info.iamsh.reservation_filter.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/reservation")
@CrossOrigin(origins = "*", maxAge = 3600)

public class ReservationController {
    //LAYER 1)

    @Autowired
    private ReservationService reservationService;

    @GetMapping(value = "/get-all")
    public List<ConditionEntity> getAll() {
        return reservationService.findAll();
    }

    @PostMapping(value = "/set")
    public ConditionEntity set(@RequestBody ConditionEntity conditionEntity) {
        return reservationService.set(conditionEntity);
    }

    @PostMapping(value = "/get-by")
    public List<ConditionEntity> getBy(@RequestBody UserEntity userEntity, Integer roomType) {

        return reservationService.getBy(userEntity, roomType);

    }
}
