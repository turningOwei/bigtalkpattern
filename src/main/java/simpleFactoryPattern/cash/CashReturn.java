package simpleFactoryPattern.cash;

/**
 * 描述:返利收费子类
 *
 * @author 002465
 * @created 2017/6/29 21:32
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public class CashReturn extends CashSuper {
    private double moenyCondition = 0.0d;
    private double moneyReturn = 0.0d;
    /**返利收费，初始化时必须要输入返利条件和返利值，比如满300返100，则moneyCondition为300，moneyReturn为100*/
    public CashReturn(String moenyCondition,String moneyReturn){
        this.moenyCondition = Double.parseDouble(moenyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }
    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money >= moenyCondition)
            result = money - Math.floor(money / moenyCondition)*moenyCondition;
        return result;
    }
}
