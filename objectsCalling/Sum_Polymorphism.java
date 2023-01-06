package objectsCalling;

class Addition{
        void sum(int a, int b){
        System.out.println("The product is: "+ (a*b));
    }
    void sum(double a, int b){
        System.out.println("The sum is: "+ (a+b));
    }
    void sum(int a, int b, int c){
        System.out.println("The sum is: "+ (a+b+c));
    }
}

class Sum_Polymorphism {
    public static void main(String[] args){
        Addition A = new Addition();
        A.sum(3,4);
        A.sum(3.5,4);
        A.sum(1,2,3);
    }

}

