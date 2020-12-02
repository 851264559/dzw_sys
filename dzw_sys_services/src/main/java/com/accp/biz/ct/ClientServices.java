package com.accp.biz.ct;

import com.accp.dao.ct.ClientMapper;
import com.accp.dao.ct.VehicleMapper;
import com.accp.pojo.ct.Client;
import com.accp.pojo.ct.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServices {
    @Autowired
    private ClientMapper clientMapper;
    @Autowired
    private VehicleMapper vehicleMapper;

    /**
     * 查询所有的用户
     * @return
     */
    public List<Client> selectAllClient(){
        return clientMapper.selectAllClient();
    }

    /**
     * 新增用户表
     * @param client
     * @return
     */
    @Transactional
    public int insertClient(Client client){
        try {
            clientMapper.insertClient(client);
            if(client.getVehicles().size()>0){
                for (Vehicle vehicle:client.getVehicles()) {
                    vehicleMapper.insertSelective(vehicle);
                }
            }
            return 1;
        }catch (Exception e){
            return 0;
        }
    }

    /**
     * 删除用户表
     * @param id
     * @return
     */
    @Transactional
    public int removeClient(String id){
        return clientMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改用户表
     * @param client
     * @return
     */
    @Transactional
    public int updateClient(Client client){
        try {
            clientMapper.updateByPrimaryKeySelective(client);
            vehicleMapper.deleteByclientId(client.getCid());
            if(client.getVehicles().size()>0){
                for (Vehicle vehicle:client.getVehicles()) {
                    vehicleMapper.insertSelective(vehicle);
                }
            }
            return 1;
        }catch (Exception e){
            return 0;
        }
    }
}
