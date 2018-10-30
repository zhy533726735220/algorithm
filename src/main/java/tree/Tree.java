package tree;

public interface Tree {
    /**
     * 查找节点
     * @param key
     * @return
     */
    public TreeNode find(int key);

    /**
     * 插入新结点
     * @param data
     * @return
     */
    public boolean insert(int data);

    /**
     * 中序遍历
     * @param currentNode
     */
    public void infixOrder(TreeNode currentNode);

    /**
     * 前序遍历
     * @param currentNode
     */
    public void preOrder(TreeNode currentNode);

    // 后续遍历
    public void postOrder(TreeNode currentNode);
}
