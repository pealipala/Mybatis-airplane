package com.service.impl;

import com.mapper.AirplaneMapper;
import com.pojo.Airplane;
import com.service.AirplaneService;
import com.utils.MyBatisUtil;

import java.util.List;

public class AirplaneServiceImpl implements AirplaneService {
    @Override
    public List<Airplane> show(int takeid, int landid) {
        return MyBatisUtil.getSession().getMapper(AirplaneMapper.class).selByTakeidLandid(takeid, landid);
    }
}
