package com.service;

import com.pojo.Airport;

import java.util.List;

public interface AirportService {
    /**
     *
     * @author : yechaoze
     * @date : 2019/4/12 16:15
    显示所有起飞机场
     * @return : java.util.List<com.pojo.Airport>
     */
    List<Airport> showTakePort();
    /**
     *
     * @author : yechaoze
     * @date : 2019/4/12 16:16
        显示所有降落机场
     * @return : java.util.List<com.pojo.Airport>
     */
    List<Airport> showLandPort();
}
