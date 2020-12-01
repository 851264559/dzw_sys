package com.accp.dao.ct;

import com.accp.pojo.ct.Client;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClientMapper {

    /**
     * 删除用户信息和车辆（一对多删除）
     * @param cid
     * @return
     */
    int deleteByPrimaryKey(@Param("cid") String cid);

    /**
     * 新增用户信息表+车资料
     * @param record
     * @return
     */
    int insertClient(Client record);


    /**
     * 查询用户（采用一对多，一个用户可以有多个车）
     * @return
     */
    List<Client> selectAllClient();

    /**
     * 修改用户
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Client record);
}