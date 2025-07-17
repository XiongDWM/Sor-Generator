package org.xiong.sor.blocks;

public class SorFullProtocol {
    private MapBlock mapBlock;
    private GeneralParametersBlock gpBlock;
    private SupplierParametersBlock spBlock;
    private FixedParametersBlock fpBlock;
    private KeyEventsBlock keBlock;
    private PtsBlock ptsBlock;

    public MapBlock getMapBlock() {
        return mapBlock;
    }

    public void setMapBlock(MapBlock mapBlock) {
        this.mapBlock = mapBlock;
    }

    public GeneralParametersBlock getGpBlock() {
        return gpBlock;
    }

    public void setGpBlock(GeneralParametersBlock gpBlock) {
        this.gpBlock = gpBlock;
    }

    public SupplierParametersBlock getSpBlock() {
        return spBlock;
    }

    public void setSpBlock(SupplierParametersBlock spBlock) {
        this.spBlock = spBlock;
    }

    public FixedParametersBlock getFpBlock() {
        return fpBlock;
    }

    public void setFpBlock(FixedParametersBlock fpBlock) {
        this.fpBlock = fpBlock;
    }

    public KeyEventsBlock getKeBlock() {
        return keBlock;
    }

    public void setKeBlock(KeyEventsBlock keBlock) {
        this.keBlock = keBlock;
    }

    public PtsBlock getPtsBlock() {
        return ptsBlock;
    }

    public void setPtsBlock(PtsBlock ptsBlock) {
        this.ptsBlock = ptsBlock;
    }
}
