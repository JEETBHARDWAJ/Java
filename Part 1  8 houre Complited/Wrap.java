class Wrap {
    public static void main(String []args)
    {
        int x = Integer.parseInt("123");
        System.out.println(x);
        



        Integer z1 = Integer.valueOf("123");
        System.out.println(z1);

        int y = z1.intValue(); 
        System.out.println(y);


    }
}