package com.smartdevicelink.proxy.rpc.enums;

public enum DisplayType {
    CID("CID"),
    TYPE2("TYPE2"),
    TYPE5("TYPE5"),
    NGN("NGN"),
    GEN2_8_DMA("GEN2_8_DMA"),
    GEN2_6_DMA("GEN2_6_DMA"),
    MFD3("MFD3"),
    MFD4("MFD4"),
    MFD5("MFD5"),
    GEN3_8_INCH("GEN3_8-INCH");

    private final String INTERNAL_NAME;

    private DisplayType(String internalName) {
        this.INTERNAL_NAME = internalName;
    }

    public static DisplayType valueForString(String value) {
        if(value == null){
            return null;
        }
        
        for (DisplayType type : DisplayType.values()) {
            if (type.toString().equals(value)) {
                return type;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return INTERNAL_NAME;
    }
}
