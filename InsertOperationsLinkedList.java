import java.util.LinkedList;

public class InsertOperationsLinkedList {

    private static LinkdList<String> createLinkedList(){
        Node<String> mangoNodeD  = new Node<>("Dussehri",null);
        Node<String> mangoNodeM  = new Node<>("Maldav",null);
        mangoNodeD.setNextNode(mangoNodeM);
        LinkdList<String> mangoList = new LinkdList<>(mangoNodeD,mangoNodeM);
        return mangoList;
    }

    private static void insertElementAtBeginning(LinkdList linkdList, String elem){
        Node newNode = new Node(elem,null);
        newNode.setNextNode(linkdList.getHeadNode());
        linkdList.setHeadNode(newNode);
    }

    public static void main(String[] args) {
        LinkdList<String> linkdList = createLinkedList();
        insertElementAtBeginning(linkdList, "Calcuttiya");
    }
}
