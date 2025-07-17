package org.xiong.sor.blocks;

public class PtsBlock {
    private String dpid="DataPts\\0";
    private long tndp;
    private short tsf=1;
    private int[] sf; // 序列化的时候需要转为无符号short

    public String getDpid() {
        return dpid;
    }

    public void setDpid(String dpid) {
        this.dpid = dpid;
    }

    public long getTndp() {
        return tndp;
    }

    public void setTndp(long tndp) {
        this.tndp = tndp;
    }

    public short getTsf() {
        return tsf;
    }

    public void setTsf(short tsf) {
        this.tsf = tsf;
    }

    public int[] getSf() {
        return sf;
    }

    public void setSf(int[] sf) {
        this.sf = sf;
    }
}
