package simpleFactoryPattern.cashUpgradeStrategy;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/6/29 22:04
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public class CashContextSimpleFactoryCombinationStrategy {
    /***
     * 声明一个CashSuper对象
     */
    CashSuper cashSuper = null;

    /**
     * 注意参数不是具体的收费策略对象，而是一个字符串，表示收费类型
     * @param type
     */
    public CashContextSimpleFactoryCombinationStrategy(String type){
        switch (type){
            case "正常收费":
                CashNormal cashNormal = new CashNormal();
                cashSuper = cashNormal;
                break;
            case "满300返100":
                CashReturn cashReturn = new CashReturn("300","100");
                cashSuper = cashReturn;
                break;
            /**
             * 将实例化具体策略的过程由客户端转移
             */
            case "打8折":
                CashRebate cashRebate = new CashRebate("0.8");
                cashSuper = cashRebate;
                break;
        }
    }
}
