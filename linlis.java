import java.util.*;
class dll
{
    class node
    {
        int data;
        node prev,next;
        public node(int d)
        {
            data=d;
        }
    }
    node head=null,tail=null,ptr=null,current;
    public void addnode(int data)
    {
        node newnode=new node(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
            head.prev=null;
            tail.prev=null;
            head.next=null;
            tail.prev=null;
        }
        else
        {
            head.prev=newnode;
            newnode.next=head;
            head=newnode;
            head.prev=null;
        }
    }
    public void delnode(int item)
    {
        int f=0;
        ptr=head;
        while(ptr!=null)
        {
            if(ptr.data==item)
            {
                f=1;
                break;
            }
            ptr=ptr.next;
        }
        if(f==1)
        {
            if(head==null)
            {
                System.out.println("The list is empty\n");

            }
            else
            {
                if(ptr==head)
                {
                    System.out.println(ptr.data+" was deleted");
                    head=ptr.next;
                    if(head!=null)
                    {
                        head.prev=null;
                    }
                    else
                    {
                        tail=null;
                    }
                }
                else
                {
                    System.out.println(ptr.data+" was deletd");
                    (ptr.prev).next=ptr.next;
                    if(ptr.next!=null)
                    {
                        (ptr.next).prev=ptr.prev;
                    }
                    else
                    {
                        tail=ptr.prev;
                    }
                }
            }
        }
        else
        {
            System.out.println("Node does not exist");
        }
    }
    public void display()
    {
        current=head;
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            while(current!=null)
            {
                System.out.print(current.data+" ");
                current=current.next;
            }
        }
    }
}
class linlis
{
    public static void main(String arg[])
    {
        int data,ch;
        Scanner sc=new Scanner(System.in);
        dll dl=new dll();
        do
        {
                System.out.println("Enter\t1-Insert\t2-delete\t3-display\n");
                ch=sc.nextInt();
                switch(ch)
                 {
                         case 1 :System.out.println("Enter the data to be inserted\n");
                                data=sc.nextInt();
                                dl.addnode(data);
                                break;
                         case 2 :System.out.println("enter the value to be deleted\n");
                                 data=sc.nextInt();
                                dl.delnode(data);
                                break;
                          case 3 : dl.display();
                                    System.out.println(" ");
                                      break;
                         default :System.out.println("Invalid choice\n");
                                    break;       
                  }
            }while(ch<4);        

    }
}