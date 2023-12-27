package BST;

public class Start {
    public static void main(String[] args) {

        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();

        binarySearchTree.insert(56);

        binarySearchTree.insert(30);

        binarySearchTree.insert(70);
        binarySearchTree.inorderTraversal();
        binarySearchTree.preorderTraversal();
        binarySearchTree.postorderTraversal();
    }
}
