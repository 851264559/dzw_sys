package com.accp.dao.wzy;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.wzy.EngineType;

/**
 * ������Ʒ��Dao��
 * @author wzy
 *
 */
public interface IEngineTypeDao {
	
	//��ѯ���з�����Ʒ��
	List<EngineType> queryAll();
	
	//����������Ʒ��
	int addEngineType(@Param("engineType")EngineType engineType);
	
	//����idɾ��������Ʒ��
	int delEngineType(@Param("enginetypeid")Integer enginetypeid);
	
	//����Ʒ�����Ʋ�ѯ
	List<EngineType> queryEngineType(@Param("enginetypename")String enginetypename);
}
