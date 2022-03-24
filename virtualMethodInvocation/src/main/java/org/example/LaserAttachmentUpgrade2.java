package org.example;

public class LaserAttachmentUpgrade2 extends LaserAttachment {

    @Override
    public void laserSetup() {
        hm.put("PowerLevel", 12);
        hm.put("RechargeInterval", 2);
        hm.put("Distance", 36);
    }
}
