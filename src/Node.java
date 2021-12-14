
/**
 * Node
 * Author: Conor Schaden
 * Collaborator(s): August
 * Collaboration: helped fix
 * Date: Date the program is handed in: 12/14/21
 **/

public class Node<T> {

    private T val; //data stored
    private Node Next; //child node
    private Node Prev; //parent node


    public Node(){//default constructor
        val=null;
        Next = null;
    }
    public Node(T t, Node n, Node p){//constructor with ref node and value
        this.val=t;
        this.Next=n;
        this.Prev=p;
    }
    public T getValue(){//returns value
        return val;
    }
    public Node getNext(){//returns child node
        return Next;
    }
    public Node getPrev(){//returns previous node
        return Prev;
    }

    public void setNext(Node n) {//sets connected node
        Next = n;
    }
    public void setPrev(Node n){
        Prev=n;
    }
    public void setDataType(T t){//sets value
        this.val=t;
    }
    public String toString(){ //returns the nodes data to string
        return "Node: " + val.toString();
    }
    public boolean equals(Node n){
        if (n.getValue().equals(this.getValue())){
            return true;
        }
        return false;
    }


}