package Patryk.company.models;

import java.math.BigDecimal;

public abstract class Tree {

    protected float diameterOfTrunk;
    protected float trunkGrowth;
    protected int amountOfBranches;
    protected float height;
    protected float heightGain;

    public void grow(){
        diameterOfTrunk = BigDecimal.valueOf(Float.sum(diameterOfTrunk, trunkGrowth))
                .setScale(2, BigDecimal.ROUND_HALF_DOWN)
                .floatValue();
        height = BigDecimal.valueOf(Float.sum(height, heightGain))
                .setScale(2, BigDecimal.ROUND_HALF_DOWN)
                .floatValue();
    };

    public void addBranch(int howMany){
        amountOfBranches += howMany;
    }

    public void removeBranch(int howMany){
        amountOfBranches -= howMany;
    }

    public double getDiameterOfTrunk() {
        return diameterOfTrunk;
    }

    public void setDiameterOfTrunk(float diameterOfTrunk) {
        this.diameterOfTrunk = diameterOfTrunk;
    }

    public int getAmountOfBranches() {
        return amountOfBranches;
    }

    public void setAmountOfBranches(int amountOfBranches) {
        this.amountOfBranches = amountOfBranches;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public double getTrunkGrowth() {
        return trunkGrowth;
    }

    public void setTrunkGrowth(float trunkGrowth) {
        this.trunkGrowth = trunkGrowth;
    }

    public double getHeightGain() {
        return heightGain;
    }

    public void setHeightGain(float heightGain) {
        this.heightGain = heightGain;
    }
}
