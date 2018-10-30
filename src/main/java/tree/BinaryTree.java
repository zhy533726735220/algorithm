package tree;

/**
 * 二叉搜索树
 */
public class BinaryTree implements Tree {

    private TreeNode rootNode;

    public TreeNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(TreeNode rootNode) {
        this.rootNode = rootNode;
    }

    @Override
    public TreeNode find(int key) {
        TreeNode currentNode = this.rootNode;
        while (currentNode != null) {
            if (currentNode.getData() > key) {
                currentNode = currentNode.getLeftChild();
            } else if (currentNode.getData() < key){
                currentNode = currentNode.getRightChild();
            } else {
                return currentNode;
            }
        }
        return null;
    }

    @Override
    public boolean insert(int data) {
        TreeNode newTreeNode = new TreeNode(data);
        if (this.rootNode == null) {
            this.rootNode = newTreeNode;
            return true;
        } else {
            TreeNode currentNode = this.rootNode;
            TreeNode parentNode  = null;
            while (currentNode != null) {
                parentNode  = currentNode;
                if (currentNode.getData() > newTreeNode.getData()) {
                    currentNode = currentNode.getLeftChild();
                    if (currentNode == null) {
                        parentNode.setLeftChild(newTreeNode);
                        return true;
                    }
                } else {
                    currentNode = currentNode.getRightChild();
                    if (currentNode == null) {
                        parentNode.setRightChild(newTreeNode);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void infixOrder(TreeNode currentNode) {
        if (currentNode != null) {
            this.infixOrder(currentNode.getLeftChild());
            System.out.print(currentNode.getData() + " ");
            this.infixOrder(currentNode.getRightChild());
        }
    }

    @Override
    public void preOrder(TreeNode currentNode) {
        if (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            this.preOrder(currentNode.getLeftChild());
            this.preOrder(currentNode.getRightChild());
        }
    }

    @Override
    public void postOrder(TreeNode currentNode) {
        if (currentNode != null) {
            this.postOrder(currentNode.getLeftChild());
            this.postOrder(currentNode.getRightChild());
            System.out.print(currentNode.getData() + " ");
        }
    }
}
