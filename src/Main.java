public class Main {
    //Variables
    private static int totalNumber;
    protected static int lastResult;
    public String calculator;

    //Methods
    public static int add(int a, int b){
        int sum = a+b;
        lastResult= sum;
        totalNumber++;
        return sum;
    }

    protected static int subtract(int a, int b){
        int sum= a-b;
        lastResult= sum;
        totalNumber++;
        return sum;
    }

    private static void resetCalculator(){
        lastResult=0;
    }

    public static void monthlyReset(){
        resetCalculator();
    }

    static void showTotalCalculations(){
        System.out.println("total calculations done: "+totalNumber);
    }

    static void showLastResult(){
        //local variable so we use this to print this local variable.
        int lastResult=10;
        System.out.println("Local Result: "+ lastResult);
    }

     void copyShowLastResult(){
        //local variable so we use this to print this local variable.
        int lastResult=0;
        System.out.println("Instance Result: "+lastResult);
        System.out.println("Local Result: "+ this.lastResult);
    }

    //Main method
    public static void main(String[] args) {
//I used static for methods that I wanted to call directly from main because I have not reached the objects lesson yet.
        System.out.println(add(1,2));
        System.out.println(subtract(2,1));
        monthlyReset();
        System.out.println(lastResult+" last result");
        showLastResult();
        showTotalCalculations();


    }
}