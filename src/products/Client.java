package products;

public final class Client {

    private static ProductA prodA;
    private static ProductB prodB;
    private static ProductC prodC;


    public Client(){
        prodA = new ProductA();
    }

    public void foo(){
        prodA.foo();
        prodB = new ProductB();
        prodB.foo();
        prodC = new ProductC();
        prodC.foo();
    }
}