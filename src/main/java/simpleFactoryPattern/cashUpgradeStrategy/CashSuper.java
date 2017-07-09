package simpleFactoryPattern.cashUpgradeStrategy;

/**
 * 描述:现金收取超类
 *
 * @author 002465
 * @created 2017/6/29 21:27
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public abstract class CashSuper {
    /**
     * 现金收取超类的抽象方法，收取现金，参数为原价，返回为当前价
     * @param money
     * @return
     */
    public abstract double acceptCash(double money);
}
