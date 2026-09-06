/*
Given the head of a linked list and an integer val,
remove all the nodes of the linked list that has Node.val == val, and return the new head.

My solution (removeElements method) beats 0.86% runtime-wise and 80% memory wise
 */
import java.util.ArrayList;
import java.util.List;

public class RemoveLinkedListElement {
    public static MyNode removeElementsSecond(MyNode head, int val) {

        MyNode tempNode = head;


        while (tempNode != null && tempNode.next!=null && tempNode.next.next!=null) {
            System.out.println("Inside first while");
            MyNode node1 = tempNode;
            MyNode node2 = tempNode.next;
            MyNode node3 = tempNode.next.next;

            if(node2.val==val){
                node1.next = node3;
            }else{
                node2.next = node3;
                node1.next = node2;
            }
            tempNode= tempNode.next;
        }

        while (tempNode != null && tempNode.next!=null ) {
            System.out.println("Inside second while");
            MyNode node1 = tempNode;
            MyNode node2 = tempNode.next;


            if(node2.val==val){
                node1.next = null;
            }else{
                node2.next = null;
                node1.next = node2;
            }
            tempNode= tempNode.next;
        }
        while (tempNode != null  ) {
            System.out.println("Inside third while");
            MyNode node1 = tempNode;


            if(node1.val==val){
                node1 = null;
            }
            tempNode= tempNode.next;
        }
        return head;
    }

    public static MyNode removeElements(MyNode head, int val) {
        List<Integer> intList = new ArrayList<>();
        MyNode tempNode = head;
        while (tempNode != null) {
            if(!(tempNode.val==val)){
                intList.add(tempNode.val);
            }
            tempNode= tempNode.next;
        }
        System.out.println(intList);
        if(intList.size()==0){
            return null;
        }
        if(intList.size()>0) {
            MyNode headNode = new MyNode(intList.get(0));
            MyNode currNode = headNode;
            for (int i : intList) {
                MyNode newNode = new MyNode(i);
                currNode.next = newNode;
                currNode = currNode.next;
            }
            return headNode;
        }

        return head;
    }

    static void main() {
        MyNode l1 = new MyNode(7);
        MyNode l2 = new MyNode(7);
        MyNode l3 = new MyNode(7);
        MyNode l4 = new MyNode(7);
//        MyNode l7 = new MyNode(7);
//        MyNode l5 = new MyNode(5);
//        MyNode l6 = new MyNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
//        l4.next = l5;
//        l5.next = l6;
//        l6.next = l7;
        MyNode temp = removeElementsSecond(l1,7);
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}
class MyNode{
    int val;
    MyNode next;
    public MyNode(){}
    public MyNode(int val) {
        this.val = val;
        this.next = null;
    }
    public MyNode(int val,MyNode next){
        this.val = val;
        this.next = next;
    }
}