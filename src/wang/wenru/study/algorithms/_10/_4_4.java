package wang.wenru.study.algorithms._10;

/**
 * Description
 * Date 2022/1/23 1:02 PM
 *
 * @author dafu
 */
public class _4_4 {
    public static void main(String[] args) {
        Node2 root = Node2.createTree();
        f(root);
    }
    public static void f(Node2 r){
        if(r==null){
            return;
        }
        System.out.println(r);
        f(r.leftChild);
        f(r.rightSibling);
    }
}
