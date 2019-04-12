package com.service;

import com.pojo.Airplane;

import java.util.List;

public interface AirplaneService {
    /**
     * @author : yechaoze
     * @date : 2019/4/12 20:10
     * @param takeid :
     * @param landid :
     * @return : java.util.List<com.pojo.Airplane>
     */
    List<Airplane> show(int takeid,int landid);
}
