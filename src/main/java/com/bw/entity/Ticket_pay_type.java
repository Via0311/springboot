package com.bw.entity;

import java.io.Serializable;

public class Ticket_pay_type implements Serializable {

    private Integer tid;
    private Integer ptid;

    public Integer getTid() {
        return tid;
    }

    public Integer getPtid() {
        return ptid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public void setPtid(Integer ptid) {
        this.ptid = ptid;
    }

    @Override
    public String toString() {
        return "Ticket_pay_type{" +
                "tid=" + tid +
                ", ptid=" + ptid +
                '}';
    }
}
