package wang.wenru.study.algorithms._10;

/**
 * Description
 * Date 2022/1/23 12:52 PM
 *
 * @author dafu
 */
public class Node2 {
    Integer key;
    Node2 parent;
    Node2 leftChild;
    Node2 rightSibling;

    public Node2(Integer key) {
        this.key = key;
    }

    public Node2() {
    }

    public static Node2 createTree(){
        return new Node2();
    }
}
