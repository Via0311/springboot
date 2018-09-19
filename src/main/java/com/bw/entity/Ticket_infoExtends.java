package com.bw.entity;

import java.util.Arrays;

public class Ticket_infoExtends extends Ticket_info {

    private String ptids;
    private String ptnames;
    private String vname;
    private Integer ids[];

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }

    public Integer[] getIds() {
        return ids;
    }

    public String getPtids() {
        return ptids;
    }

    public String getPtnames() {
        return ptnames;
    }

    public String getVname() {
        return vname;
    }

    public void setPtids(String ptids) {
        this.ptids = ptids;
    }

    public void setPtnames(String ptnames) {
        this.ptnames = ptnames;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    @Override
    public String toString() {
        return "Ticket_infoExtends{" +
                "ptids='" + ptids + '\'' +
                ", ptnames='" + ptnames + '\'' +
                ", vname='" + vname + '\'' +
                ", ids=" + Arrays.toString(ids) +
                '}';
    }
}
