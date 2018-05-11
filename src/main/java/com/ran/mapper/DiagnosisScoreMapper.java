package com.ran.mapper;

import com.ran.entity.DiagnosisScoreEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ranbo
 * @version V1.0
 * @Title:
 * @Package com.ran.mapper
 * @Description:
 * @date 2018/5/11 下午5:38
 */
@Component
public interface DiagnosisScoreMapper {

    @Select("SELECT datekey, room_night, intention_unique_visitor, intention_pay_rate, close_lose_rate, has_house_rate, competition_situation FROM diagnosis_score")
    List<DiagnosisScoreEntity> getAll();

}
