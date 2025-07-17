package org.xiong.sor;

public class DataNHeadElse {
    public static final int size = 4256;
    public int D_TagCorp;
    public int D_Mode;
    public int D_ValAtt;
    public int D_ItemCode;
    public int D_Resolution;
    public long UO_ReceiveFiber;
    public long UOD_ReceiveFiber;
    public long UO_ExtendFiber;
    public long UOD_ExtendFiber;
    public float Power_ExtendFiber;
    public float EventLoss_ExtendFiber;
    public double[] Val_LongitudeAndLatitude = new double[2];
    public long[] Index_MarkLineAB = new long[2];
    public long[] D_OT_Remain = new long[11];
    public byte[] D_CorpTag = new byte[20];
    public float D_Val_Temperature;
    public float D_Val_Humidity;
    public short D_Tag_Use_MacroBending;
    public short[] D_Val_Wave_MacroBending = new short[2];
    public float D_Val_Diff_MacroBending;
    public short D_Tag_PF_SpliceLoss;
    public float D_Thre_PF_SpliceLoss;
    public short D_Tag_PF_ConnectorLoss;
    public float D_Thre_PF_ConnectorLoss;
    public short D_Tag_PF_SplitterLoss;
    public float[] D_Thre_PF_SplitterLoss = new float[8];
    public short D_Tag_PF_Reflectance;
    public float D_Thre_PF_Reflectance;
    public short D_Tag_PF_SectionAttenuation;
    public float D_Thre_PF_SectionAttenuation;
    public short D_Tag_PF_TotalLoss;
    public float D_Thre_PF_TotalLoss;
    public short D_Tag_PF_TotalLength;
    public float D_Thre_PF_TotalLength;
    public short D_Tag_PF_TotalORL;
    public float D_Thre_PF_TotalORL;
    public long[] D_Thre_PF_Remain = new long[10];
    public byte[] Name_Device = new byte[20];
    public byte[] Module_Device = new byte[10];
    public byte[] Else_Device = new byte[60];
    public long DTS_Calibration;
    public short TimeZone;
    public byte[] Version_Hardware = new byte[20];
    public byte[] Version_Software = new byte[20];
    public byte[] Version_Algorithm = new byte[20];
    public byte[] Version_System = new byte[20];
    public byte[] Version_FPGA = new byte[20];
    public byte[] Version_Else = new byte[60];
    public byte[] Task_Save = new byte[30];
    public byte[] Company_Save = new byte[30];
    public byte[] Customer_Save = new byte[30];
    public byte[] OperatorA_Save = new byte[30];
    public byte[] OperatorB_Save = new byte[30];
    public byte[] Note_Save = new byte[100];
    public byte[] LocationA_Save = new byte[30];
    public byte[] LocationB_Save = new byte[30];
    public short Direction_Save;
    public byte[] Else_Save = new byte[100];
    public short Result_LCat;
    public float Widen_LCat;
    public float Distance_Widen_LCat;
    public float Widen_Fracture_LCat;
    public byte[] Else_LCat = new byte[40];
    public int Num_Event_Extra;
    public short[] Property_Exent_Extra = new short[10];
    public int[] Index_Event_Extra = new int[10];
    public short[] Type_Event_Extra = new short[10];
    public float[] Distance_Event_Extra = new float[10];
    public float[] ReturnLoss_Event_Extra = new float[10];
    public byte[] D_Else_Remain = new byte[3114];

    public DataNHeadElse() {
    }

    public void getBytes(byte[] buffer, int index) {
        byte[] tmpBuf = BitConvert.getBytes((short)this.D_TagCorp);
        System.arraycopy(tmpBuf, 0, buffer, index, tmpBuf.length);
        int pos = index + tmpBuf.length;
        tmpBuf = BitConvert.getBytes((short)this.D_Mode);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes((short)this.D_ValAtt);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes((short)this.D_ItemCode);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes((short)this.D_Resolution);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.UO_ReceiveFiber);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.UOD_ReceiveFiber);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.UO_ExtendFiber);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.UOD_ExtendFiber);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.Power_ExtendFiber);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.EventLoss_ExtendFiber);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;

        int a;
        for(a = 0; a < this.Val_LongitudeAndLatitude.length; ++a) {
            tmpBuf = BitConvert.getBytes(this.Val_LongitudeAndLatitude[a]);
            System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
            pos += tmpBuf.length;
        }

        for(a = 0; a < this.Index_MarkLineAB.length; ++a) {
            tmpBuf = BitConvert.getBytes(this.Index_MarkLineAB[a]);
            System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
            pos += tmpBuf.length;
        }

        for(a = 0; a < this.D_OT_Remain.length; ++a) {
            tmpBuf = BitConvert.getBytes(this.D_OT_Remain[a]);
            System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
            pos += tmpBuf.length;
        }

        tmpBuf = this.D_CorpTag;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.D_Val_Temperature);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.D_Val_Humidity);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.D_Tag_Use_MacroBending);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;

        for(a = 0; a < this.D_Val_Wave_MacroBending.length; ++a) {
            tmpBuf = BitConvert.getBytes(this.D_Val_Wave_MacroBending[a]);
            System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
            pos += tmpBuf.length;
        }

        tmpBuf = BitConvert.getBytes(this.D_Val_Diff_MacroBending);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.D_Tag_PF_SpliceLoss);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.D_Thre_PF_SpliceLoss);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.D_Tag_PF_ConnectorLoss);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.D_Thre_PF_ConnectorLoss);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.D_Tag_PF_SplitterLoss);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;

        for(a = 0; a < this.D_Thre_PF_SplitterLoss.length; ++a) {
            tmpBuf = BitConvert.getBytes(this.D_Thre_PF_SplitterLoss[a]);
            System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
            pos += tmpBuf.length;
        }

        tmpBuf = BitConvert.getBytes(this.D_Tag_PF_Reflectance);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.D_Thre_PF_Reflectance);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.D_Tag_PF_SectionAttenuation);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.D_Thre_PF_SectionAttenuation);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.D_Tag_PF_TotalLoss);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.D_Thre_PF_TotalLoss);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.D_Tag_PF_TotalLength);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.D_Thre_PF_TotalLength);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.D_Tag_PF_TotalORL);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.D_Thre_PF_TotalORL);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;

        for(a = 0; a < this.D_Thre_PF_Remain.length; ++a) {
            tmpBuf = BitConvert.getBytes(this.D_Thre_PF_Remain[a]);
            System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
            pos += tmpBuf.length;
        }

        tmpBuf = this.Name_Device;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.Module_Device;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.Else_Device;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes((int)this.DTS_Calibration);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.TimeZone);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.Version_Hardware;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.Version_Software;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.Version_Algorithm;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.Version_System;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.Version_FPGA;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.Version_Else;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.Task_Save;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.Company_Save;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.Customer_Save;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.OperatorA_Save;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.OperatorB_Save;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.Note_Save;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.LocationA_Save;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.LocationB_Save;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.Direction_Save);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.Else_Save;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.Result_LCat);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.Widen_LCat);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.Distance_Widen_LCat);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.Widen_Fracture_LCat);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = this.Else_LCat;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;
        tmpBuf = BitConvert.getBytes(this.Num_Event_Extra);
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        pos += tmpBuf.length;

        for(a = 0; a < this.Property_Exent_Extra.length; ++a) {
            tmpBuf = BitConvert.getBytes(this.Property_Exent_Extra[a]);
            System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
            pos += tmpBuf.length;
        }

        for(a = 0; a < this.Index_Event_Extra.length; ++a) {
            tmpBuf = BitConvert.getBytes(this.Index_Event_Extra[a]);
            System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
            pos += tmpBuf.length;
        }

        for(a = 0; a < this.Type_Event_Extra.length; ++a) {
            tmpBuf = BitConvert.getBytes(this.Type_Event_Extra[a]);
            System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
            pos += tmpBuf.length;
        }

        for(a = 0; a < this.Distance_Event_Extra.length; ++a) {
            tmpBuf = BitConvert.getBytes(this.Distance_Event_Extra[a]);
            System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
            pos += tmpBuf.length;
        }

        for(a = 0; a < this.ReturnLoss_Event_Extra.length; ++a) {
            tmpBuf = BitConvert.getBytes(this.ReturnLoss_Event_Extra[a]);
            System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
            pos += tmpBuf.length;
        }

        tmpBuf = this.D_Else_Remain;
        System.arraycopy(tmpBuf, 0, buffer, pos, tmpBuf.length);
        int var10000 = pos + tmpBuf.length;
    }

    public void from(byte[] buffer, int index) {
        this.D_TagCorp = BitConvert.toUInt16(buffer, index);
        int pos = index + 2;
        this.D_Mode = BitConvert.toUInt16(buffer, pos);
        pos += 2;
        this.D_ValAtt = BitConvert.toUInt16(buffer, pos);
        pos += 2;
        this.D_ItemCode = BitConvert.toUInt16(buffer, pos);
        pos += 2;
        this.D_Resolution = BitConvert.toUInt16(buffer, pos);
        pos += 2;
        this.UO_ReceiveFiber = BitConvert.toInt64(buffer, pos);
        pos += 4;
        this.UOD_ReceiveFiber = BitConvert.toInt64(buffer, pos);
        pos += 4;
        this.UO_ExtendFiber = BitConvert.toInt64(buffer, pos);
        pos += 4;
        this.UOD_ExtendFiber = BitConvert.toInt64(buffer, pos);
        pos += 4;
        this.Power_ExtendFiber = BitConvert.toSingle(buffer, pos);
        pos += 4;
        this.EventLoss_ExtendFiber = BitConvert.toSingle(buffer, pos);
        pos += 4;

        int a;
        for(a = 0; a < this.Val_LongitudeAndLatitude.length; ++a) {
            this.Val_LongitudeAndLatitude[a] = BitConvert.toDouble(buffer, pos);
            pos += 8;
        }

        for(a = 0; a < this.Index_MarkLineAB.length; ++a) {
            this.Index_MarkLineAB[a] = BitConvert.toInt64(buffer, pos);
            pos += 4;
        }

        for(a = 0; a < this.D_OT_Remain.length; ++a) {
            this.D_OT_Remain[a] = BitConvert.toInt64(buffer, pos);
            pos += 4;
        }

        System.arraycopy(buffer, pos, this.D_CorpTag, 0, this.D_CorpTag.length);
        pos += this.D_CorpTag.length;
        this.D_Val_Temperature = BitConvert.toSingle(buffer, pos);
        pos += 4;
        this.D_Val_Humidity = BitConvert.toSingle(buffer, pos);
        pos += 4;
        this.D_Tag_Use_MacroBending = BitConvert.toInt16(buffer, pos);
        pos += 2;

        for(a = 0; a < this.D_Val_Wave_MacroBending.length; ++a) {
            this.D_Val_Wave_MacroBending[a] = BitConvert.toInt16(buffer, pos);
            pos += 2;
        }

        this.D_Val_Diff_MacroBending = BitConvert.toSingle(buffer, pos);
        pos += 4;
        this.D_Tag_PF_SpliceLoss = BitConvert.toInt16(buffer, pos);
        pos += 2;
        this.D_Thre_PF_SpliceLoss = BitConvert.toSingle(buffer, pos);
        pos += 4;
        this.D_Tag_PF_ConnectorLoss = BitConvert.toInt16(buffer, pos);
        pos += 2;
        this.D_Thre_PF_ConnectorLoss = BitConvert.toSingle(buffer, pos);
        pos += 4;
        this.D_Tag_PF_SplitterLoss = BitConvert.toInt16(buffer, pos);
        pos += 2;

        for(a = 0; a < this.D_Thre_PF_SplitterLoss.length; ++a) {
            this.D_Thre_PF_SplitterLoss[a] = BitConvert.toSingle(buffer, pos);
            pos += 4;
        }

        this.D_Tag_PF_Reflectance = BitConvert.toInt16(buffer, pos);
        pos += 2;
        this.D_Thre_PF_Reflectance = BitConvert.toSingle(buffer, pos);
        pos += 4;
        this.D_Tag_PF_SectionAttenuation = BitConvert.toInt16(buffer, pos);
        pos += 2;
        this.D_Thre_PF_SectionAttenuation = BitConvert.toSingle(buffer, pos);
        pos += 4;
        this.D_Tag_PF_TotalLoss = BitConvert.toInt16(buffer, pos);
        pos += 2;
        this.D_Thre_PF_TotalLoss = BitConvert.toSingle(buffer, pos);
        pos += 4;
        this.D_Tag_PF_TotalLength = BitConvert.toInt16(buffer, pos);
        pos += 2;
        this.D_Thre_PF_TotalLength = BitConvert.toSingle(buffer, pos);
        pos += 4;
        this.D_Tag_PF_TotalORL = BitConvert.toInt16(buffer, pos);
        pos += 2;
        this.D_Thre_PF_TotalORL = BitConvert.toSingle(buffer, pos);
        pos += 4;

        for(a = 0; a < this.D_Thre_PF_Remain.length; ++a) {
            this.D_Thre_PF_Remain[a] = BitConvert.toInt64(buffer, pos);
            pos += 4;
        }

        System.arraycopy(buffer, pos, this.Name_Device, 0, this.Name_Device.length);
        pos += this.Name_Device.length;
        System.arraycopy(buffer, pos, this.Module_Device, 0, this.Module_Device.length);
        pos += this.Module_Device.length;
        System.arraycopy(buffer, pos, this.Else_Device, 0, this.Else_Device.length);
        pos += this.Else_Device.length;
        this.DTS_Calibration = BitConvert.toUInt32(buffer, pos);
        pos += 4;
        this.TimeZone = BitConvert.toInt16(buffer, pos);
        pos += 2;
        System.arraycopy(buffer, pos, this.Version_Hardware, 0, this.Version_Hardware.length);
        pos += this.Version_Hardware.length;
        System.arraycopy(buffer, pos, this.Version_Software, 0, this.Version_Software.length);
        pos += this.Version_Software.length;
        System.arraycopy(buffer, pos, this.Version_Algorithm, 0, this.Version_Algorithm.length);
        pos += this.Version_Algorithm.length;
        System.arraycopy(buffer, pos, this.Version_System, 0, this.Version_System.length);
        pos += this.Version_System.length;
        System.arraycopy(buffer, pos, this.Version_FPGA, 0, this.Version_FPGA.length);
        pos += this.Version_FPGA.length;
        System.arraycopy(buffer, pos, this.Version_Else, 0, this.Version_Else.length);
        pos += this.Version_Else.length;
        System.arraycopy(buffer, pos, this.Task_Save, 0, this.Task_Save.length);
        pos += this.Task_Save.length;
        System.arraycopy(buffer, pos, this.Company_Save, 0, this.Company_Save.length);
        pos += this.Company_Save.length;
        System.arraycopy(buffer, pos, this.Customer_Save, 0, this.Customer_Save.length);
        pos += this.Customer_Save.length;
        System.arraycopy(buffer, pos, this.OperatorA_Save, 0, this.OperatorA_Save.length);
        pos += this.OperatorA_Save.length;
        System.arraycopy(buffer, pos, this.OperatorB_Save, 0, this.OperatorB_Save.length);
        pos += this.OperatorB_Save.length;
        System.arraycopy(buffer, pos, this.Note_Save, 0, this.Note_Save.length);
        pos += this.Note_Save.length;
        System.arraycopy(buffer, pos, this.LocationA_Save, 0, this.LocationA_Save.length);
        pos += this.LocationA_Save.length;
        System.arraycopy(buffer, pos, this.LocationB_Save, 0, this.LocationB_Save.length);
        pos += this.LocationB_Save.length;
        this.Direction_Save = BitConvert.toInt16(buffer, pos);
        pos += 2;
        System.arraycopy(buffer, pos, this.Else_Save, 0, this.Else_Save.length);
        pos += this.Else_Save.length;
        this.Result_LCat = BitConvert.toInt16(buffer, pos);
        pos += 2;
        this.Widen_LCat = BitConvert.toSingle(buffer, pos);
        pos += 4;
        this.Distance_Widen_LCat = BitConvert.toSingle(buffer, pos);
        pos += 4;
        this.Widen_Fracture_LCat = BitConvert.toSingle(buffer, pos);
        pos += 4;
        System.arraycopy(buffer, pos, this.Else_LCat, 0, this.Else_LCat.length);
        pos += this.Else_LCat.length;
        this.Num_Event_Extra = BitConvert.toInt32(buffer, pos);
        pos += 4;

        for(a = 0; a < this.Property_Exent_Extra.length; ++a) {
            this.Property_Exent_Extra[a] = BitConvert.toInt16(buffer, pos);
            pos += 2;
        }

        for(a = 0; a < this.Index_Event_Extra.length; ++a) {
            this.Index_Event_Extra[a] = BitConvert.toInt32(buffer, pos);
            pos += 4;
        }

        for(a = 0; a < this.Type_Event_Extra.length; ++a) {
            this.Type_Event_Extra[a] = BitConvert.toInt16(buffer, pos);
            pos += 2;
        }

        for(a = 0; a < this.Distance_Event_Extra.length; ++a) {
            this.Distance_Event_Extra[a] = BitConvert.toSingle(buffer, pos);
            pos += 4;
        }

        for(a = 0; a < this.ReturnLoss_Event_Extra.length; ++a) {
            this.ReturnLoss_Event_Extra[a] = BitConvert.toSingle(buffer, pos);
            pos += 4;
        }

        System.arraycopy(buffer, pos, this.D_Else_Remain, 0, this.D_Else_Remain.length);
        int var10000 = pos + this.D_Else_Remain.length;
    }
}
