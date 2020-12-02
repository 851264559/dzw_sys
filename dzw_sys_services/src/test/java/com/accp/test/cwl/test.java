package com.accp.test.cwl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.cwl.fieldOfVehicleBiz;
import com.accp.biz.cwl.testBiz;
import com.accp.biz.cwl.testOnCompletionBiz;
import com.accp.pojo.cwl.staremployees;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-ctx.xml")
public class test {
			
			@Autowired
			private testBiz tBiz;
			
			@Autowired
			private fieldOfVehicleBiz fBiz;
			
			@Autowired
			private testOnCompletionBiz tOCBiz;
			
			@Test
			public void test() {
				fBiz.queryFieldOfVehicle().forEach(infos->{
					System.out.println(infos.toString());
				});
			}
			
			@Test
			public void testAdd() {
				System.out.println(tBiz.add(new staremployees(5,4,4,(float)4.5)));
			}
			
		/*	@Test
			public void testQueryInfo() {
				tOCBiz.queryInfos().forEach(infos->{
					System.out.println(infos.toString());
				});
			}*/
			
			
			
}
