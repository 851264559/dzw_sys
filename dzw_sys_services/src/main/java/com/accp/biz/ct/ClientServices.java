package com.accp.biz.ct;

import com.accp.dao.ct.ClientMapper;
import com.accp.dao.ct.VehicleMapper;
import com.accp.pojo.ct.Client;
import com.accp.pojo.ct.Vehicle;
import com.accp.vo.ct.ClientVo;
import com.accp.vo.ct.MemberVo;
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
     * 查询会员
     * @param clientVo
     * @return
     */
    public List<Client> selectMember(ClientVo clientVo){
        return clientMapper.selectMember(clientVo);
    }

    /**
     * 查询非会员和员工的用户
     * @return
     */
    public List<MemberVo> selectMemberVo(){
        return clientMapper.selectMemberVo();
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
    /**
     * 修改用户表
     * @param client
     * @return
     */
    @Transactional
    public int updateClient2(Client client){
        try {
            clientMapper.updateByPrimaryKeySelective(client);
            return 1;
        }catch (Exception e){
            return 0;
        }
    }
    /**
     * 会员操作
     * @param client
     * @return
     */
    @Transactional
    public int updateMember(Client client){
        return clientMapper.updateMember(client);
    }

    /**
     * 根据姓名查询
     * @param name
     * @return
     */
    public Client selectByName(String name){
        return clientMapper.selectByName(name);
    }
}
