package proxy.ver1;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/7/24 20:16
 * @since v1.0.0
 */
public class SchooleGrirl {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        SchooleGrirl jiaojiao = new SchooleGrirl();
        jiaojiao.name = "娇娇";

        Pursuit zhuojiayi = new Pursuit(jiaojiao);

        zhuojiayi.giveDolls();
        zhuojiayi.giveFlowers();
        zhuojiayi.giveChocolate();
    }
}
