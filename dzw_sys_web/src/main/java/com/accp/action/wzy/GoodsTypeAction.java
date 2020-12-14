package com.accp.action.wzy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.wzy.GoodsTypeBiz;
import com.accp.pojo.wzy.GoodsType;

@RestController
@RequestMapping("/api/goodstype")
public class GoodsTypeAction {

	@Autowired
	private GoodsTypeBiz biz;
	
	@GetMapping
	public List<GoodsType> queryAll() {
		return biz.queryAll();
	}
}
