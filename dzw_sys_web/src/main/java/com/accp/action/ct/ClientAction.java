package com.accp.action.ct;

import com.accp.biz.ct.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api/client")
public class ClientAction {
    @Autowired
    private ClientServices services;
    @GetMapping("/selectAll")
    public List selectAllClient(){
        return services.selectAllClient();
    }
}
