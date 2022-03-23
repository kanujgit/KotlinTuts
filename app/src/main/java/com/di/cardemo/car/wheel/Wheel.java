package com.di.cardemo.car.wheel;

import javax.inject.Inject;

// we can't make any changes, consider as 3rd party class so we can't @Inject
public class Wheel {
    private Rims rims;
    private  Tires tires;

    public Wheel(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }

    @Inject
    public Wheel() {
    }
}
