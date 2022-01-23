package wang.wenru.study.algorithms._10;

import java.util.LinkedList;

/**
 * Description
 * Date 2022/1/23 1:00 PM
 *
 * @author dafu
 */
public class _4_3 {
    public static void main(String[] args) {
        Node root = Node.createTree();
        LinkedList<Node> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            final Node pop = stack.pop();
            if(pop!=null){
                System.out.println(pop.key);
                stack.push(pop.right);
                stack.push(pop.left);
            }

        }
    }
}
