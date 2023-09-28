public class Dll {
   private  Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
       if(head!=null){
        head.prev = node;
       }
       head = node; 

       
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null){
              node.prev = null;
              head = node;
              return;
        }
        while(last.next!=null){
            last = last.next;
       }

       last.next = node;
       node.prev = last;
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int val){
        Node p = find(after);
        if(p == null){
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next!=null){
            node.next.prev = node;
        }
       
    }

    public void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println();

    }








   private class Node{
    private int val;
   private Node next;
    private Node prev;
    public Node(int val){
        this.val = val;

    }
    public Node(int val, Node next, Node prev){
        this.val = val;
        this.next = next;
        this.prev = prev;
    }

   } 
}