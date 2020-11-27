package com.accp.dao.ty;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.accp.pojo.ty.VO;

public interface TYEmployeeDao {
	
	/**
	 * 通讯名录查询
	 * @param vo
	 * @return
	 */
	public List<VO> queryAllEmployee(@Param("name")String name);
	
	
	
}
