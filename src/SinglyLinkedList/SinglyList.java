package SinglyLinkedList;

import org.w3c.dom.NodeList;

public class SinglyList {
    private ListNode head;




    //we have to create the node
    private static  class  ListNode{
//        the data
        private  int data;
//        listNode to next
        private  ListNode next;
//        we need a constructor;
        public ListNode(int data){

            this.data=data;
            this.next=null;
        }

    }


//    ! DISPLAY EACH DATA OF THE NODE
    public  void  display(ListNode head){
        ListNode current= head;

        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.print("null");
        System.out.println();
    }

//    ! COUNT THE NUMBER OF NODES ON THE LIST
    public  int  LengthOfList(){
        ListNode current= head;
        int count =0;
        while(current!=null){
            count++;
            current=current.next;
        }

        System.out.println("the list has "+count+" nodes");
        return  count;
    }


//    ! ADD A NODE AT THE BEGINING OF THE LIST
    public  void insertAtBegining(){
        ListNode newNode= new ListNode(30);

        newNode.next=head;
        head=newNode;

    }

//    !INSERT AT THE END OF THE SINGLY LIST

    public  void insertAtTheEnd(){
        ListNode newNode=new ListNode(39);

        if(head==null){
            head=newNode;
           return;
        }
        ListNode current=head;


        while (current.next!=null){
            current=current.next;
        }
        current.next=newNode;

    }

//    !  INSERT A NODE AT ANY POSITION OF A LIST

    public  void insertAtAnyPosition(int data,int position) {

//        ! create the new Node
        ListNode newNode = new ListNode(data);
        SinglyList list2 = new SinglyList();

        int length = LengthOfList();
//        check fist if we want to insert at the head

        if (position <= length + 1) {
            if (position == 1) {
                newNode.next = head;
                head = newNode;
            } else {

//            we need to loop the list to that position
                ListNode previous = head;
                int count = 1;
                while (count < position - 1) {
                    previous = previous.next;
                    count++;
                }


//            now we have access to the previous position node
//            create a new temporary node
                ListNode tempNode = previous.next;


//     make the next pointer of the new node to point to te temp node
                newNode.next = tempNode;


//make the previous node .next pint to thr new node
                previous.next = newNode;


            }
        }
        else {
            System.out.println("enter a valid position");
        }
    }

    public ListNode deleteFirst(){

        if(head==null){
            return null;
        }

        ListNode temp=head;
        head=head.next;
        temp.next=null;
        return  temp;

    }


//    delete at the end of the list

    public ListNode deleteAtTheEnd(){


//        we first check the condition one if the head is not null and the head.next is ot null

        if(head==null||head.next==null){
            return null;
        }
//        we need to ponters the current and previus ones

        ListNode current= head;
        ListNode previous= null;

//      check if the currents next is not null
//       ASSING the previous to be the current and the current to be current.next
        while(current.next!=null){

            previous=current;
            current=current.next;

        }

        previous.next=null;
        return current;


    }


//    delete at any position
    public  void deleteAtAnyPosition(int position){

        if(position==1){
            head=head.next;
        }else{
//            we have to loop to the previous node
            int count=1;
            ListNode previous= head;
            while (count<position-1){
                previous=previous.next;
                count++;

            }

            ListNode current= previous.next;
            previous.next=current.next;

        }


    }

//    SEARCH FOR A NDE IN THE LIST

    public  boolean searchForAnode( int search){

        ListNode current =head;
        while(current!=null){
            if(current.data==search){
                return  true;
            }
            current=current.next;

        }
        return false;

    }


//    REVERSE A SINGLY LIST
    public  ListNode reverseList( ListNode head){


        if(head==null){
            return head;
        }
        ListNode current=head;
        ListNode previous= null;
        ListNode next=null;
        while (current!=null){

            next=current.next;
            current.next=previous;
            previous=current;
            current=next;

        }

        return previous;


    }





    public static void main(String[] args) {

        SinglyList list=new SinglyList();

        ListNode head= new ListNode(10);
        ListNode second= new ListNode(1);
        ListNode third= new ListNode(8);
        ListNode forth= new ListNode(11);
//      ! link the list

head.next=second;
second.next=third;
third.next=forth;

list.insertAtBegining();
list.insertAtTheEnd();


list.insertAtAnyPosition(15,8);
        list.display(head);
        System.out.println();
        list.searchForAnode(1);
        if(list.searchForAnode(39)){
            System.out.println("search key found");
        }else{
            System.out.println("search key not found");
        }
//System.out.println(list.deleteFirst().data);
//
//list.deleteAtTheEnd();
//list.deleteAtAnyPosition(4);
    ListNode reverseHead= list.reverseList(head);
        list.display(reverseHead);

System.out.println();
list.LengthOfList();
System.out.println();







    }

}


