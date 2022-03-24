package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class LaserAttachment {
    protected HashMap<String, Integer> hm = new HashMap<String, Integer>();

    public void laserSetup() {
        hm.put("PowerLevel", 4);
        hm.put("RechargeInterval", 8);
        hm.put("Distance", 12);
    }

    public void fireLaser() {
        System.out.println(String.format(
            "Laser fires at power level %s reaching a distance of %s meters. It then takes %s seconds to recharge",
             hm.get("PowerLevel"), hm.get("Distance"), hm.get("RechargeInterval")
        ));
    }

    @Override
    public String toString() {
        return "LaserAttachment{" +
                "hm=" + hm +
                '}';
    }
}
