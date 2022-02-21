package com.ell27_enum;

public enum EnergySources {
    // energy in joules(j) :: weight in kilos(k) :: uranium units are in grams(g)
    // volume in litre(l) :: natural gas in ft^3(fq)
    // weight and volume are = units :: 1 watt(w) = 1 joule(j)

    COAL(29, "Coal produces 29,307,600 joules/kilo of energy."), // actual - 29,307,600 (j/k)
    WOOD(20, "Wood produces 20,000,000 joules/kilo of energy."), // actual - 20,000,000 (j/k)
    OIL(31, "Crude oil produces 31,000,000 joules/litre of energy."), // actual - 31,000,000(j/l)
    SOLAR(0.001, "Solar only produces 1 joule/1,000 watts of energy."), // actual - 1,000 watts/panel
    NATURALGAS(1, "Natural gas produces 1,055,055 joules/foot^3 of energy."), // actual - 1,055,055(j/fq)
    MAGNESIUM(15, "Magnesium produces 15,392,000 joules/kilo of energy."), // actual - 15,392,000(j/k)
    URANIUM(80000, "Uranium produces 80,000,000,000 joules/gram of energy."); // actual - 80,000,000,000(j/g)
    
    final double joules;
    final String details;
    EnergySources (double joules, String details) {
        this.joules = joules;
        this.details = details;
    }

    // returns joules per unit of resource
    public double getEnergyPerUnit() {
        return this.joules;
    }
    // returns a string of details about the resource
    public String details() {
        return this.details;
    }
}