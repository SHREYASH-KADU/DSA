public class RecLL 
{
    static class LinkedList
    {
        Node head;
        static class Node{
            int data;
            Node next;
            Node(int d)
            {
                this.data=d;
                next=null;
            }
        }

        // insert node recursively
        void recInsert(int d , int i)
        {
            Node h = this.head;
            Node n = new Node(d);
            rec(h,null,n,i);
        }
        void rec(Node p,Node j,Node n,int i)
        {
            if(i==0)
            {
                if(j==null)// or p == head
                {
                    n.next = p;
                    this.head = n;
                }
                else
                {
                    n.next = j.next;
                    j.next = n;
                }
                return;
            }
            else
            {        
                rec(p.next,p,n,--i);
            }
        }

        void insert(int d)
        {
            Node n = new Node(d);
            n.next = null;
            if(this.head==null)
            {
                this.head = n;
            }
            else
            {
                Node p = this.head;
                while(p.next != null)
                {
                    p = p.next;
                }
                p.next = n;
            }
        }

        void print()
        {
            Node p = this.head;
            while(p!=null)
            {
                System.out.println(p.data);
                p = p.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.recInsert(4,0); //inserting node recursively
        ll.recInsert(5,2); //inserting node recursively
        ll.print();

    }
}


