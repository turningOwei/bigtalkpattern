package chainofresponsibility.thirdpartydatasource.datasourceapi;

import chainofresponsibility.Client;

/**
 * Created by 002465 on 2017/10/12.
 */
public class TongdunApi extends DataSourceApi{

    public TongdunApi(String dataSourceName) {
        super(dataSourceName);
    }

    @Override
    public void handleRequest(Client request) {

        this.successor.handleRequest(request);
    }
}
