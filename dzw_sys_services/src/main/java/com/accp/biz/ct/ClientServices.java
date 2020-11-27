package com.accp.biz.ct;

import com.accp.dao.ct.ClientMapper;
import com.accp.pojo.ct.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ClientServices {
    @Autowired
    private ClientMapper clientMapper;

    /**
     * 查询所有的用户
     * @return
     */
    public List<Client> selectAllClient(){
        return clientMapper.selectAllClient();
    }
}
