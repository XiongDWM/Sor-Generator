package org.xiong.sor.example;

public class EventInformation {
    public static final int size = 4602;
    public int E_Num;
    public long[] E_Index = new long[100];
    public float[] E_Distance = new float[100];
    public int[] E_Type = new int[100];
    public float[] E_AverageLoss = new float[100];
    public float[] E_SpliceLoss = new float[100];
    public float[] E_ReturnLoss = new float[100];
    public float[] E_LinkLoss = new float[100];
    public long[] E_Index_MLn = new long[500];

    public EventInformation() {
    }

    public void getBytes(byte[] buffer, int index) {
        byte[] tmpBuf = BitConvert.getBytes((short) this.E_Num);
        System.arraycopy(tmpBuf, 0, buffer, index, tmpBuf.length);
        int pos = index + tmpBuf.length;

        int a;
        for (a = 0; a < this.E_Index.length; ++a) {
            tmpBuf = BitConvert.getBytes((int) this.E_Index[a]);
            System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
            pos += tmpBuf.length;
        }

        for (a = 0; a < this.E_Distance.length; ++a) {
            tmpBuf = BitConvert.getBytes(this.E_Distance[a]);
            System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
            pos += tmpBuf.length;
        }

        for (a = 0; a < this.E_Type.length; ++a) {
            tmpBuf = BitConvert.getBytes((short) this.E_Type[a]);
            System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
            pos += tmpBuf.length;
        }

        for (a = 0; a < this.E_AverageLoss.length; ++a) {
            tmpBuf = BitConvert.getBytes(this.E_AverageLoss[a]);
            System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
            pos += tmpBuf.length;
        }

        for (a = 0; a < this.E_SpliceLoss.length; ++a) {
            tmpBuf = BitConvert.getBytes(this.E_SpliceLoss[a]);
            System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
            pos += tmpBuf.length;
        }

        for (a = 0; a < this.E_ReturnLoss.length; ++a) {
            tmpBuf = BitConvert.getBytes(this.E_ReturnLoss[a]);
            System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
            pos += tmpBuf.length;
        }

        for (a = 0; a < this.E_LinkLoss.length; ++a) {
            tmpBuf = BitConvert.getBytes(this.E_LinkLoss[a]);
            System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
            pos += tmpBuf.length;
        }

        for (a = 0; a < this.E_Index_MLn.length; ++a) {
            tmpBuf = BitConvert.getBytes((int) this.E_Index_MLn[a]);
            System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
            pos += tmpBuf.length;
        }

    }

    public void from(byte[] buffer, int index) {
        this.E_Num = BitConvert.toInt32(buffer, index);
        int pos = index + 2;

        int a;
        for (a = 0; a < this.E_Index.length; ++a) {
            this.E_Index[a] = BitConvert.toInt64(buffer, pos);
            pos += 4;
        }

        for (a = 0; a < this.E_Distance.length; ++a) {
            this.E_Distance[a] = BitConvert.toSingle(buffer, pos);
            pos += 4;
        }

        for (a = 0; a < this.E_Type.length; ++a) {
            this.E_Type[a] = BitConvert.toInt32(buffer, pos);
            pos += 2;
        }

        for (a = 0; a < this.E_AverageLoss.length; ++a) {
            this.E_AverageLoss[a] = BitConvert.toSingle(buffer, pos);
            pos += 4;
        }

        for (a = 0; a < this.E_SpliceLoss.length; ++a) {
            this.E_SpliceLoss[a] = BitConvert.toSingle(buffer, pos);
            pos += 4;
        }

        for (a = 0; a < this.E_ReturnLoss.length; ++a) {
            this.E_ReturnLoss[a] = BitConvert.toSingle(buffer, pos);
            pos += 4;
        }

        for (a = 0; a < this.E_LinkLoss.length; ++a) {
            this.E_LinkLoss[a] = BitConvert.toSingle(buffer, pos);
            pos += 4;
        }

        for (a = 0; a < this.E_Index_MLn.length; ++a) {
            this.E_Index_MLn[a] = BitConvert.toInt64(buffer, pos);
            pos += 4;
        }

    }

    public EventInformation clone() {
        EventInformation res = new EventInformation();
        res.E_Num = this.E_Num;

        for (int a = 0; a < this.E_Num; ++a) {
            res.E_Index[a] = this.E_Index[a];
            res.E_Distance[a] = this.E_Distance[a];
            res.E_Type[a] = this.E_Type[a];
            res.E_AverageLoss[a] = this.E_AverageLoss[a];
            res.E_SpliceLoss[a] = this.E_SpliceLoss[a];
            res.E_ReturnLoss[a] = this.E_ReturnLoss[a];
            res.E_LinkLoss[a] = this.E_LinkLoss[a];

            for (int b = 0; b < 5; ++b) {
                res.E_Index_MLn[a * 5 + b] = this.E_Index_MLn[a * 5 + b];
            }
        }

        return res;
    }

    public void clear() {
        for (int a = 0; a < this.E_Num; ++a) {
            this.E_Index[a] = -1L;
            this.E_Distance[a] = 0.0F;
            this.E_Type[a] = -1;
            this.E_AverageLoss[a] = 0.0F;
            this.E_SpliceLoss[a] = 0.0F;
            this.E_ReturnLoss[a] = 0.0F;
            this.E_LinkLoss[a] = 0.0F;

            for (int b = 0; b < 5; ++b) {
                this.E_Index_MLn[a * 5 + b] = 0L;
            }
        }

        this.E_Num = 0;
    }
}
