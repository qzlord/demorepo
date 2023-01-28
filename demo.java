public class Demo {
    public static void main(String[] args){
        System.out.println("Hello world");
        int a = 12;
        double res;
        res = kvadrat(a);
        System.out.print(res);
    }
    public static void title(){
        System.out.println("TITLE");

    }
    public static double kvadrat(int a){
        return Math.pow(a,2);
    }
}