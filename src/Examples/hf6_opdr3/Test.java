package Examples.hf6_opdr3;

import Examples.hf5_opdr3.Haakjes;
import OefenTentamen.Opgave3_expressieboom.Node;

public class Test {

    public static void main(String[] args) {
        Node node = new Node();
        node.left = new Node();

        node.right = new Node();
        node.right.right = new Node();
        node.right.right.right = new Node();
        node.right.right.right.right = new Node();
        node.right.right.right.right.right = new Node();
        node.right.right.right.right.right.right = new Node();
        node.right.right.right.right.right.right.right = new Node();

        System.out.println("All children - " + CalcTreeDept.countChildren(node));
        System.out.println("Sum depth of all children - " + CalcTreeDept.sumDepthOfAllChildren(node, 5));
        System.out.println("Max depth - " + CalcTreeDept.maxDepth(node));
    }
}
