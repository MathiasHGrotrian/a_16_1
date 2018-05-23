package Chapter16;


import java.util.LinkedList;

public class Exercise1
{


    /*
        Write a method called set that accepts an index and a value and sets
         the list’s element at that index to have the given
        value. You may assume that the index is between 0 (inclusive) and the
         size of the list (exclusive).
     */

    public static ListNode front;

    public static void main(String[] args)
    {
        //I have made an add-method to ListNode
        addNodeToList(0,9);
        addNodeToList(1,1);
        addNodeToList(2,9);
        addNodeToList(3,3);
        addNodeToList(4,2);
        addNodeToList(5,3);

        set(1,11);
    }

    private static ListNode set(int index, int value)
    {
        ListNode current = front;

        if(front == null)
        {
            return front;
        }

        for (int i = 0; i < index; i++)
        {
            if(current == null)
            {
                System.out.println("does not exist");
                return front;
            }

            if(i == index-1)
            {
                System.out.println("Index " + index + " currently is " + current.data);
                current.data = value;
                System.out.println("Index " + index + " changed to " + current.data);
            }
            current = current.next;
        }

        return front;
    }

    private static void addNodeToList(int index, int value)
    {
        if(index == 0)
        {
            front = new ListNode(value, front);
        }
        else
        {
            ListNode current = front;
            for (int i = 0; i < index-1 ; i++)
            {
                current = current.next;
            }
            current.next = new ListNode(value,current.next);
        }
    }


}
