package list;

public class Stack<T> {
    private Node<T> topNode = null;
    public T push(T t) {
        Node<T> newNode = new Node<T>(t);
        if (this.topNode == null) {
            this.topNode = new Node<T>(t);
        } else {
            newNode.setNext(this.topNode);
            this.topNode = newNode;
        }
        return t;
    }

    public T pop() {
        T t = this.topNode.getData();
        this.topNode = this.topNode.getNext();
        return t;
    }

    public T peek() {
        T t = this.topNode.getData();
        return t;
    }

    public T insert(T t, int position) {
        Node<T> newNode = new Node<T>(t);
        Node<T> tmpNode = this.topNode;
        for (int i = 0; i < position; i++) {
            tmpNode = tmpNode.getNext();
        }
        newNode.setNext(tmpNode.getNext());
        tmpNode.setNext(newNode);
        return t;
    }

    public T delete(int position) {
        Node<T> tmpNode = this.topNode;
        for (int i = 0; i < position; i++) {
            tmpNode = tmpNode.getNext();
        }
        T t = tmpNode.getNext().getData();
        tmpNode.setNext(tmpNode.getNext().getNext());
        return t;
    }
}
