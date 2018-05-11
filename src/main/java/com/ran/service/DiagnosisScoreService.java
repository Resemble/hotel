package com.ran.service;

import com.ran.entity.DiagnosisScoreEntity;
import com.ran.mapper.DiagnosisScoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ranbo
 * @version V1.0
 * @Title:
 * @Package com.ran.service
 * @Description:
 * @date 2018/5/11 下午5:43
 */
@Service
public class DiagnosisScoreService {

    @Autowired private DiagnosisScoreMapper diagnosisScoreMapper;

    public List<DiagnosisScoreEntity> getAll() {
        return diagnosisScoreMapper.getAll();
    }

}
