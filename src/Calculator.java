public class Calculator {

    private static int percentIncrement=1;
    public static double add(double x, double y){
        return x+y;
    }

    public static double minus(double x, double y){
        return x-y;
    }

    public static double multiply(double x, double y){
        return x*y;
    }

    public static double divide(double x, double y){

        if(y==0){
            System.out.println("You cannot divide a number with 0.");
            return 1;
        }
        return x/y;
    }

    public static double percent(double x){

        percentIncrement*=100;
        return x/percentIncrement;

    }

    public static double ln(double x){

        return Math.log10(x);
    }

    public static double log(double y){
        return Math.log(y);
    }

    public static double sin(double y){
        double x = Math.toRadians(y);
        return Math.sin(x);
    }

    public static double cos(double y){
        double x = Math.toRadians(y);
        return Math.cos(x);
    }

    public static double tan(double y){
        double x = Math.toRadians(y);
        return Math.tan(x);
    }

    public static double ctg(double y){
        double x = Math.toRadians(y);
        return 1.0/Math.tan(x);
    }

    public static double pow2(double y){
        return Math.pow(y,2);
    }

    public static double pown(double x, double y){
        return Math.pow(x,y);
    }

    public static double sqrt(double y){
        return Math.sqrt(y);
    }

    public static double fact(double y){
        double factSum=1;
        for(int i=1;i<=y;i++){
            factSum*=i;
        }
        return factSum;
    }


}
