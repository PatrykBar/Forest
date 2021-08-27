package Patryk.company.models;

public class Oak extends LeafyTree {

    private static final String nameOfTree = "Oak";

    @Override
    public String toString() {
        return "Oak{" +
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
