public class DesignLinkedList {

}
class MyLinkedList{

    Nodes head;
    Nodes tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    public int get(int index) {
        int element  = -1;
        Nodes curElem = this.head;
        if(index < 0 || this.head == null ){
            return -1;
        }
        for(int i=0; i<index; i++){
            curElem = curElem.next;
        }
        if (curElem != null){
            return curElem.val;
        }
        return element;
    }
    public void addAtHead(int val) {
        Nodes newHead = new Nodes(val);
        newHead.next = this.head;
        this.head = newHead;
    }
    public void addAtTail(int val) {
        Nodes newTail = new Nodes(val);
        Nodes curTail = this.tail;
        if(curTail == null){
            newTail.next = null;
            curTail = newTail;
        }
        curTail.next = newTail;
        newTail.next = null;
        this.tail = newTail;
    }
    public void addAtIndex(int index, int val) {
        int cnt = 0;
        Nodes newElem = new Nodes(val);
        Nodes curElem = this.head;
        Nodes nextElem = null;
        Nodes prevElem = curElem;
        for(int i =0; i  < index; i++){
            nextElem = curElem.next;
            prevElem = curElem;
            curElem = nextElem;
        }
        newElem.next = nextElem;
        prevElem.next = newElem;
    }

    public void deleteAtIndex(int index) {
        int cnt = 0;
        Nodes curElem = this.head;
        Nodes nextElem = null;
        Nodes prevElem = curElem;
        for(int i =0; i  < index; i++){
            nextElem = curElem.next;
            prevElem = curElem;
            curElem = nextElem;
        }
        prevElem.next = nextElem.next;
    }
}
class Nodes{
    int val;
    Nodes next;

    public Nodes(int val){
        this.val = val;
    }

}
