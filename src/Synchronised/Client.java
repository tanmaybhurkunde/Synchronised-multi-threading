package Synchronised;
import java.util.concurrent.*;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        Value v = new Value();
        v.x = 0;

        Adder a = new Adder(v);
        Subtractor s = new Subtractor(v);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> addFuture = es.submit(a);
        Future<Void> subFuture = es.submit(s);

        addFuture.get();
        subFuture.get();

        System.out.println("Value of x: "+v.x);


    }
}