package org.xiong.sor.example;

public class UnsignedConvert {
    public static byte[] intToUnsignedShortBytes(int v){
        if(v<0||v>0Xffff){
            throw new IllegalArgumentException("out of range: unsigned short(0-65535)");
        }
        byte[] rs= new byte[2];
        rs[0]=(byte)((v>>8)&0xff);
        rs[1]=(byte)(v&0xff);
        return rs;
    }

}
