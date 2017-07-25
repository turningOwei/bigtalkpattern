package proxy.ver4;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/7/25 20:55
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public class RealSubject extends Subject {
    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
