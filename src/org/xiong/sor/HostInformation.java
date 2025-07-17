package org.xiong.sor;

public class HostInformation {
    public static final int size = 140;
    public byte[] H_SN = new byte[20];
    public byte[] H_MFID = new byte[20];
    public byte[] H_OTDR = new byte[20];
    public byte[] H_OMID = new byte[20];
    public byte[] H_OMSN = new byte[20];
    public byte[] H_SR = new byte[20];
    public byte[] H_OT = new byte[20];

    public HostInformation() {
    }

    public void getBytes(byte[] buffer, int index) {
        byte[] tmpBuf = this.H_SN;
        System.arraycopy(tmpBuf, 0, buffer, index, tmpBuf.length);
        int pos = index + tmpBuf.length;
        tmpBuf = this.H_MFID;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.H_OTDR;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.H_OMID;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.H_OMSN;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.H_SR;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.H_OT;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        int var10000 = pos + tmpBuf.length;
    }

    public void from(byte[] buffer, int index) {
        System.arraycopy(buffer, index, this.H_SN, 0, this.H_SN.length);
        int pos = index + this.H_SN.length;
        System.arraycopy(buffer, pos, this.H_MFID, 0, this.H_MFID.length);
        pos += this.H_MFID.length;
        System.arraycopy(buffer, pos, this.H_OTDR, 0, this.H_OTDR.length);
        pos += this.H_OTDR.length;
        System.arraycopy(buffer, pos, this.H_OMID, 0, this.H_OMID.length);
        pos += this.H_OMID.length;
        System.arraycopy(buffer, pos, this.H_OMSN, 0, this.H_OMSN.length);
        pos += this.H_OMSN.length;
        System.arraycopy(buffer, pos, this.H_SR, 0, this.H_SR.length);
        pos += this.H_SR.length;
        System.arraycopy(buffer, pos, this.H_OT, 0, this.H_OT.length);
        int var10000 = pos + this.H_OT.length;
    }
}
