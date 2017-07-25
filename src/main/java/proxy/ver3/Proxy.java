package proxy.ver3;

import proxy.ver1.SchooleGrirl;

/**
 * 描述: 代理也去实现 送礼物接口
 *
 * @author 002465
 * @created 2017/7/25 20:43
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public class Proxy implements GiveGift {
    Pursuit gg;

    public Proxy(SchooleGrirl mm) {
        this.gg = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
