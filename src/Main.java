import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        play();


    }

    public static double result;
    public static double number2;

    public static void play(){

        double number1;
        String op;
        String opLast=" ";
        int i=0;

        String textBlock= """
                + - addition
                - - subtraction
                * - multiplication
                / - division
                % - percentage
                log - logarithm
                ln - natural log
                sin - sin trigonometric function
                cos - cos trigonometric function
                tan - tangent trigonometric function
                ctg - contangent trigonometric function
                pow2 - power to exponent 2
                pown - power to exponent n
                sqrt - radical
                n! - factorial
                = - result""";

        System.out.println("Enter a number");
        number1=Integer.parseInt(scanner.nextLine());

        while(true){

            System.out.println("-".repeat(30));
            System.out.println(textBlock);
            System.out.println("Enter a symbol.");
            System.out.println("-".repeat(30));

            op=scanner.nextLine();
            if(op.equals("+") && i==0){
                System.out.println("Enter a number");
                number2 = Integer.parseInt(scanner.nextLine());
                result=Calculator.add(number1,number2);
                opLast=op;
                i=1;
            } else if (op.equals("-") && i==0) {
                System.out.println("Enter a number");
                number2 = Integer.parseInt(scanner.nextLine());
                result=Calculator.minus(number1,number2);
                i=1;
                opLast=op;
            } else if (op.equals("+")) {
                System.out.println("Enter a number");
                number2 = Integer.parseInt(scanner.nextLine());
                result = Calculator.add(result,number2);
                opLast=op;
            } else if (op.equals("-")) {
                System.out.println("Enter a number");
                number2 = Integer.parseInt(scanner.nextLine());
                result = Calculator.minus(result,number2);
                opLast=op;
            } else if (op.equals("*") && i==0) {
                System.out.println("Enter a number");
                number2 = Integer.parseInt(scanner.nextLine());
                result=Calculator.multiply(number1,number2);
                i=1;
                opLast=op;
            } else if (op.equals("/") && i==0) {
                System.out.println("Enter a number");
                number2 = Integer.parseInt(scanner.nextLine());
                result=Calculator.divide(number1,number2);
                opLast=op;
                if(result == 1){
                    System.out.println("Pick a new number!");
                    number2 = Integer.parseInt(scanner.nextLine());
                    result=Calculator.divide(number1,number2);
                }
                opLast=op;
                i=1;
            } else if (op.equals("*")) {

                System.out.println("Enter a number");
                number2 = Integer.parseInt(scanner.nextLine());
                result=Calculator.multiply(result,number2);
                opLast=op;

            } else if (op.equals("/")) {

                System.out.println("Enter a number");
                number2 = Integer.parseInt(scanner.nextLine());
                result = Calculator.divide(result,number2);
                if(result==1){
                    System.out.println("Pick a new number!");
                    number2 = Integer.parseInt(scanner.nextLine());
                    result=Calculator.divide(result,number2);
                }
                opLast=op;

            } else if (op.equals("=")) {
                System.out.println("Result = " + result);
                break;
            } else if (op.equals("%") && i==0) {
                result = Calculator.percent(number1);
                i=1;
                opLast=op;
            } else if (op.equals("%")) {
                result=Calculator.percent(result);
                opLast=op;
            } else if (op.equals("ln") && i==0) {
                result=Calculator.ln(number1);
                i=1;
                opLast=op;
            } else if (op.equals("ln")) {

                if(opLast.equals("+")){
                    result-=number2;
                    number2=Calculator.ln(number2);
                    result+=number2;
                }
                else if (opLast.equals("-")) {
                    result+=number2;
                    number2=Calculator.ln(number2);
                    result-=number2;
                } else if (opLast.equals("*")) {
                    result/=number2;
                    number2=Calculator.ln(number2);
                    result*=number2;
                }
                else if (opLast.equals("/")) {
                    result*=number2;
                    number2=Calculator.ln(number2);
                    result/=number2;
                }
                opLast=op;
            } else if (op.equals("log") && i==0) {
                result=Calculator.log(number1);
                i=1;
                opLast=op;
            } else if (op.equals("log")) {

                if(opLast.equals("+")){
                    result-=number2;
                    number2=Calculator.log(number2);
                    result+=number2;
                }
                else if (opLast.equals("-")) {
                    result+=number2;
                    number2=Calculator.log(number2);
                    result-=number2;
                } else if (opLast.equals("*")) {
                    result/=number2;
                    number2=Calculator.log(number2);
                    result*=number2;
                }
                else if (opLast.equals("/")) {
                    result*=number2;
                    number2=Calculator.log(number2);
                    result/=number2;
                }
                opLast=op;
            }else if (op.equals("sin") && i==0) {
                result=Calculator.sin(number1);
                i=1;
                opLast=op;
            } else if (op.equals("sin")) {

                if(opLast.equals("+")){
                    result-=number2;
                    number2=Calculator.sin(number2);
                    result+=number2;
                }
                else if (opLast.equals("-")) {
                    result+=number2;
                    number2=Calculator.sin(number2);
                    result-=number2;
                } else if (opLast.equals("*")) {
                    result/=number2;
                    number2=Calculator.sin(number2);
                    result*=number2;
                }
                else if (opLast.equals("/")) {
                    result*=number2;
                    number2=Calculator.sin(number2);
                    result/=number2;
                }
                opLast=op;
            }else if (op.equals("cos") && i==0) {
                result=Calculator.cos(number1);
                i=1;
                opLast=op;
            } else if (op.equals("cos")) {

                if(opLast.equals("+")){
                    result-=number2;
                    number2=Calculator.cos(number2);
                    result+=number2;
                }
                else if (opLast.equals("-")) {
                    result+=number2;
                    number2=Calculator.cos(number2);
                    result-=number2;
                } else if (opLast.equals("*")) {
                    result/=number2;
                    number2=Calculator.cos(number2);
                    result*=number2;
                }
                else if (opLast.equals("/")) {
                    result*=number2;
                    number2=Calculator.cos(number2);
                    result/=number2;
                }
                opLast=op;
            }else if (op.equals("tan") && i==0) {
                result=Calculator.tan(number1);
                i=1;
                opLast=op;
            } else if (op.equals("tan")) {

                if(opLast.equals("+")){
                    result-=number2;
                    number2=Calculator.tan(number2);
                    result+=number2;
                }
                else if (opLast.equals("-")) {
                    result+=number2;
                    number2=Calculator.tan(number2);
                    result-=number2;
                } else if (opLast.equals("*")) {
                    result/=number2;
                    number2=Calculator.tan(number2);
                    result*=number2;
                }
                else if (opLast.equals("/")) {
                    result*=number2;
                    number2=Calculator.tan(number2);
                    result/=number2;
                }
                opLast=op;
            }else if (op.equals("ctg") && i==0) {
                result=Calculator.ctg(number1);
                i=1;
                opLast=op;
            } else if (op.equals("ctg")) {

                if(opLast.equals("+")){
                    result-=number2;
                    number2=Calculator.ctg(number2);
                    result+=number2;
                }
                else if (opLast.equals("-")) {
                    result+=number2;
                    number2=Calculator.ctg(number2);
                    result-=number2;
                } else if (opLast.equals("*")) {
                    result/=number2;
                    number2=Calculator.ctg(number2);
                    result*=number2;
                }
                else if (opLast.equals("/")) {
                    result*=number2;
                    number2=Calculator.ctg(number2);
                    result/=number2;
                }
                opLast=op;
            }else if (op.equals("pow2") && i==0) {
                result=Calculator.pow2(number1);
                i=1;
                opLast=op;
            } else if (op.equals("pow2")) {

                if(opLast.equals("+")){
                    result-=number2;
                    number2=Calculator.pow2(number2);
                    result+=number2;
                }
                else if (opLast.equals("-")) {
                    result+=number2;
                    number2=Calculator.pow2(number2);
                    result-=number2;
                } else if (opLast.equals("*")) {
                    result/=number2;
                    number2=Calculator.pow2(number2);
                    result*=number2;
                }
                else if (opLast.equals("/")) {
                    result*=number2;
                    number2=Calculator.pow2(number2);
                    result/=number2;
                }
                opLast=op;
            }else if (op.equals("pown") && i==0) {
                System.out.println("Enter the exponent:");
                int exp = Integer.parseInt(scanner.nextLine());
                result=Calculator.pown(number1,exp);
                i=1;
                opLast=op;
            } else if (op.equals("pown")) {

                System.out.println("Enter the exponent:");
                int exp = Integer.parseInt(scanner.nextLine());

                if(opLast.equals("+")){
                    result-=number2;
                    number2=Calculator.pown(number2,exp);
                    result+=number2;
                }
                else if (opLast.equals("-")) {
                    result+=number2;
                    number2=Calculator.pown(number2,exp);
                    result-=number2;
                } else if (opLast.equals("*")) {
                    result/=number2;
                    number2=Calculator.pown(number2,exp);
                    result*=number2;
                }
                else if (opLast.equals("/")) {
                    result*=number2;
                    number2=Calculator.pown(number2,exp);
                    result/=number2;
                }
                opLast=op;
            }else if (op.equals("sqrt") && i==0) {

                result=Calculator.sqrt(number1);
                i=1;
                opLast=op;

            } else if (op.equals("sqrt")) {

                if(opLast.equals("+")){
                    result-=number2;
                    number2=Calculator.sqrt(number2);
                    result+=number2;
                }
                else if (opLast.equals("-")) {
                    result+=number2;
                    number2=Calculator.sqrt(number2);
                    result-=number2;
                } else if (opLast.equals("*")) {
                    result/=number2;
                    number2=Calculator.sqrt(number2);
                    result*=number2;
                }
                else if (opLast.equals("/")) {
                    result*=number2;
                    number2=Calculator.sqrt(number2);
                    result/=number2;
                }
                opLast=op;
            }else if (op.equals("n!") && i==0) {

                result=Calculator.fact(number1);
                i=1;
                opLast=op;

            } else if (op.equals("n!")) {

                if(opLast.equals("+")){
                    result-=number2;
                    number2=Calculator.fact(number2);
                    result+=number2;
                }
                else if (opLast.equals("-")) {
                    result+=number2;
                    number2=Calculator.fact(number2);
                    result-=number2;
                } else if (opLast.equals("*")) {
                    result/=number2;
                    number2=Calculator.fact(number2);
                    result*=number2;
                }
                else if (opLast.equals("/")) {
                    result*=number2;
                    number2=Calculator.fact(number2);
                    result/=number2;
                }
                opLast=op;
            }
        }

    }
}