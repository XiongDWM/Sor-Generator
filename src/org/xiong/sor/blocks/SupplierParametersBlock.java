package org.xiong.sor.blocks;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class SupplierParametersBlock {
    private String spId="SupParams\\0";
    private String sn="\\0";
    private String mfId="\\0";
    private String otdr="\\0";
    private String omId="\\0";
    private String omsn="\\0";
    private String sr="\\0";
    private String ot="\\0";

    public String getSpId() {
        return spId;
    }

    public void setSpId(String spId) {
        this.spId = spId;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getMfId() {
        return mfId;
    }

    public void setMfId(String mfId) {
        this.mfId = mfId;
    }

    public String getOtdr() {
        return otdr;
    }

    public void setOtdr(String otdr) {
        this.otdr = otdr;
    }

    public String getOmId() {
        return omId;
    }

    public void setOmId(String omId) {
        this.omId = omId;
    }

    public String getOmsn() {
        return omsn;
    }

    public void setOmsn(String omsn) {
        this.omsn = omsn;
    }

    public String getSr() {
        return sr;
    }

    public void setSr(String sr) {
        this.sr = sr;
    }

    public String getOt() {
        return ot;
    }

    public void setOt(String ot) {
        this.ot = ot;
    }

    public byte[] toBytes(){
        ByteBuffer buffer = ByteBuffer.allocate(256);
        byte[] spIdBytes = spId.getBytes(StandardCharsets.UTF_8);
        buffer.put((byte)spIdBytes.length);
        buffer.put(spIdBytes);
        byte[] snBytes = sn.getBytes(StandardCharsets.UTF_8);
        buffer.put((byte)snBytes.length);
        buffer.put(snBytes);    
        byte[] mfIdBytes = mfId.getBytes(StandardCharsets.UTF_8);
        buffer.put((byte)mfIdBytes.length);
        buffer.put(mfIdBytes);
        byte[] otdrBytes = otdr.getBytes(StandardCharsets.UTF_8);
        buffer.put((byte)otdrBytes.length);
        buffer.put(otdrBytes);
        byte[] omIdBytes = omId.getBytes(StandardCharsets.UTF_8);
        buffer.put((byte)omIdBytes.length);
        buffer.put(omIdBytes);
        byte[] omsnBytes = omsn.getBytes(StandardCharsets.UTF_8);
        buffer.put((byte)omsnBytes.length);
        buffer.put(omsnBytes);
        byte[] srBytes = sr.getBytes(StandardCharsets.UTF_8);
        buffer.put((byte)srBytes.length);
        buffer.put(srBytes);
        byte[] otBytes = ot.getBytes(StandardCharsets.UTF_8);
        buffer.put((byte)otBytes.length); 
        buffer.put(otBytes);
        byte[] result = new byte[buffer.position()];
        buffer.flip();
        buffer.get(result);
        return result;
    }
}
