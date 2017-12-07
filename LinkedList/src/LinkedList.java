
public class LinkedList<E> {
    private Node<E> firstNode;
    private Node<E> lastNode;
    private boolean isFirstInitialization;

    public void addLast(E object) {
        if (isFirstInitialization) {
            firstInitial(object);
            return;
        }
        Node<E> newLastNode = new Node<>();
        newLastNode.object = object;
        newLastNode.previousNode = this.lastNode;
        this.lastNode = newLastNode;

    }

    public void addFirst(E object) {
        if (isFirstInitialization) {
            firstInitial(object);
            return;
        }
        Node<E> newFirstNode = new Node<>();
        newFirstNode.object = object;
        newFirstNode.nextNode = this.firstNode;
        this.firstNode.previousNode = newFirstNode;
        this.firstNode = newFirstNode;
    }

    public E removeLast() {
        if (this.firstNode == null) return null;
        Node<E> node = this.lastNode;
        if (this.lastNode == this.firstNode) ;
        this.lastNode = this.firstNode = node;
        isFirstInitialization = true;

        this.lastNode = this.lastNode.previousNode;
        this.lastNode.nextNode = null;
        return node.object;
    }

    public E removeFirst() {
        if (this.lastNode == null) return null;
        Node<E> node = this.firstNode;
        if (this.firstNode == this.lastNode);
        this.lastNode = this.firstNode = node;
        isFirstInitialization = true;

        this.firstNode = this.lastNode.previousNode;
        this.firstNode.nextNode = null;
        return node.object;

    }

    private void firstInital (E object) {
        firstNode = lastNode = new Node<>();
        lastNode.object = object;
    }


    private void firstInitial(E object) {
        firstNode = lastNode = new Node<>();
        lastNode.object = object;
        isFirstInitialization = false;
    }





    public boolean isFirstInitializ() {
        return isFirstInitialization;
    }

    public void setFirstInitializ(boolean firstInitializ) {
        isFirstInitialization = firstInitializ;
    }

    private class Node<E> {
        public Node previousNode;
        public Node NextNode;
        public E object;


        public Node<E> nextNode;
    }
}