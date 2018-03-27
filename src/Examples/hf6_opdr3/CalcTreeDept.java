package Examples.hf6_opdr3;

import OefenTentamen.Opgave3_expressieboom.Node;

public class CalcTreeDept {

    public static int maxDepth(Node node) {
        if (node == null) {
            return (-1); // an empty tree  has height −1
        } else {
            // compute the depth of each subtree
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);
            // use the larger one
            if (leftDepth > rightDepth )
                return (leftDepth + 1);
            else
                return (rightDepth + 1);
        }
    }

    public static int sumDepthOfAllChildren(Node node, int depth)
    {
        if ( node == null )
            return 0;
        return depth + sumDepthOfAllChildren(node.left, depth + 1) +
                sumDepthOfAllChildren(node.right, depth + 1);
    }

    public static int countChildren(Node node)
    {
        if ( node == null )
            return 0;
        return 1 + countChildren(node.left) + countChildren(node.right);
    }
}
