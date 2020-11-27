package com.accp.dao.ty;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.accp.pojo.ty.VO;

public interface TYEmployeeDao {
	
	public List<VO> queryAllEmployee(@Param("vo")VO vo);
	
}
