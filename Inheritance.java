class Nokia1{
    int x;
    int imi;
    String model;

}
class Nokia2 extends Nokia1 {
    void fun(int a,String b){
      imi = a;
      model = b;
    }
    System.out.println(imi);
    System.out.println(model);

    
}


class Inheritance {
    public static void main(String []args){
        Nokia2 n2 = new Nokia2();
        n2.fun(123456789, "jshdf");

        System.out.println("exit");

    }
}
 