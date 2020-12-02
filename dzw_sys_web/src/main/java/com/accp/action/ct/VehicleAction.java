package com.accp.action.ct;

import com.accp.biz.ct.VehicleServices;
import com.accp.pojo.ct.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleAction {
    @Autowired
    private VehicleServices services;
    @GetMapping("/queryAll")
    public List<Vehicle> queryAllVehicle(){
        return services.selectAllVehicle();
    }
    @DeleteMapping("/removeVehicle/{id}")
    public String removeVehicle(@PathVariable Integer id){
        if(services.deleteByPrimaryKey(id)>0){
            return "true";
        }
        return "false";
    }
    @PutMapping("/updateVehicle")
    public String updateVehicle(@RequestBody Vehicle vehicle){
        if(services.updateByPrimaryKeySelective(vehicle)>0){
            return "true";
        }
        return "false";
    }
}
