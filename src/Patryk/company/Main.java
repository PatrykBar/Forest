package Patryk.company;

import Patryk.company.models.Oak;

public class Main {

    public static void main(String[] args) {
        Oak oak = new Oak();
        System.out.println(oak.toString());
        oak.setAmountOfBranches(20);
        oak.setDiameterOfTrunk(1);
        oak.setHeight(3);
        oak.setHeightGain(0.6f);
        oak.setTrunkGrowth(0.3f);

        System.out.println(oak.toString());
        oak.addBranch(2);
        oak.grow();
        System.out.println(oak.toString());
        oak.grow();
        oak.grow();
        System.out.println(oak.toString());
        oak.grow();oak.grow();oak.grow();oak.grow();oak.grow();oak.grow();oak.grow();oak.grow();
        System.out.println(oak.toString());
        oak.cutTheBranches(1);
        System.out.println(oak.toString());

    }
}
