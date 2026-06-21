public class LinkdList<E> {
    private Node<E> headNode;
    private Node<E> tailNode;

    public LinkdList(Node<E> headNode, Node<E> tailNode) {
        this.headNode = headNode;
        this.tailNode = tailNode;
    }

    public Node<E> getHeadNode() {
        return headNode;
    }

    public void setHeadNode(Node<E> headNode) {
        this.headNode = headNode;
    }

    public Node<E> getTailNode() {
        return tailNode;
    }

    public void setTailNode(Node<E> tailNode) {
        this.tailNode = tailNode;
    }
}
