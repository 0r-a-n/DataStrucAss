package datastructureassinment;

public class Duplicate<E> {

    public Duplicate() {
    }

    //Nested class node
    private static class Node<E> {

        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }
    private Node<E> tail = null;
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Node<E> head() {
        if (isEmpty()) {
            return null;
        }
        return tail.getNext();
    }

    public E tail() {
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    public void rotate() {
        if (tail != null) {
            tail = tail.getNext();
        }
    }

    public void addFirst(E e) {
        if (size == 0) {
            tail = new Node<>(e, null);
            tail.setNext(tail);
        } else {
            Node<E> newest = new Node<>(e, tail.getNext());
            tail.setNext(newest);
        }
//        tail = tail.getNext();
        size++;
    }

    public Boolean checkDuplicate(Node<E> head) {
        //2 loops one that rotates and one that checks
        boolean check=false;
        Node <E> fakeH = head;
        while (fakeH.getNext()!=head){
                    Node n = fakeH.getNext();
            while (n!=head){
                if(fakeH.getElement()==n.getElement()){
                    check=true;
                    return check;
                }
                n=n.next;
            }
                fakeH=fakeH.next;
        }
        return check;
    }
}
