package wang.wenru.study.algorithms._10;

/**
 * Description
 * Date 2022/1/23 12:52 PM
 *
 * @author dafu
 */
public class Node {
    Integer key;
    Node parent;
    Node left;
    Node right;

    public Node(Integer key) {
        this.key = key;
    }

    public Node() {
    }

    public static Node createTree(){
        Node root = new Node(18);
        root.left = new Node(12);
        root.left.left = new Node(7);
        root.left.right = new Node(4);
        root.left.right.left = new Node(5);
        root.right = new Node(10);
        root.right.left =  new Node(2);
        root.right.right = new Node(21);
        return root;
    }
}
