package simpleFactoryPattern.cashUpgradeStrategy;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/6/29 22:02
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public class CashContext {
    private CashSuper cashSuper;

    public CashContext(CashSuper cashSuper){
        this.cashSuper = cashSuper;
    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
