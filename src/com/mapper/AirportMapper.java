package com.mapper;

import com.pojo.Airport;

import java.util.List;

public interface AirportMapper {
   /**
    *查询起飞机场
    * @author : yechaoze
    * @date : 2019/4/12 16:02
    * @return : java.util.List<com.pojo.Airport>
    */
    List<Airport> selTakePort();
    /**
     *查询降落机场
     * @author : yechaoze
     * @date : 2019/4/12 16:17
     * @return : java.util.List<com.pojo.Airport>
     */
    List<Airport> selLandPort();


}
