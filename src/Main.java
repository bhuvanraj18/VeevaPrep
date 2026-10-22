import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        if(b!=0){
            return a/b;
        }else return -1;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator obj = new Calculator();
        boolean bool = true;
        while(bool){
            System.out.print("Enter Your Operations[ADD,SUB,MUL,DIV,EXIT] :");
             String op = sc.next();
            switch(op.toLowerCase()){
                case "add":
            System.out.print("Enter number 1: ");
            int a1 = sc.nextInt();
            System.out.print("Enter number 2: ");
            int b1 = sc.nextInt();
                    System.out.println("Addition : " + obj.add(a1,b1));
                    break;
                case "sub":
                    System.out.print("Enter number 1: ");
                    int a2 = sc.nextInt();
                    System.out.print("Enter number 2: ");
                    int b2 = sc.nextInt();
                    System.out.println("Subtraction : " + obj.sub(a2,b2));
                    break;
                case "mul":
                    System.out.print("Enter number 1: ");
                    int a3 = sc.nextInt();
                    System.out.print("Enter number 2: ");
                    int b3 = sc.nextInt();
                    System.out.println("Multiplication : " + obj.mul(a3,b3));
                    break;
                case "div":
                    System.out.print("Enter number 1: ");
                    int a4 = sc.nextInt();
                    System.out.print("Enter number 2: ");
                    int b4 = sc.nextInt();
                    System.out.println("Division : " + obj.div(a4,b4));
                    break;
                case "exit":
                    System.out.println("Thankyou!!");
                    bool = false;
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
        }
    }
}
