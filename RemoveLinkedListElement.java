public class RemoveLinkedListElement {

    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        if(head.next == null){
            if(head.val == val){
                return head.next;
            }else{
                return head;
            }
        }
        if(head.next.next == null){
            if(head.val == val){
                if(head.next.val == val){
                    return head;
                }else{
                    return head.next;
                }
            }else{
                return head;
            }
        }
        while(head!=null&& head.val == val){
            head= head.next;
        }
        ListNode prevNode = head;
        ListNode currNode = null;
        ListNode nextNode = null;
        if (head!=null &&head.next != null) {
            currNode = head.next;
        }
        if (head!=null && head.next != null && head.next.next != null) {
            nextNode = head.next.next;
        }
        while(currNode!=null){
            if(currNode.val== val){
                prevNode.next = nextNode;
                currNode = nextNode;
                currNode.next = nextNode.next;
            }else{
                prevNode.next = currNode;
                currNode.next = nextNode;
                if(nextNode!=null){
                    nextNode = nextNode.next;
                }
                else{
                    return head;
                }
            }
        }
        return head;
    }
}
