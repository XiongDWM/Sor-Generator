package org.xiong.sor.blocks;

import java.nio.ByteBuffer;

import org.xiong.sor.UnsignedConvert;

public class MapBlock {
    static class BlockMeta{
        String bid; // block id
        int reversionId=0; // unsigned short
        long size=0;

        public byte[] toBytes() {
            byte[] bidBytes = bid.getBytes();
            byte[] reversionIdBytes = UnsignedConvert.intToUnsignedShortBytes(reversionId);
            byte[] sizeBytes = ByteBuffer.allocate(Long.BYTES).putLong(size).array();

            byte[] result = new byte[bidBytes.length + reversionIdBytes.length + sizeBytes.length];
            System.arraycopy(bidBytes, 0, result, 0, bidBytes.length);
            System.arraycopy(reversionIdBytes, 0, result, bidBytes.length, reversionIdBytes.length);
            System.arraycopy(sizeBytes, 0, result, bidBytes.length + reversionIdBytes.length, sizeBytes.length);
            return result;
        }
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

    public byte[] toBytes() {
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        byte[] mbIdBytes = mbId.getBytes();
        buffer.put((byte)mbIdBytes.length);
        buffer.put(mbIdBytes);

        buffer.putShort((short)mrn);

        buffer.putLong(mbs);

        buffer.putShort(nb);

        // metaInfo: 数组长度+每个BlockMeta的字节数组
        buffer.putShort((short)metaInfo.length);
        for (BlockMeta meta : metaInfo) {
            byte[] metaBytes = meta.toBytes();
            buffer.putShort((short)metaBytes.length);
            buffer.put(metaBytes);
        }

        byte[] result = new byte[buffer.position()];
        buffer.flip();
        buffer.get(result);
        return result;
    }
}
