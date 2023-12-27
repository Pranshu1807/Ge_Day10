package HashTable;

public class LinkedList<K, V> {
    public MyMapNode<K, V> head;

    public LinkedList() {
        this.head = null;
    }

    public void add(K key, V value) {
        Pair<K, V> newPair = new Pair<K, V>(key, value);
        MyMapNode<K, V> newMyMapNode = new MyMapNode<>(newPair);
        if (this.head == null) {
            this.head = newMyMapNode;
        } else {
            MyMapNode<K, V> temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newMyMapNode;
        }
    }

    public void display() {
        MyMapNode<K, V> temp = this.head;
        while (temp != null) {
            System.out.print(temp.data.key + ":" + temp.data.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int getIndex(String str) {
        MyMapNode<K, V> temp = this.head;
        int i = 0;
        while (temp != null) {
            if (temp.data.key.equals(str)) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int frequency(String str) {
        MyMapNode<K, V> temp = this.head;
        while (temp != null) {
            if (temp.data.key.equals(str)) {
                return (int) temp.data.value;
            }
            temp = temp.next;
        }
        return -1;
    }
}
