package org.xiong.sor;

public class DataSor {
    final String defAliasName = "OTDR";
    public static String companyName = "NOVKER";
    public static final int size = 9402;
    public DataNSorHead head = new DataNSorHead();
    public DataNHeadElse headElse = new DataNHeadElse();
    public EventInformation event = new EventInformation();
    public HostInformation host = new HostInformation();
    public FiberInformation fiber = new FiberInformation();
    public int[] buffer;

    public DataSor() {
    }

    public byte[] getBytes(String str, int length) {
        return this.getBytes(str, length, true);
    }

    public byte[] getBytes(String str, int length, boolean isBreak) {
        byte[] buffer = str.getBytes();
        if (length < 0) {
            return buffer;
        } else {
            byte[] result = new byte[length];
            int count = Math.min(isBreak ? length - 1 : length, buffer.length);

            for(int a = 0; a < count; ++a) {
                result[a] = buffer[a];
            }

            return result;
        }
    }

    public String getString(byte[] data) {
        if (data != null && data.length != 0) {
            String str = new String(data);
            return str.trim();
        } else {
            return "";
        }
    }

    public void createHost(String deviceId, String mcuVersion, String moduleId, String versionCode, String other, String companyName, String deviceModel) {
        companyName = DataSor.companyName;
        this.host.H_SN = this.getBytes(companyName, this.host.H_SN.length);
        this.host.H_MFID = this.getBytes(deviceModel, this.host.H_MFID.length);
        this.host.H_OTDR = this.getBytes(deviceId, this.host.H_OTDR.length);
        this.host.H_OMID = this.getBytes(moduleId, this.host.H_OMID.length);
        this.host.H_OMSN = this.getBytes(mcuVersion, this.host.H_OMSN.length);
        this.host.H_SR = this.getBytes(versionCode, this.host.H_SR.length);
        this.host.H_OT = this.getBytes(other, this.host.H_OT.length);
    }

    public void setTagCorp() {
        this.host.H_SN = this.getBytes(companyName, this.host.H_SN.length);
        this.headElse.D_TagCorp = 1;
    }

    public boolean isNK() {
        return this.headElse.D_TagCorp == 1;
    }

    public String getHostSN() {
        return this.isNK() ? "OTDR" : this.getString(this.host.H_SN);
    }

    public void createFiber(String label, String id, int type, String localA, String localB, String code, String cdf, String operator, String mask, String cmt) {
        this.fiber.F_CID = this.getBytes(label, this.fiber.F_CID.length);
        this.fiber.F_FID = this.getBytes(id, this.fiber.F_FID.length);
        this.fiber.F_FT = type;
        this.fiber.F_OL = this.getBytes(localA, this.fiber.F_OL.length);
        this.fiber.F_TL = this.getBytes(localB, this.fiber.F_TL.length);
        this.fiber.F_CCode = this.getBytes(code, this.fiber.F_CCode.length);
        this.fiber.F_CDF = this.getBytes(cdf, this.fiber.F_CDF.length);
        this.fiber.F_Operator = this.getBytes(operator, this.fiber.F_Operator.length);
        this.fiber.F_Mask = this.getBytes(mask, this.fiber.F_Mask.length);
        this.fiber.F_CMT = this.getBytes(cmt, this.fiber.F_CMT.length);
    }

    public byte[] getBytes() {
        int bufferSize = this.buffer == null ? 0 : this.buffer.length * 4;
        byte[] data = new byte[9402 + bufferSize];
        int index = 0;
        this.head.getBytes(data, index);
        index += 102;
        this.headElse.getBytes(data, index);
        index += 4256;
        this.event.getBytes(data, index);
        index += 4602;
        this.host.getBytes(data, index);
        index += 140;
        this.fiber.getBytes(data, index);
        index += 302;
        if (this.buffer != null) {
            for(int a = 0; a < this.buffer.length; ++a) {
                byte[] tmpBuf = BitConvert.getBytes(this.buffer[a]);
                System.arraycopy(tmpBuf, 0, data, index, tmpBuf.length);
                index += tmpBuf.length;
            }
        }

        return data;
    }

    public int from(byte[] data, int offset, int length) {
        if (data != null && offset >= 0 && length > 0 && offset + length <= data.length) {
            this.head.from(data, offset);
            int index = offset + 102;
            this.headElse.from(data, index);
            index += 4256;
            this.event.from(data, index);
            index += 4602;
            this.host.from(data, index);
            index += 140;
            this.fiber.from(data, index);
            index += 302;
            int len = (length - index) / 4;
            if (len > 0 && len % 2 == 0) {
                this.buffer = new int[len];

                for(int a = 0; a < this.buffer.length; ++a) {
                    this.buffer[a] = BitConvert.toInt32(data, index);
                    index += 4;
                }
            }

            return 0;
        } else {
            return 1;
        }
    }
}


