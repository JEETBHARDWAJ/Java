class First {
    int x;
    int y;

    void setValue2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Second extends First {
    int z = 45;

    void setValue(int x, int y) {
        super.x = x;
        super.y = y;
        System.out.println("Value of z: " + z);
    }

    void display() {
        System.out.println("Value of x is " + super.x);
        System.out.println("Value of y is " + super.y);
    }
}

class ThisKeyword {
    public static void main(String[] args) {
        Second s2 = new Second();
        s2.setValue(85, 75);
        s2.setValue2(55, 37);

        s2.display();
    }
}
