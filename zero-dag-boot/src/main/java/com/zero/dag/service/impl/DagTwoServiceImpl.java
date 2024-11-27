package com.zero.dag.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DagTwoServiceImpl {

    DagThreeServiceImpl dagThreeServiceImpl;

    @Autowired
    public void setDagThreeServiceImpl(DagThreeServiceImpl dagThreeServiceImpl) {
        this.dagThreeServiceImpl = dagThreeServiceImpl;
    }

    public void sayhi() {
        System.out.println("this is service two sayhi");
    }

}
