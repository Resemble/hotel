package com.ran.mapper;

import com.ran.entity.MonitorListEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ranbo
 * @version V1.0
 * @Title:
 * @Package com.ran.mapper
 * @Description:
 * @date 2018/5/11 下午7:53
 */
@Component
public interface MonitorListMapper {


    @Select("SELECT datekey, room_night, cross_income, high_star_room_night, high_star_cross_income, intention_unique_visitor, intention_pay_rate, pay_user_cnt, close_lose_rate, has_house_rate, original_lose_rate, fact_lose_rate, competition_situation FROM monitor_list")
    List<MonitorListEntity> getAll();


}
