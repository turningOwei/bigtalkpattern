package proxy.ver2;

import proxy.ver1.SchooleGrirl;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/7/24 20:22
 * @since v1.0.0
 */
public class Proxy {
    SchooleGrirl mm;

    public Proxy(SchooleGrirl mm) {
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

    public static void main(String[] args) {
        SchooleGrirl jiaojiao = new SchooleGrirl();
        jiaojiao.setName("娇娇");

        Proxy daili = new Proxy(jiaojiao);
        daili.giveChocolate();
        //...
    }


}
