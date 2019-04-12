package com.mapper;

import com.pojo.Airplane;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AirplaneMapper {
/**
 *根据起飞id 和 降落id 查询飞机
 * @author : yechaoze
 * @date : 2019/4/12 18:35
 * @param  takeid :
 * @param landid :
 * @return : java.util.List<com.pojo.Airplane>
 */
    List<Airplane> selByTakeidLandid(@Param("takeid") int takeid, @Param("landid") int landid);
}
