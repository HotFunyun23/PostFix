public class PostFix {


    //instance data
    Stack s;
    String input;
    int counter;

    //default constructor
    public PostFix(String input){
        s = new Stack();
        this.input = input;
    }

    //set input
    public void setInput(String Input){
        input=Input;
    }

    //toStack method
    public void toStack(){
        String str = input;
        Stack prob = new Stack();
        for (int i=str.length()-1;i>=0;i=i-2){
            System.out.print(str.charAt(i));
            prob.push(str.charAt(i));
        }
        System.out.println();
        s=prob;
    }



}
