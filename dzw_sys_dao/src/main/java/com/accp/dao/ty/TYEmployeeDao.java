package com.accp.dao.ty;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.pojo.ty.Dimissiontext;
import com.accp.pojo.ty.Employee;
import com.accp.pojo.ty.Ment;
import com.accp.pojo.ty.Employee;
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
	 * 修改员工
	 * @param employee
	 * @return
	 */
	@Update("UPDATE `employee` SET `yname`=#{employee.yname},`yaccount`=#{employee.yaccount},`ypwd`=#{employee.ypwd},`ysex`=#{employee.ysex},\r\n" + 
			" `ybirth`=#{employee.ybirth},`yphone`=#{employee.yphone},`ytel`=#{employee.ytel},`yaddress`=#{employee.yaddress},`yjphone`=#{employee.yjphone},\r\n" + 
			" `yjname`=#{employee.yjname},`ymoney`=#{employee.ymoney},`yrdate`=#{employee.yrdate},`yjsdate`=#{employee.yjsdate},`yhdate`=#{employee.yhdate},\r\n" + 
			" `yhjdate`=#{employee.yhjdate},`ymentid`=#{employee.ymentid},`ypostid`=#{employee.ypostid}\r\n" + 
			" WHERE `yid`=#{employee.yid}")
	public int updateEmployee(@Param("employee") Employee employee);
	
	/**
	 * 员工删除
	 * @param yid
	 * @return
	 */
	@Delete("DELETE FROM `employee` WHERE `yid`=#{yid}")
	public int deleteyid(@Param("yid") Integer yid);
	

	/**
	 *  登录
	 */
	public Employee login(@Param("yaccount")String yaccount,@Param("ypwd")String ypwd);
	
	/**
	 * 离职登记查询
	 * @return
	 */
	@Select("SELECT m.`bname`,p.`zname`,e.`yid`,e.`yname`,e.`ysex`,d.`ldate`,d.`lreason`\r\n" + 
			" FROM `employee` e\r\n" + 
			" INNER JOIN `ment` m ON m.`bid`=e.`ymentid`\r\n" + 
			" INNER JOIN `postb` p ON p.`zid`=e.`ypostid`\r\n" + 
			" INNER JOIN `dimissiontext` d ON d.`lid`=e.`yljlid`\r\n" + 
			" WHERE `yquitid`=1")
	public List<VO> queryAlltext();
	
	/**
	 * 离职登记回滚
	 * @param employee
	 * @return
	 */
	@Update("UPDATE `employee` SET `yquitid`=2 WHERE `yid`=#{yid}")
	public int updateText(@Param("yid") Integer yid);
	
	/**
	 * 查询离职登记新增里的部门姓名
	 * @return
	 */
	@Select("SELECT e.`yname` FROM `employee` e\r\n" + 
			" INNER JOIN `ment` m ON e.`ymentid`=m.`bid`\r\n" + 
			" WHERE e.`ymentid`=#{ymentid} and e.`yquitid`=2")
	public List<VO> queryMentxz(@Param("ymentid") Integer ymentid);
	
	/**
	 * 新增离职登记记录
	 * @param dimissiontext
	 * @return
	 */
	@Insert("INSERT INTO `dimissiontext` VALUE(0,#{lreason},NOW())")
	public int saveText(@Param("lreason") String lreason);
	
	@Update("UPDATE `employee` SET `yquitid`=1,`yljlid`=(SELECT lid FROM `dimissiontext` ORDER BY lid DESC LIMIT 1)\r\n" + 
			" WHERE `ymentid`=#{ymentid} AND `yname`=#{yname}")
	public int updateTextjl(@Param("ymentid") Integer ymentid,@Param("yname") String yname);
	
}
