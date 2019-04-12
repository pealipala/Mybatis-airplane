package com.service.impl;

import com.mapper.AirportMapper;
import com.pojo.Airport;
import com.service.AirportService;
import com.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class AirportServiceImpl implements AirportService {
    @Override
    public List<Airport> showTakePort() {
        SqlSession sqlSession = MyBatisUtil.getSession();
        AirportMapper airportMapper = sqlSession.getMapper(AirportMapper.class);
        return airportMapper.selTakePort();
    }

    @Override
    public List<Airport> showLandPort() {
        SqlSession sqlSession = MyBatisUtil.getSession();
        AirportMapper airportMapper = sqlSession.getMapper(AirportMapper.class);
        return airportMapper.selLandPort();
    }
}
