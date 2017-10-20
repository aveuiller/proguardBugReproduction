package io.apisense.sdk.core.script.engine;
public abstract class CheckedExecutor {
    public void execute(int timeoutMs) {
        if(timeoutMs<0){
            System.out.println("pouet!");
        }
    }
}
