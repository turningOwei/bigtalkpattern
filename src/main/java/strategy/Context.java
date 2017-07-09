package strategy;

/**
 * 描述:上下文
 *
 * @author 002465
 * @created 2017/6/29 21:57
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public class Context {
    Strategy strategy;

    /**
     * 初始化时,传入具体的策略对象
     * @param strategy
     */
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    /**
     * 根据具体的策略对象，调用其算法的方法
     */
    public void contextInterface(){
        strategy.algorithInterface();
    }





































}
