package chainofresponsibility.thirdpartydatasource.datasourceapi;

import chainofresponsibility.Client;

/**
 * Created by 002465 on 2017/9/29.
 */
public abstract class DataSourceApi {
    private String dataSourceName;
    protected DataSourceApi successor;

    public DataSourceApi(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    public void setSuccessor(DataSourceApi successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Client request);
}
