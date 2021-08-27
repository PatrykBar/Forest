package Patryk.company.models;

public class Spruce extends Conifer {

    private static final String nameOfTree = "Spruce";


    @Override
    public String toString() {
        return "Spruce{" +
                "diameterOfTrunk=" + diameterOfTrunk +
                ", amountOfBranches=" + amountOfBranches +
                ", height=" + height +
                ", trunkGrowth=" + trunkGrowth +
                ", heightGain=" + heightGain +
                ", typeOfTree=" + getTypeOfTree() +
                ", nameOfTree=" + nameOfTree +
                '}';
    }
}
