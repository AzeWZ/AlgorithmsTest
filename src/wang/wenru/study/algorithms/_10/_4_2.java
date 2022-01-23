package wang.wenru.study.algorithms._10;

/**
 * Description
 * Date 2022/1/23 12:52 PM
 *
 * @author dafu
 */
public class _4_2 {
    public static void main(String[] args) {
        Node root = Node.createTree();
        f(root);
    }

    public static void f(Node root){
        if (root == null) {
            return;
        }
        System.out.println(root.key);
        f(root.left);
        f(root.right);
    }


}
