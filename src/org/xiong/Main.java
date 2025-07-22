package org.xiong;

import org.xiong.sor.GenBlockMethods;
import org.xiong.sor.blocks.GeneralParametersBlock;
import org.xiong.sor.blocks.KeyEventsBlock;
import org.xiong.sor.blocks.MapBlock;
import org.xiong.sor.blocks.PtsBlock;
import org.xiong.sor.blocks.SorFullProtocol;
import org.xiong.sor.blocks.SupplierParametersBlock;


public class Main {

    public static void main(String[] args) {
        GenBlockMethods<SorSample> genBlockMethods = new GenBlockMethods<>() {
            @Override
            public SorFullProtocol convertSorProtocol(SorSample origin) {
                SorFullProtocol sorFullProtocol = new SorFullProtocol();
                MapBlock mapBlock = new MapBlock();
                GeneralParametersBlock generalParametersBlock = new GeneralParametersBlock();
                KeyEventsBlock keyEventsBlock = new KeyEventsBlock();
                KeyEventsBlock.Event event= new KeyEventsBlock.Event();
                event.setCmt(origin.getEventComment());
                keyEventsBlock.addEvent(event);
                SupplierParametersBlock supplierParametersBlock = new SupplierParametersBlock();
                PtsBlock ptsBlock = new PtsBlock();
                ptsBlock.setSf(origin.getCurve());
                

                SorFullProtocol sor = new SorFullProtocol();
                sorFullProtocol.setMapBlock(mapBlock);
                sor.setGpBlock(generalParametersBlock);
                sor.setKeBlock(keyEventsBlock);
                sor.setSpBlock(supplierParametersBlock);
                sor.setPtsBlock(ptsBlock);

                return new SorFullProtocol();
            }
        };
        SorSample sample = new SorSample(new int[]{1, 2, 3}, "Sample Event");
        SorFullProtocol protocol = genBlockMethods.convertSorProtocol(sample);
        System.out.println("Converted protocol: " + protocol.toString());
        byte[] protocolBytes = GenBlockMethods.getProtocolBytes(protocol);
        System.out.println("bytes length: " + protocolBytes.length);

    }  
    
}
