import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        System.out.println(count(5));
        System.out.println(calculation(3,2));
        System.out.println(calculation1(3));
        System.out.println(getMax());
        System.out.println(count1(5));
        System.out.println(calculation2(3, 4));
    }

    //Task1
    public static int count(int a){
        int x;
        for (int i=1; i< a; i++){
            x = i;
            System.out.println(x);
        }
        return a;
    }

    //Task2
    static String calculation (int a, int b){
        String result = "";
        for (int i=0; i<b; i++){
            String line = "";
            for (int j=0; j<a; j++){
                line+= "+";
            }
            result+= line + "\n";
        }
        return result;
    }

    //Task3
    static String calculation1 (int a){
        String result = "";
        for (int i=0; i<a; i++){
            String line = "";
            for (int j=0; j<a; j++){
                line+= "+";
            }
            result+= line + "\n";
        }
        return result;
    }

    //Task4
    static int getMax(){
        Scanner arg = new Scanner(System.in);
        System.out.println("Ведите два числа: ");
        int a = arg.nextInt();
        int b = arg.nextInt();
        System.out.println("Больше будет число: ");
        int x;
        if (a>b) {
            x=a;
        }
        else{
            x=b;
        }
        return x;
    }

    //Task5
    public static String count1(int a){
        if (a ==1){
            return "1";
        }
        return count(a-1) + "\n" + a;
    }

    //Task6
    static String calculation2 (int a, int b){
        int i =0;
        if (i++<a){
            int j =0;
            if (j++<b){
            }
        }
        return calculation(a,b) + "\n";
    }
}
