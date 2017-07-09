package simpleFactoryPattern.cash;

/**
 * 描述:正常收费子类
 *
 * @author 002465
 * @created 2017/6/29 21:30
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
