package org.example;

public class LaserAttachmentUpgrade1 extends LaserAttachment {

    @Override
    public void laserSetup() {
        hm.put("PowerLevel", 8);
        hm.put("RechargeInterval", 4);
        hm.put("Distance", 24);
    }
}
