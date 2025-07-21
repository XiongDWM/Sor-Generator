package org.xiong.sor.blocks;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

public class GeneralParametersBlock {
    private String pdId="GenParams\\0";
    private String lc="CH"; // language code default chinese
    private String cid="\\0"; // cable id, default none
    private String fid="\\0"; // fiber id. defult none
    private short ft=652; // fiber type, 652=conventional smf
    private short nw=1310; // nominal wavelength
    private String ol="\\0";
    private String tl="\\0";
    private String ccd="\\0";
    private String cdf="RC"; // current data flag, three conditions: [NC,RC,OT]
    private long uo=0L; // user offset
    private long uod= 0L; // user offset distance
    private String op="\\0"; // operator
    private String cmt="\\0"; // comment

    public String getPdId() {
        return pdId;
    }

    public void setPdId(String pdId) {
        this.pdId = pdId;
    }

    public String getLc() {
        return lc;
    }

    public void setLc(String lc) {
        this.lc = lc;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public short getFt() {
        return ft;
    }

    public void setFt(short ft) {
        this.ft = ft;
    }

    public short getNw() {
        return nw;
    }

    public void setNw(short nw) {
        this.nw = nw;
    }

    public String getOl() {
        return ol;
    }

    public void setOl(String ol) {
        this.ol = ol;
    }

    public String getTl() {
        return tl;
    }

    public void setTl(String tl) {
        this.tl = tl;
    }

    public String getCcd() {
        return ccd;
    }

    public void setCcd(String ccd) {
        this.ccd = ccd;
    }

    public String getCdf() {
        return cdf;
    }

    public void setCdf(String cdf) {
        this.cdf = cdf;
    }

    public long getUo() {
        return uo;
    }

    public void setUo(long uo) {
        this.uo = uo;
    }

    public long getUod() {
        return uod;
    }

    public void setUod(long uod) {
        this.uod = uod;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }


    public byte[] toBytes() {
        ByteBuffer buffer = ByteBuffer.allocate(256).order(ByteOrder.BIG_ENDIAN);

        byte[] pdIdBytes = pdId.getBytes(StandardCharsets.UTF_8);
        buffer.put((byte)pdIdBytes.length);
        buffer.put(pdIdBytes);

        byte[] lcBytes = lc.getBytes(StandardCharsets.UTF_8);
        buffer.put((byte)lcBytes.length);
        buffer.put(lcBytes);

        byte[] cidBytes = cid.getBytes(StandardCharsets.UTF_8);
        buffer.put((byte)cidBytes.length);
        buffer.put(cidBytes);

        byte[] fidBytes = fid.getBytes(StandardCharsets.UTF_8);
        buffer.put((byte)fidBytes.length);
        buffer.put(fidBytes);

        buffer.putShort(ft);
        buffer.putShort(nw);

        byte[] olBytes = ol.getBytes(StandardCharsets.UTF_8);
        buffer.put((byte)olBytes.length);
        buffer.put(olBytes);

        byte[] tlBytes = tl.getBytes(StandardCharsets.UTF_8);
        buffer.put((byte)tlBytes.length);
        buffer.put(tlBytes);

        byte[] ccdBytes = ccd.getBytes(StandardCharsets.UTF_8);
        buffer.put((byte)ccdBytes.length);
        buffer.put(ccdBytes);

        byte[] cdfBytes = cdf.getBytes(StandardCharsets.UTF_8);
        buffer.put((byte)cdfBytes.length);
        buffer.put(cdfBytes);

        buffer.putLong(uo);
        buffer.putLong(uod);

        byte[] opBytes = op.getBytes(StandardCharsets.UTF_8);
        buffer.put((byte)opBytes.length);
        buffer.put(opBytes);

        byte[] cmtBytes = cmt.getBytes(StandardCharsets.UTF_8);
        buffer.put((byte)cmtBytes.length);
        buffer.put(cmtBytes);

        byte[] result = new byte[buffer.position()];
        buffer.flip();
        buffer.get(result);
        return result;
    }

}
