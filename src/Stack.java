/**
 * Stack.java
 * Makes stacks
 * Author: Conor Schaden
 * Collaborator(s): August
 * Collaboration: helped fix, his was prettier
 * Date: Date the program is handed in 12/14/2021
 **/

public class Stack<E, T> {
    private int length;
    private Node root;
    public Stack(){
        root=new Node();
        length=0;
    }

    //private method for publics

    private Node topNode(Node n2){//recursive method to return the current top of the stack
        if(n2.getPrev()==null){
            return n2;
        }

        return topNode(n2.getPrev());
    }


    public void push(E element){//method to make a node with new value and add it on top
        Node n2=new Node(element,null,null);

        if(length==0){//if the first value, sets value of root to new

            root.setDataType(element);

        }


        if(length==1){//cases
            n2.setNext(root);
            root.setPrev(n2);
        }


        if(length>1){//cases
            n2.setNext(topNode(root));
            topNode(root).setPrev(n2);

        }
        length++;

    }

    public T peek(){
        return (T) topNode(root).getValue();//returns top

    }


    public int size(){//returns size
        return length;

    }


    public boolean isEmpty(){
        if(length==0&&root.getValue()==null){//checks if empty
            return true;

        }
        return false;

    }


    public T pop(){
        if (length==0){
            return null;

        }
        if (length==1){
            Node f = new Node((T)root.getValue(),null,null);
            root.setDataType(null);
            root.setPrev(null);
            return (T) f.getValue();

        }
        Node temp = topNode(root);
        Node temp2 = topNode(root).getNext();//makes top after adding temporary node
        temp2.setPrev(null);
        length--;
        return (T) temp.getValue();//returns value after casting data type

    }
    public int getLength(){
        return length;
    }

}

