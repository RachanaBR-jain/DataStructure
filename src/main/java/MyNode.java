public class MyNode<K> implements INode<K> {
    private K key;
    private INode next;

    public MyNode(K key) {
        this.key = key;
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public INode getNext() {
        return next;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setNext(INode next) {
        this.next = (MyNode<K>)  next;
    }
}
