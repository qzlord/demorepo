public class Demo {
    public static void main(String[] args){
        System.out.println("Hello world");
        int a = 12;
        int res;
        res = kvadrat(a);
        System.out.print(res);
    }
    public static void title(){
        System.out.println("TITLE");

    }
    public static int kvadrat(int a){
        return a*a;
    }
}