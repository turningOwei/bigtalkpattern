package proxy.ver3;

import proxy.ver1.SchooleGrirl;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/7/25 20:46
 * @since v1.0.0
 */
public class Client {
    public static void main(String[] args) {
        SchooleGrirl jiaojiao = new SchooleGrirl();
        jiaojiao.setName("娇娇");

        Proxy daili = new Proxy(jiaojiao);

        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();
    }
}
