package org.xiong.sor;

import java.security.KeyException;
import java.util.Map;

import org.xiong.sor.blocks.GeneralParametersBlock;
import org.xiong.sor.blocks.KeyEventsBlock;
import org.xiong.sor.blocks.MapBlock;
import org.xiong.sor.blocks.PtsBlock;
import org.xiong.sor.blocks.SorFullProtocol;
import org.xiong.sor.blocks.SupplierParametersBlock;
import org.xiong.sor.example.DataSor;

public class GenBlockMethods {
    public static SorFullProtocol getSorProtocol(DataSor origin){
        SorFullProtocol sorFullProtocol = new SorFullProtocol();
        MapBlock mapBlock = new MapBlock();
        GeneralParametersBlock generalParametersBlock = new GeneralParametersBlock();
        KeyEventsBlock keyEventsBlock = new KeyEventsBlock();
        SupplierParametersBlock supplierParametersBlock = new SupplierParametersBlock();
        PtsBlock ptsBlock = new PtsBlock();
        

        SorFullProtocol sor = new SorFullProtocol();
        sorFullProtocol.setMapBlock(mapBlock);
        sor.setGpBlock(generalParametersBlock);
        sor.setKeBlock(keyEventsBlock);
        sor.setSpBlock(supplierParametersBlock);
        sor.setPtsBlock(ptsBlock);

        return sorFullProtocol;

    }

    public byte[] getProtocolBytes(SorFullProtocol protocol){
        return protocol.toBytes();
    }

}
