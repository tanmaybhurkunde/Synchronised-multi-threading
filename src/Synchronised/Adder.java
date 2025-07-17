package Synchronised;


import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    Value v;

    public Adder(Value v){
        this.v = v;
    }

    @Override
    public Void call() throws Exception {
        synchronized (v){ // it is same as v.lock.lock
            for(int i=1;i<=100;i++){
                v.x += i;
                System.out.println("Addition  " + i); ;
            }
        }// and this as v.lock.unlock

        return null;
    }
}