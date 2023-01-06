package constructor;

class Nike{
    int shirt;
    double jeans;
Nike(String A){
    shirt = 50;
    jeans = 59.90;
    System.out.println("I have shopped at constructor.Nike "+A);
}
    void price(){
    System.out.println("The total price of items bought is: "+(shirt + jeans));
    }
}
public class Shop_Constructor {
    public static void main(String[] args){
        Nike Y = new Nike("Outlet");
        Y.price();
    }
}
