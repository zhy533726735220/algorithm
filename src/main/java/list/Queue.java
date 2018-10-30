package list;

public class Queue<T> {

    private Node<T> rootNode = null;
    private Node<T> tmpNode = null;
    public T offer(T t) {
        Node<T> newNote = new Node<T>(t);
        if (this.rootNode == null) {
            this.rootNode = new Node<T>(t);
            tmpNode = this.rootNode;
        } else {
            tmpNode.setNext(newNote);
            tmpNode = newNote;
        }
        return t;
    }

    public T poll() {
        T t = this.rootNode.getData();
        this.rootNode = this.rootNode.getNext();
        return t;
    }

    public T peek() {
        T t = this.rootNode.getData();
        return t;
    }

    public T insert(T t, int position) {
        Node<T> newNode = new Node<T>(t);
        Node<T> tNode = this.rootNode;
        for (int i = 0; i < position; i++) {
            tNode = tNode.getNext();
        }
        newNode.setNext(tNode.getNext());
        tNode.setNext(newNode);
        return t;
    }


}
