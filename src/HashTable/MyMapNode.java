package HashTable;

public class MyMapNode<K, V> {
    public MyMapNode<K, V> next;
    public Pair<K, V> data;

    public MyMapNode(Pair<K, V> data) {
        this.data = data;
        this.next = null;
    }

}
