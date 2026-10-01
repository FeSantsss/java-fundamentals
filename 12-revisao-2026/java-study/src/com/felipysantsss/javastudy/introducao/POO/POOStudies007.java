package com.felipysantsss.javastudy.introducao.POO;

import com.felipysantsss.javastudy.introducao.POO.entities.AirBasic;
import com.felipysantsss.javastudy.introducao.POO.entities.AirPremium;
import com.felipysantsss.javastudy.introducao.POO.entities.UniversalController;

public class POOStudies007 {
    public static void main(String[] args) {
        UniversalController air1 = new AirBasic();
        UniversalController air2 = new AirPremium();

        air1.start();
        air2.start();
    }
}
