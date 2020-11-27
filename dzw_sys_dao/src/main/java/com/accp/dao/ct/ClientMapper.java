package com.accp.dao.ct;

import com.accp.pojo.ct.Client;
import java.util.*;

public interface ClientMapper {
    int deleteByPrimaryKey(String cid);

    int insert(Client record);

    int insertSelective(Client record);

    /**
     * 查询用户（采用一对多，一个用户可以有多个车）
     * @return
     */
    List<Client> selectAllClient();

    int updateByPrimaryKeySelective(Client record);

    int updateByPrimaryKey(Client record);
}