package com.bw.entity;

import java.io.Serializable;

public class Ticket_info implements Serializable {

    protected Integer tid;
    protected String tname;
    protected Integer vid;
    protected Double tprice;
    protected Integer tstatus;
    protected String tpicture;
    protected String tcreatetime;
    protected String tupdatetime;
    protected Integer tdiscount;

    public Integer getTid() {
        return tid;
    }

    public String getTname() {
        return tname;
    }

    public Integer getVid() {
        return vid;
    }

    public Double getTprice() {
        return tprice;
    }

    public Integer getTstatus() {
        return tstatus;
    }

    public String getTpicture() {
        return tpicture;
    }

    public String getTcreatetime() {
        return tcreatetime;
    }

    public String getTupdatetime() {
        return tupdatetime;
    }

    public Integer getTdiscount() {
        return tdiscount;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public void setTprice(Double tprice) {
        this.tprice = tprice;
    }

    public void setTstatus(Integer tstatus) {
        this.tstatus = tstatus;
    }

    public void setTpicture(String tpicture) {
        this.tpicture = tpicture;
    }

    public void setTcreatetime(String tcreatetime) {
        this.tcreatetime = tcreatetime;
    }

    public void setTupdatetime(String tupdatetime) {
        this.tupdatetime = tupdatetime;
    }

    public void setTdiscount(Integer tdiscount) {
        this.tdiscount = tdiscount;
    }

    @Override
    public String toString() {
        return "Ticket_info{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", vid=" + vid +
                ", tprice=" + tprice +
                ", tstatus=" + tstatus +
                ", tpicture='" + tpicture + '\'' +
                ", tcreatetime='" + tcreatetime + '\'' +
                ", tupdatetime='" + tupdatetime + '\'' +
                ", tdiscount=" + tdiscount +
                '}';
    }
}
