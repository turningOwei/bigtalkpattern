package simpleFactoryPattern.cashUpgradeStrategy;

/**
 * 描述: 打折收费子类
 *
 * @author 002465
 * @created 2017/6/29 21:30
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public class CashRebate extends CashSuper {
    private double moneyRebate = 1d;
    public CashRebate(String moneyRebate){
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
