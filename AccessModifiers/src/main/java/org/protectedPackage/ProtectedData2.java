package org.protectedPackage;

public class ProtectedData2 {
    public boolean missionComplete = false;
    protected String missionObjective;

    protected String getMissionObjective() {
        missionObjective = "Navigate to the north end of Tally Pass and install transmission tower.";
        return missionObjective;
    }
}
