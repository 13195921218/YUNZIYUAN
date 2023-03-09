package com.example.yunziyuan.domain;

public class ZiYuan {
    private String vdcName;
    private String cloudLocationName;
    private String name;
    private String flavorRamSize;
    private String flavorVcpu;
    private String nativeId;

    public String getVdcName() {
        return vdcName;
    }

    public void setVdcName(String vdcName) {
        this.vdcName = vdcName;
    }

    public String getCloudLocationName() {
        return cloudLocationName;
    }

    public void setCloudLocationName(String cloudLocationName) {
        this.cloudLocationName = cloudLocationName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavorRamSize() {
        return flavorRamSize;
    }

    public void setFlavorRamSize(String flavorRamSize) {
        this.flavorRamSize = flavorRamSize;
    }

    public String getFlavorVcpu() {
        return flavorVcpu;
    }

    public void setFlavorVcpu(String flavorVcpu) {
        this.flavorVcpu = flavorVcpu;
    }

    public String getNativeId() {
        return nativeId;
    }

    public void setNativeId(String nativeId) {
        this.nativeId = nativeId;
    }
}
