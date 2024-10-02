package controller;

import model.Kofferslot;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class KofferSlotLauncher {

    public static void main(String[] args) {
        Kofferslot kofferslot = new Kofferslot();
        System.out.printf("Combinatie: %c%c%d\n", kofferslot.getEersteLetter(), kofferslot.getTweedeLetter(), kofferslot.getCijfer());
        kofferslot.volgende();
        System.out.printf("Volgende combinatie: %c%c%d\n", kofferslot.getEersteLetter(), kofferslot.getTweedeLetter(), kofferslot.getCijfer());

        Kofferslot kofferslot1 = new Kofferslot('B','R',9);
        System.out.printf("Combinatie: %c%c%d\n", kofferslot1.getEersteLetter(), kofferslot1.getTweedeLetter(), kofferslot1.getCijfer());
        kofferslot1.volgende();
        System.out.printf("Volgende combinatie: %c%c%d\n", kofferslot1.getEersteLetter(), kofferslot1.getTweedeLetter(), kofferslot1.getCijfer());

        Kofferslot kofferslot2 = new Kofferslot('D','Z',9);
        System.out.printf("Combinatie: %c%c%d\n", kofferslot2.getEersteLetter(), kofferslot2.getTweedeLetter(), kofferslot2.getCijfer());
        kofferslot2.volgende();
        System.out.printf("Volgende combinatie: %c%c%d\n", kofferslot2.getEersteLetter(), kofferslot2.getTweedeLetter(), kofferslot2.getCijfer());

        Kofferslot kofferslot3 = new Kofferslot('Z','Z',9);
        System.out.printf("Combinatie: %c%c%d\n", kofferslot3.getEersteLetter(), kofferslot3.getTweedeLetter(), kofferslot3.getCijfer());
        kofferslot3.volgende();
        System.out.printf("Volgende combinatie: %c%c%d\n", kofferslot3.getEersteLetter(), kofferslot3.getTweedeLetter(), kofferslot3.getCijfer());
    }
}
