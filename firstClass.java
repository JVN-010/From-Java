/**
 * firstClass
 */
import java.util.Scanner;

public class firstClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        // int y = sc.nextInt();
        // int arith = sc.nextInt();
        
      switch(x){
           case 1: System.out.println("January");
           break;
           case 2: System.out.println("February");
           break;
           case 3: System.out.println("March");
           break;
           case 4: System.out.println("April");
           break;
           default: System.out.println("Enter valid number");
        

//        if(x ==1){
//            System.out.println("January");
//        }else if(x == 2){
//            System.out.println("February");
//        }else if(x == 3){
//            System.out.println("March");
//        }else{
//            System.out.println("Enter correct content; user");
//        }

//
//switch(arith){
//    case 1: System.out.println( x + y);
//    break;
//    case 2: System.out.println( x - y);
//    break;
//    case 3: System.out.println(x * y);
//    break;
//    case 4: System.out.println(x%y);
//    break;
//    case 5: System.out.println(x*y);
//    break;
//    case 6: System.out.println( x/y);
//    break;
//    default: System.out.println("Invalid");
//}
    }
}
}