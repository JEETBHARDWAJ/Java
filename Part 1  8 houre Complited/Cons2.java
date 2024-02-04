class InnerCons2 {
int x;
int y;
InnerCons2(){                 //constructure 1
x=2;
y=2;
}
InnerCons2(int a, int b){     // constructure 2
x=a;
y=b;
}
InnerCons2(int p){            // constructure 3
x=0;
y=0;
}
void set(){
 x= 9;
 y= 9;
}
void diplay(){
    System.out.println(x);
    System.out.println(y);
}
    
}

public class Cons2 {

    public static void main(String[] args) {
        InnerCons2 c1 = new InnerCons2();
        InnerCons2 c2 = new InnerCons2(6,7);
        InnerCons2 c3 = new InnerCons2(7);
        c1.diplay();
        c2.diplay();
        c3.diplay();
        
    }
}