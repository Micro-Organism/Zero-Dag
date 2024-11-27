package com.zero.dag.controller;

import com.zero.dag.service.DagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class DagController {

    DagService dagService;

    @Autowired
    public void setDagService(@Qualifier("dagServiceImpl") DagService dagService) {
        this.dagService = dagService;
    }

    @RequestMapping("/hello")
    public Map<String, Object> showHelloWorld(){
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "HelloWorld");
        return map;
    }
}