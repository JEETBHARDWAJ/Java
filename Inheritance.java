class Nokia1 {
    int x;
    int imi;
    String model;


    Nokia1(){            // constructure
        x=1;
        imi= 687234871;
        model = "A393";
        System.out.println("cons 1 in working");
    }
    
}

class Nokia2 extends Nokia1 {
    Nokia2(){
        imi = 234567;
        System.out.println("cons 1 in working");
    }
    void fun(int a, String b) {
        imi = a;
        model = b;
        System.out.println(imi);
        System.out.println(model);
    }
    
}

class Inheritance {
    public static void main(String[] args) {
        Nokia2 n2 = new Nokia2();
        n2.fun(123456789, "jshdf");

        System.out.println("exit");

    }
}
