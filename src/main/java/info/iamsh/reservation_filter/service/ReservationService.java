package info.iamsh.reservation_filter.service;


import info.iamsh.reservation_filter.entity.ConditionEntity;
import info.iamsh.reservation_filter.entity.UserEntity;
import info.iamsh.reservation_filter.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Service
public class ReservationService {
    //LAYER 2)


    @Autowired
    private ReservationRepository reservationRepository;

    public List<ConditionEntity> findAll() {
        return reservationRepository.findAll();
    }


    public ConditionEntity set(ConditionEntity conditionEntity) {

        return reservationRepository.save(conditionEntity);
    }

    public List<ConditionEntity> getBy(UserEntity userEntity, Integer roomType) {

        LocalDate curDate = LocalDate.now();
        Integer age = Math.abs(Period.between(curDate,userEntity.getBirthDate().toLocalDate()).getYears());

        return reservationRepository.getBy(age, userEntity.getGender(), roomType);
    }
}
