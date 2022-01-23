package wang.wenru.study.algorithms._10;

/**
 * 二叉数,来源只有从父节点来,中间的变量的功能只是用来标识  左节点是否完成,如果完成开始遍历右边节点,
 * 当左右都遍历完成,节点开始向上移动,.再一次遍历右节点.
 * Description
 * Date 2022/1/23 1:13 PM
 *
 * @author dafu
 */
public class _4_5 {
    public static void main(String[] args) {
        Node root = Node.createTree();
        Node prev = null;
        while (root != null) {
            if (prev == root.parent) {
                System.out.println(root.key);
                prev = root;
                root = root.left != null ? root.left : root.right != null ? root.right : root.parent;
            } else if (prev == root.left&& root.right!=null) {
                //左节点遍历完成了,去右边.
                prev = root.parent;
                root = root.right;
            } else { //prev 开始向上移动  左右都完事了`.
                prev = root;
                root = root.parent;
            }
        }
    }

}
