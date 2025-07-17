package org.xiong.sor;

public class FiberInformation {
    public static final int size = 302;
    public byte[] F_CID = new byte[20];
    public byte[] F_FID = new byte[20];
    public int F_FT;
    public byte[] F_OL = new byte[40];
    public byte[] F_TL = new byte[40];
    public byte[] F_CCode = new byte[20];
    public byte[] F_CDF = new byte[2];
    public long F_UO;
    public long F_UOD;
    public byte[] F_Operator = new byte[30];
    public byte[] F_Mask = new byte[20];
    public byte[] F_CMT = new byte[100];

    public FiberInformation() {
    }

    public void getBytes(byte[] buffer, int index) {
        byte[] tmpBuf = this.F_CID;
        System.arraycopy(tmpBuf, 0, buffer, index, tmpBuf.length);
        int pos = index + tmpBuf.length;
        tmpBuf = this.F_FID;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes((short)this.F_FT);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.F_OL;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.F_TL;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.F_CCode;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.F_CDF;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes((int)this.F_UO);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes((int)this.F_UOD);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.F_Operator;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.F_Mask;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.F_CMT;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        int var10000 = pos + tmpBuf.length;
    }

    public void from(byte[] buffer, int index) {
        System.arraycopy(buffer, index, this.F_CID, 0, this.F_CID.length);
        int pos = index + this.F_CID.length;
        System.arraycopy(buffer, pos, this.F_FID, 0, this.F_FID.length);
        pos += this.F_FID.length;
        this.F_FT = BitConvert.toUInt16(buffer, pos);
        pos += 2;
        System.arraycopy(buffer, pos, this.F_OL, 0, this.F_OL.length);
        pos += this.F_OL.length;
        System.arraycopy(buffer, pos, this.F_TL, 0, this.F_TL.length);
        pos += this.F_TL.length;
        System.arraycopy(buffer, pos, this.F_CCode, 0, this.F_CCode.length);
        pos += this.F_CCode.length;
        System.arraycopy(buffer, pos, this.F_CDF, 0, this.F_CDF.length);
        pos += this.F_CDF.length;
        this.F_UO = BitConvert.toInt64(buffer, pos);
        pos += 4;
        this.F_UOD = BitConvert.toInt64(buffer, pos);
        pos += 4;
        System.arraycopy(buffer, pos, this.F_Operator, 0, this.F_Operator.length);
        pos += this.F_Operator.length;
        System.arraycopy(buffer, pos, this.F_Mask, 0, this.F_Mask.length);
        pos += this.F_Mask.length;
        System.arraycopy(buffer, pos, this.F_CMT, 0, this.F_CMT.length);
        int var10000 = pos + this.F_CMT.length;
    }
}
