package org.example;

public class Robot {
    private final String company;
    private final String prodLocation;
    private String mission;
    private String attachment;
    private String mobility;
    private double maxSpeed;
    private double powerLevel;

    public Robot() {
        this.company = "OreTech";
        this.prodLocation = "Earth";
        this.mission = "General Service";
        this.mobility = "Wheels";
        this.maxSpeed = 6;
        this.powerLevel = 6;
    }

    public Robot(String mission, String attachment) {
        this();
        this.mission = mission;
        this.attachment = attachment;
    }

    public Robot(String mission, String attachment, String mobility, double maxSpeed, double powerLevel) {
        this(mission, attachment);
        this.mobility = mobility;
        this.maxSpeed = maxSpeed;
        this.powerLevel = powerLevel;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "company='" + company + '\'' +
                ", prodLocation='" + prodLocation + '\'' +
                ", mission='" + mission + '\'' +
                ", attachment='" + attachment + '\'' +
                ", mobility='" + mobility + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", powerLevel=" + powerLevel +
                '}';
    }

    // getters and setters
    public String getCompany() {
        return company;
    }

    public String getProdLocation() {
        return prodLocation;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getMobility() {
        return mobility;
    }

    public void setMobility(String mobility) {
        this.mobility = mobility;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(double powerLevel) {
        this.powerLevel = powerLevel;
    }
}
