package com.company;

import java.util.Random;

public class Location {
    private float x,y,z;
    public Location() {
        x = 0;
        y = 0;
        z = 0;
    }
    public Location(float []axes) {
        this.x = axes[0];
        this.y = axes[1];
        this.z = axes[2];
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public float getZ() {
        return z;
    }
}