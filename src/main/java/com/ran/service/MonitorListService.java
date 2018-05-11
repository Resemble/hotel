package com.ran.service;

import com.ran.entity.MonitorListEntity;
import com.ran.mapper.MonitorListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ranbo
 * @version V1.0
 * @Title:
 * @Package com.ran.service
 * @Description:
 †
 */
@Service
public class MonitorListService {

    @Autowired MonitorListMapper monitorListMapper;

    public List<MonitorListEntity> getAll() {
        return monitorListMapper.getAll();
    }

}
