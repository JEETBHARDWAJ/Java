// abs class can not  access by object
abstract class Bank{

    String holder_name;
    int mob_no; 
    String addres;
    String date_of_birth;
    void insert_detail(String s1, int i1, String s2, String s3)
    {
        holder_name = s1;
        mob_no = i1;
        addres = s2;
        date_of_birth=s3;
    }

    void user_detail(){
        System.out.println(holder_name);
        System.out.println(mob_no);
        System.out.println(addres);
        System.out.println(date_of_birth);
    }
    
}

class  Saving extends Bank{
   Saving() {System.out.println("saving");}
    
    
}
class Current extends Bank{
Current() {System.out.println("Current");}

}


class Abstractt{

    public static void main(String args[])
    {
       Saving s1 = new Saving();
       s1.insert_detail("jeet_bhardwaj", 101132," biahr patna ", "fal");
       s1.user_detail();
        
    }
}