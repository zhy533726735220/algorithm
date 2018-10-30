import tree.BinaryTree;

public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(2);
        binaryTree.insert(6);
        binaryTree.insert(9);
        binaryTree.insert(3);
        binaryTree.insert(5);
        binaryTree.insert(7);
        binaryTree.insert(10);
        binaryTree.insert(8);
        binaryTree.insert(4);
        binaryTree.insert(1);
        binaryTree.preOrder(binaryTree.getRootNode());
        System.out.println();
        binaryTree.postOrder(binaryTree.getRootNode());
    }
}
