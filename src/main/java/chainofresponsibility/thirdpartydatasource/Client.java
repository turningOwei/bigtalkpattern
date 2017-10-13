package chainofresponsibility.thirdpartydatasource;

import chainofresponsibility.thirdpartydatasource.datasourceapi.DataSourceApi;

/**
 * Created by 002465 on 2017/9/29.
 */
public class Client {
    private DataSourceApi dataSourceApi;

    public Client(DataSourceApi dataSourceApi) {
        this.dataSourceApi = dataSourceApi;
    }

    public DataSourceApi getDataSourceApi() {
        return dataSourceApi;
    }

    public void setDataSourceApi(DataSourceApi dataSourceApi) {
        this.dataSourceApi = dataSourceApi;
    }
}
