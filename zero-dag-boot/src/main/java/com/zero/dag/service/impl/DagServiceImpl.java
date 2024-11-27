package com.zero.dag.service.impl;

import com.zero.dag.service.DagService;
import org.springframework.stereotype.Service;

@Service
public class DagServiceImpl implements DagService {

    @Override
    public void sayhi() {
        System.out.println("this is service one sayhi");
    }

}
