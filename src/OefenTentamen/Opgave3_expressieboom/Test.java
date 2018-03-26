package OefenTentamen.Opgave3_expressieboom;

public class Test {

    public static void main(String[] args) {
//        Node n4_1 = new Node(6);
//        Node n4_2 = new Node(7);
//        Node n3_1 = new Node(3);
//        Node n3_2 = new Node(4);
//        Node n3_3 = new Node(5);
//        Node n3_4 = new ExpressionNode("+");
//        n3_4.left = n4_1;
//        n3_4.right = n4_2;
//        Node n2_1 = new ExpressionNode("*");
//        n2_1.left = n3_2;
//        n2_1.right = n3_1;
//        Node n2_2 = new ExpressionNode("*");
//        n2_2.left = n3_3;
//        n2_2.right = n3_4;
//        Node n1_1 = new ExpressionNode("+");
//        n1_1.left = n2_1;
//        n1_1.right = n2_2;

        Node n3_4 = new ExpressionNode("+");
        n3_4.left = new Node(6);
        n3_4.right =  new Node(7);
        Node n2_1 = new ExpressionNode("*");
        n2_1.left = new Node(4);
        n2_1.right = new Node(3);
        Node n2_2 = new ExpressionNode("*");
        n2_2.left = new Node(5);
        n2_2.right = n3_4;
        Node n1_1 = new ExpressionNode("+");
        n1_1.left = n2_1;
        n1_1.right = n2_2;


        System.out.print(n1_1.calculate());
    }
}

