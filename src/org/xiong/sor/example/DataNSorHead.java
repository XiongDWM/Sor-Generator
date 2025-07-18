package org.xiong.sor.example;

public class DataNSorHead {
    public static final int size = 102;
    public long D_DataNum;
    public int D_ValWave;
    public double D_ValRange;
    public int D_ValPulse;
    public long D_TestTime;
    public double D_Ior;
    public double D_BC;
    public double D_DeltDis;
    public int D_LenUnit;
    public long D_DTS;
    public float D_SpAnaThre;
    public float D_ReturnLossThre;
    public float D_EndLossThre;
    public long[] D_Remain = new long[10];

    public DataNSorHead() {
    }

    public void getBytes(byte[] buffer, int index) {
        byte[] tmpBuf = BitConvert.getBytes((int) this.D_DataNum);
        System.arraycopy(tmpBuf, 0, buffer, index, tmpBuf.length);
        int pos = index + tmpBuf.length;
        tmpBuf = BitConvert.getBytes((short) this.D_ValWave);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.D_ValRange);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes((short) this.D_ValPulse);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes((int) this.D_TestTime);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.D_Ior);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.D_BC);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.D_DeltDis);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes((short) this.D_LenUnit);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes((int) this.D_DTS);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.D_SpAnaThre);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.D_ReturnLossThre);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.D_EndLossThre);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;

        for (int a = 0; a < this.D_Remain.length; ++a) {
            tmpBuf = BitConvert.getBytes((int) this.D_Remain[a]);
            System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
            pos += tmpBuf.length;
        }

    }

    public void from(byte[] buffer, int index) {
        this.D_DataNum = BitConvert.toInt64(buffer, index);
        int pos = index + 4;
        this.D_ValWave = BitConvert.toUInt16(buffer, pos);
        pos += 2;
        this.D_ValRange = BitConvert.toDouble(buffer, pos);
        pos += 8;
        this.D_ValPulse = BitConvert.toUInt16(buffer, pos);
        pos += 2;
        this.D_TestTime = BitConvert.toInt64(buffer, pos);
        pos += 4;
        this.D_Ior = BitConvert.toDouble(buffer, pos);
        pos += 8;
        this.D_BC = BitConvert.toDouble(buffer, pos);
        pos += 8;
        this.D_DeltDis = BitConvert.toDouble(buffer, pos);
        pos += 8;
        this.D_LenUnit = BitConvert.toInt32(buffer, pos);
        pos += 2;
        this.D_DTS = BitConvert.toInt64(buffer, pos);
        pos += 4;
        this.D_SpAnaThre = BitConvert.toSingle(buffer, pos);
        pos += 4;
        this.D_ReturnLossThre = BitConvert.toSingle(buffer, pos);
        pos += 4;
        this.D_EndLossThre = BitConvert.toSingle(buffer, pos);
        pos += 4;

        for (int a = 0; a < this.D_Remain.length; ++a) {
            this.D_Remain[a] = BitConvert.toInt64(buffer, pos);
            pos += 4;
        }

    }
}
