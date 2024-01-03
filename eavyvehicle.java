class truck {
    String brand;
    int wheel;
    private int no = 23;

    void fun1() {
        no = 1;
        System.out.println(no);

    }
}

public class eavyvehicle {
    public static void main(String[] usgr) {
        truck t1 = new truck();
        t1.fun1();
 
    }

}
