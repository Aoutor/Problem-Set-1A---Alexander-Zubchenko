public class Main {
    //Method1
    static double celsius = 10;
    static double fahrenheit;
    //Method2
    static int hours = 12;
    static int minutes = 25;
    static int seconds = 30;
    //Method 3
    static int t_seconds = 19000;
    public static void method1(){
        fahrenheit = celsius*1.8+32;
        System.out.println(celsius + " Celsius = " + fahrenheit);
    }
    public static void method2(){
        int crt = hours*3600 + minutes*60 + seconds;
        int srd = 24*3600 - crt;
        double percent = 100.0*crt/(24*3600);
        System.out.println("The current time is " + hours + ":" + minutes + ":" + seconds);
        System.out.println("It has been " + crt + " seconds since midnight.");
        System.out.println("There are " + srd + " seconds remaining in the day.");
        System.out.println(percent + "% of the day has passed.");
    }
    public static void method3(){
        int hours = t_seconds/3600;
        int minutes = t_seconds%3600/60;
        int seconds = (t_seconds%216000)%60;
        System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }
    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }
}