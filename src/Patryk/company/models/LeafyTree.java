package Patryk.company.models;

public abstract class LeafyTree extends Tree{
    private static final String typeOfTree = "LeafyTree";

    public static String getTypeOfTree() {
        return typeOfTree;
    }

    public void cutTheBranches(int howManyBranchesToCut){
        removeBranch(howManyBranchesToCut);
    }
}
