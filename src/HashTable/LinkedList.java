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

    public int getIndex(K str) {
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

    public int frequency(K str) {
        MyMapNode<K, V> temp = this.head;
        while (temp != null) {
            if (temp.data.key.equals(str)) {
                return (int) temp.data.value;
            }
            temp = temp.next;
        }
        return -1;
    }

    public String[] remove(K str) {

        if (this.head.data.key.equals(str)) {
            head = head.next;
        } else {
            MyMapNode<K, V> temp = this.head;
            MyMapNode<K, V> toDel = null;
            while (temp.next != null) {
                if (temp.next.data.key.equals(str)) {
                    toDel = temp;
                    break;
                }
                temp = temp.next;
            }
            if (toDel == null)
                System.out.println("Word not present");
            else {
                toDel.next = toDel.next.next;
                System.out.println("Word Removed succesfully");
            }
        }
        String[] arr = new String[this.length()];
        MyMapNode<K, V> temp = this.head;
        int i = 0;
        while (temp != null) {
            arr[i] = (String) temp.data.key;
            temp = temp.next;
            i++;
        }
        return arr;
    }

    public int length() {
        MyMapNode<K, V> temp = head;

        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        return len;
    }

}
