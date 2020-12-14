package com.accp.action.cwl;

import com.accp.vo.ct.CloseanaccountVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.accp.biz.cwl.closeanaccountBiz;
import com.accp.pojo.cwl.closeanaccount;

import java.util.*;

@RestController
@RequestMapping("/api/dzw_Sys/cwl/closeanaccount")
public class closeanaccountAction {

    @Autowired
    private closeanaccountBiz cBiz;

    /**
     * 新增
     *
     * @param record
     * @return
     */
    @PostMapping("/add")
    public Integer addSelective(@RequestBody closeanaccount record) {
        return cBiz.addSelective(record);
    }

    /**
     * 新增
     *
     * @param cc
     * @return
     */
    @PostMapping("/selectAll")
    public List<closeanaccount> selectAll(@RequestBody CloseanaccountVO cc) {
        return cBiz.selectAll(cc);
    }

    /**
     * 修改
     *
     * @param closeanaccount
     * @return
     */
    @PutMapping("/update")
    public boolean updateZhuangtai(@RequestBody closeanaccount closeanaccount) {
        if (cBiz.updateZhuangtai(closeanaccount) > 0) {
            return true;
        }
        return false;
    }

    /**
     * 查询主页
     * @return
     */
    @GetMapping("/selectCount")
    public Map<String, Integer> selectCount() {
        return cBiz.selectCount();
    }
}
