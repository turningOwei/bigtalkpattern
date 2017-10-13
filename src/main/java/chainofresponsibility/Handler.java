package chainofresponsibility;

/**
 * Created by 002465 on 2017/9/29.
 */
public abstract class Handler {
    protected String name;

    protected Handler successor;

    public Handler(String name) {
        this.name = name;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Client request);
}
