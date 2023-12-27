package BST;

public class BinarySearchTree<T extends Comparable<T>> {
    Node<T> root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(T data) {
        root = insertRec(root, data);
    }

    public Node<T> insertRec(Node<T> root, T data) {
        if (root == null) {
            root = new Node<>(data);
            return root;
        }
        if (data.compareTo(root.data) < 0) {
            root.left = insertRec(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public void inorderTraversal() {
        inorderTraversal(root);
        System.out.println("");
    }

    public void inorderTraversal(Node<T> root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public void preorderTraversal() {
        preorderTraversal(root);
        System.out.println("");
    }

    public void preorderTraversal(Node<T> root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    public void postorderTraversal() {
        postorderTraversal(root);
        System.out.println("");
    }

    public void postorderTraversal(Node<T> root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

}
