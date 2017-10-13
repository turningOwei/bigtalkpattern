package practice.responsiblitychain.thirdsdk.tongdun;

import practice.responsiblitychain.request.DataSourceRequest;
import practice.responsiblitychain.response.DataSourceResponse;
import practice.responsiblitychain.util.DataSourceApiUtil;

/**
 * Created by 002465 on 2017/10/13.
 * 单例模式
 */
public class TongdunUtil extends DataSourceApiUtil{
    private TongdunUtil(){}
    private volatile static TongdunUtil tongdunUtil;

    public static TongdunUtil create() {
        if (tongdunUtil == null) {
            synchronized (TongdunUtil.class) {
                tongdunUtil = new TongdunUtil();
            }
        }
        return tongdunUtil;
    }

    @Override
    public DataSourceResponse getData(DataSourceRequest request) {
        DataSourceResponse response = new TongdunResponse();
        response.setMessage("同盾信息");
        /**便于测试设置成false*/
        response.setGetDataIsSuccess(false);
        boolean isSuccess = response.isGetDataIsSuccess();
        if(!isSuccess){
            return this.successor.getData(request);
        }
        return response;
    }

}
