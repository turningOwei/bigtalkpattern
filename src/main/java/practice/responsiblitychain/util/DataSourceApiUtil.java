package practice.responsiblitychain.util;

import practice.responsiblitychain.request.DataSourceRequest;
import practice.responsiblitychain.response.DataSourceResponse;

/**
 * Created by 002465 on 2017/10/13.
 */
public abstract class DataSourceApiUtil <A extends DataSourceRequest,B extends DataSourceResponse>{
    private boolean isStartNode;
    /**责任链传递值*/
    protected DataSourceApiUtil successor;

    private boolean isTailNode;
    public abstract B getData(A request);

    public DataSourceApiUtil getSuccessor() {
        return successor;
    }

    public void setSuccessor(DataSourceApiUtil successor) {
        this.successor = successor;
    }

    public boolean isStartNode() {
        return isStartNode;
    }

    public void setStartNode(boolean startNode) {
        isStartNode = startNode;
    }

    public boolean isTailNode() {
        return isTailNode;
    }

    public void setTailNode(boolean tailNode) {
        isTailNode = tailNode;
    }
}
