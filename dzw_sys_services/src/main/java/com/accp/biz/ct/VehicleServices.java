package com.accp.biz.ct;

import com.accp.dao.ct.VehicleMapper;
import com.accp.pojo.ct.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServices {
    @Autowired
    private VehicleMapper mapperp;

    /**
     * 查询车资料
     * @return
     */
    public List<Vehicle> selectAllVehicle(){
        return mapperp.selectByPrimaryKey();
    }

    /**      
     * 根据主键id删除
     * @param id
     * @return
     */
    public int deleteByPrimaryKey(Integer id){
        return mapperp.deleteByPrimaryKey(id);
    }

    /**
     * 修改
     * @param vehicle
     * @return
     */
    public int updateByPrimaryKeySelective(Vehicle vehicle){
        return mapperp.updateByPrimaryKeySelective(vehicle);
    }
}
