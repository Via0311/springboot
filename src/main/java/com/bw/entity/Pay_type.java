package com.bw.entity;

import java.io.Serializable;

public class Pay_type implements Serializable {

    private Integer ptid;
    private String ptname;

    public Integer getPtid() {
        return ptid;
    }

    public String getPtname() {
        return ptname;
    }

    public void setPtid(Integer ptid) {
        this.ptid = ptid;
    }

    public void setPtname(String ptname) {
        this.ptname = ptname;
    }

    @Override
    public String toString() {
        return "Pay_type{" +
                "ptid=" + ptid +
                ", ptname='" + ptname + '\'' +
                '}';
    }
}
