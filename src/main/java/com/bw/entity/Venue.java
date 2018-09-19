package com.bw.entity;

import java.io.Serializable;

public class Venue implements Serializable {


   private  Integer vid;
   private  String vname;

    public Integer getVid() {
        return vid;
    }

    public String getVname() {
        return vname;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "vid=" + vid +
                ", vname='" + vname + '\'' +
                '}';
    }
}
