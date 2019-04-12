package com.test;


import com.mapper.AirplaneMapper;
import com.mapper.AirportMapper;
import com.pojo.Airplane;
import com.pojo.Airport;
import com.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        SqlSession sqlSession = MyBatisUtil.getSession();
        AirplaneMapper airplaneMapper = sqlSession.getMapper(AirplaneMapper.class);
        List<Airplane> airplanes = airplaneMapper.selByTakeidLandid(5, 2);
        System.out.println(airplanes);
        MyBatisUtil.closeSession();
    }
}
