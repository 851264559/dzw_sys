package com.accp.dao.ct;

import com.accp.pojo.ct.Vehicle;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VehicleMapper {
    /**
     * 根据主表id删除从表1
     * @param vid
     * @return
     */
    int deleteByclientId(@Param("vid") String vid);

    /**
     * 根据主键id删除
     * @param vid
     * @return
     */
    int deleteByPrimaryKey(@Param("vid") Integer vid);

    /**
     * 新增，可多个新增
     * @param record
     * @return
     */
    int insertSelective(Vehicle record);

    /**
     * 查询车，（多对一）
     * @return
     */
    List<Vehicle> selectByPrimaryKey();

    /**
     * 修改车资料
     * updateByPrimaryKeySelective
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Vehicle record);
}