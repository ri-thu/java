import java.util.*;
class Node
{
    int data;
    Node prev,next;
    public Node(int data)
    {
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
class doublylinked
{
    Node head,ptr,temp;
    public void insert(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }
    public void delete(int key)
    {
        if(head==null)
        {
            System.out.println("Linked list is empty");
        }
        else
        {
            ptr=head;
            while(ptr!=null&&ptr.data!=key)
            {
                ptr=ptr.next;
            }
            if(ptr==null)
            {
                System.out.println("Key not found");
            }
            else
            {
                temp=ptr;
                if(temp.next==null)
                {
                 (temp.prev).next=null;
                }
                else
                {
                 (temp.prev).next=temp.next;
                    (temp.next).prev=temp.prev;
                 }
            }
        }
    }
    public void display()
    {
        Node ptr;
        ptr=head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+"\t");
            ptr=ptr.next;
        }
        System.out.println();
    }
}
class dll
{
     public static void main(String[] args) 
    {
        int choice,item,key;
        doublylinked d=new doublylinked();
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("1.Insert 2.Delete 3.Display 4.exit");
            System.out.println("Enter the choice");
             choice=sc.nextInt();
            switch(choice)
            {
                case 1:System.out.println("Enter the element to be inserted");
                         item=sc.nextInt();
                        d.insert(item);
                        break;
                case 2:System.out.println("Enter the ley to be deleted");
                         key=sc.nextInt();
                        d.delete(key);
                        break;
                case 3: System.out.println("The current list is:");
                        d.display();
                        break;
                default:System.out.println("Invalid choice");
                        break;
            }
        }while(choice!=4);
    }
}