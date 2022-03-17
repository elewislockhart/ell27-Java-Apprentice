package org.javapet;

public class StatusColor {

    public int limitHigh = 14;
    public int limitMid = 8;
    public int limitLow = 0;

    public OutputColor getColor(int value) {
        if (value <= this.limitHigh) {
            return OutputColor.GREEN;
        }
        if ((this.limitMid < value) && (value < this.limitHigh)) {
            return OutputColor.YELLOW;
        }
        if (value <= this.limitLow) {
            return OutputColor.RED;
        }
        return OutputColor.BLUE;
    }
}
