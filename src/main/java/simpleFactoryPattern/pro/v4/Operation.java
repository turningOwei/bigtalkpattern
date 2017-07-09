package simpleFactoryPattern.pro.v4;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/6/27 20:28
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public class Operation {
    private double _numberA = 0;
    private double _numberB = 0;

    public double get_numberA() {
        return _numberA;
    }

    public void set_numberA(double _numberA) {
        this._numberA = _numberA;
    }

    public double get_numberB() {
        return _numberB;
    }

    public void set_numberB(double _numberB) {
        this._numberB = _numberB;
    }

    public double getResult() throws Exception {
        double result = 0;
        return result;
    }
}
