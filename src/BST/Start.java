package BST;

public class Start {
    public static void main(String[] args) {

        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();

        binarySearchTree.insert(56);
        binarySearchTree.insert(30);
        binarySearchTree.insert(22);
        binarySearchTree.insert(11);
        binarySearchTree.insert(3);
        binarySearchTree.insert(40);
        binarySearchTree.insert(16);
        binarySearchTree.insert(70);
        binarySearchTree.insert(60);
        binarySearchTree.insert(95);
        binarySearchTree.insert(65);
        binarySearchTree.insert(63);
        binarySearchTree.insert(67);
        binarySearchTree.inorderTraversal();
        System.out.println("The size of the BST is " + binarySearchTree.size());
        int find = binarySearchTree.search(3);
        if (find == 1) {
            System.out.println("The value is present in the BST");
        } else {
            System.out.println("The value is not present in the BST");
        }
    }
}
