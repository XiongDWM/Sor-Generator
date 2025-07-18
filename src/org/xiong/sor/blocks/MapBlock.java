package org.xiong.sor.blocks;

public class MapBlock {
    static class BlockMeta{
        String bid; // block id
        int reversionId=0; // unsigned short
        long size=0;
    }
    private String mbId="Map\\0";
    private int mrn=0; // unsigned short
    private long mbs=0L;
    private short nb=5;
    private BlockMeta[] metaInfo;

    public String getMbId() {
        return mbId;
    }

    public void setMbId(String mbId) {
        this.mbId = mbId;
    }

    public int getMrn() {
        return mrn;
    }

    public void setMrn(int mrn) {
        this.mrn = mrn;
    }

    public long getMbs() {
        return mbs;
    }

    public void setMbs(long mbs) {
        this.mbs = mbs;
    }

    public short getNb() {
        return nb;
    }

    public void setNb(short nb) {
        this.nb = nb;
    }

    public BlockMeta[] getMetaInfo() {
        return metaInfo;
    }

    public void setMetaInfo(BlockMeta[] metaInfo) {
        this.metaInfo = metaInfo;
    }
}
