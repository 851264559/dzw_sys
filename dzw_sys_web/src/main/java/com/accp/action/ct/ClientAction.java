package com.accp.action.ct;

import com.accp.biz.ct.ClientServices;
import com.accp.pojo.ct.Client;
import com.accp.vo.ct.ClientVo;
import com.accp.vo.ct.MemberVo;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientAction {
    @Autowired
    private ClientServices services;

    /**
     * 查询用户+车辆（一对多）
     * @return
     */
    @GetMapping("/selectAll")
    public List selectAllClient(){
        return services.selectAllClient();
    }

    /**
     * 新增用户
     * @param client
     * @return
     */
    @PostMapping("/add")
    public String addClient(@RequestBody Client client){
        if(services.insertClient(client)>0){
            return "true";
        }
        return "false";
    }

    /**
     * 查询会员
     * @param clientVo
     * @return
     */
    @PostMapping("/selectMember")
    public List<Client> selectMember(@RequestBody ClientVo clientVo){
        return services.selectMember(clientVo);
    }

    /**
     * 查询非会员和员工的用户
     * @return
     */
    @GetMapping("/selectMemberVo")
    public List<MemberVo> selectMemberVo(){
        return services.selectMemberVo();
    }
    /**
     * 删除用户
     * @param id
     * @return
     */
    @DeleteMapping("/removeClient/{id}")
    public String removeClient(@PathVariable String id){
        if(services.removeClient(id)>0){
            return "true";
        }
        return "false";
    }

    /**
     * 修改用户表
     * @param client
     * @return
     */
    @PutMapping("/updateClient")
    public String updateClient(@RequestBody Client client){
        if(services.updateClient(client)>0){
            return "true";
        }
        return "false";
    }
    /**
     * 修改用户表
     * @param client
     * @return
     */
    @PutMapping("/updateClient2")
    public String updateClient2(@RequestBody Client client){
        if(services.updateClient2(client)>0){
            return "true";
        }
        return "false";
    }

    /**
     * 会员操作
     * @param client
     * @return
     */
    @PutMapping("/updateMember")
    public String updateMember(@RequestBody Client client){
        if(services.updateMember(client)>0){
            return "true";
        }
        return "false";
    }

    @GetMapping("/selectByName/{name}")
    public Client selectByName(@PathVariable String name){
        return services.selectByName(name);
    }

}
