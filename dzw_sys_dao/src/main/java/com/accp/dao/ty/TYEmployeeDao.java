package com.accp.dao.ty;
import java.util.List;

<<<<<<< HEAD
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.accp.pojo.ty.Employee;
import com.accp.pojo.ty.Ment;
=======
import com.accp.pojo.ty.Employee;
>>>>>>> 7d3bfb1e933ea2aef76f9783a1a2848c8df12726
import com.accp.pojo.ty.Postb;
import com.accp.pojo.ty.VO;

public interface TYEmployeeDao {
	
	/**
	 * 通讯名录查询
	 * @param vo
	 * @return
	 */
	public List<VO> queryAllEmployee(@Param("name")String name);
	
	/**
	 * 组织机构右侧查询
	 */
	public List<VO> queryAllVO(@Param("bid")Integer bid);
	
	/**
<<<<<<< HEAD
	 * 部门下拉框绑定
	 * @return
	 */
	@Select("SELECT * FROM `ment`")
	public List<Ment> queryAllMent();
	
	/**
	 * 职位下拉框绑定
	 * @return
	 */
	@Select("SELECT * FROM `postb`")
	public List<Postb> queryAllPostb();
	
	/**
	 * 新增员工
	 * @param edocentry
	 * @return
	 */
	@Insert("INSERT INTO `employee`(`yname`,`yaccount`,`ypwd`,`ysex`,`ybirth`,`yphone`,`ytel`,`yaddress`,`yjphone`,`yjname`,`ymoney`,`yrdate`,`yjsdate`,`yhdate`,`yhjdate`,`ymentid`,`ypostid`)\r\n" + 
			" VALUE(#{employee.yname},#{employee.yaccount},#{employee.ypwd},#{employee.ysex},#{employee.ybirth},#{employee.yphone},#{employee.ytel},#{employee.yaddress},#{employee.yjphone},#{employee.yjname},#{employee.ymoney},\r\n" + 
			" #{employee.yrdate},#{employee.yjsdate},#{employee.yhdate},#{employee.yhjdate},#{employee.ymentid},#{employee.ypostid})")
	public int saveEdocentry(@Param("employee") Employee employee);
	
	/**
	 * 修改员工查询
	 * @param id
	 * @return
	 */
	@Select("SELECT * FROM `employee` WHERE `yid`=#{yid}")
	public Employee loadEmployee(@Param("yid") Integer yid);
	
	/**
	 * 员工删除
	 * @param yid
	 * @return
	 */
	@Delete("DELETE FROM `employee` WHERE `yid`=#{yid}")
	public int deleteyid(@Param("yid") Integer yid);
=======
	 * 登录
	 */
	public Employee login(@Param("yaccount")String yaccount,@Param("ypwd")String ypwd);
>>>>>>> 7d3bfb1e933ea2aef76f9783a1a2848c8df12726
	
}
