package com.zero.dag.service.impl;

import com.zero.dag.service.DagService;
import org.springframework.stereotype.Service;

@Service
public class DagThreeServiceImpl implements DagService {

    @Override
    public void sayhi() {
        System.out.println("this is service three sayhi");
    }
}
