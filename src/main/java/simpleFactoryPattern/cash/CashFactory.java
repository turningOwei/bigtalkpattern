package simpleFactoryPattern.cash;

/**
 * 描述: 现金收费工厂类
 *
 * @author 002465
 * @created 2017/6/29 21:36
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public class CashFactory {
    public static CashSuper createCashAccept(String type){
        CashSuper cs = null;
        switch (type){
            case  "正常收费":
                cs = new CashNormal();
                break;
            case "满300返100":
                CashReturn cashReturn = new CashReturn("300","100");
                cs = cashReturn;
                break;
            case "打8折":
                CashRebate cashRebate = new CashRebate("0.8");
                cs = cashRebate;
                break;
        }
        return  cs;
    }
}
























