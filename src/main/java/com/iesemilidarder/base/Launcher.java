package com.iesemilidarder.base;

import com.iesemilidarder.base.data.Moto;

public class Launcher {
    public static void main(String... args) {
        System.out.println("concesionario run run");
        Moto moto = new Moto();
        moto.start();
        System.out.println("pista libre");
        moto.brake();
    }
}
