
public class PostFix {

    //instance data
    Stack s;
    String input;
    int counter;

    //default constructor
    public PostFix(){
        s= new Stack();
    }

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

    public Integer calculate(){
        //calculates based on input
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '/' || input.charAt(i) == '*'){

                int value1 = (int)s.pop();
                int value2 = (int)s.pop();
                if(input.charAt(i) == '+'){
                    s.push(value2 + value1);
                }if(input.charAt(i) == '-'){
                    s.push(value2 - value1);
                }if(input.charAt(i) == '/'){
                    s.push(value2 / value1);
                }if(input.charAt(i) == '*'){
                    s.push(value2 * value1);
                }

            }else if(input.charAt(i) != ' '){

                int intPush = ((int)input.charAt(i))-48;
                while(input.charAt(i+1) != ' '){
                    i++;
                    intPush *= 10;
                    intPush += ((int)input.charAt(i))-48;

                }
                s.push(intPush);
            }
        }
        return (Integer)s.pop();
    }



}
