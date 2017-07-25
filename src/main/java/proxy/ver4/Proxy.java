package proxy.ver4;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/7/25 20:55
 * @since v1.0.0
 */
public class Proxy extends Subject {
    RealSubject realSubject;
    @Override
    public void request() {
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
