package proxy.ver3;

import proxy.ver1.SchooleGrirl;

/**
 * 描述: 追求者
 *
 * @author 002465
 * @created 2017/7/25 20:42
 * @since v1.0.0
 */
public class Pursuit implements GiveGift {
    SchooleGrirl mm;

    public Pursuit(SchooleGrirl mm) {
        this.mm = mm;
    }

    public void giveDolls(){
        System.out.println(mm.getName()+",送你洋娃娃");
    }
    public void giveFlowers(){
        System.out.println(mm.getName()+",送你鲜花");
    }
    public void giveChocolate(){
        System.out.println(mm.getName()+",送你巧克力");
    }

}
