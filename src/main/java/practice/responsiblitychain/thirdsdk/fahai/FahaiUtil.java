package practice.responsiblitychain.thirdsdk.fahai;

import practice.responsiblitychain.request.DataSourceRequest;
import practice.responsiblitychain.response.DataSourceResponse;
import practice.responsiblitychain.thirdsdk.tongdun.TongdunResponse;
import practice.responsiblitychain.util.DataSourceApiUtil;

/**
 * Created by 002465 on 2017/10/13.
 * 单例模式
 */
public class FahaiUtil extends DataSourceApiUtil{
    private FahaiUtil(){}
    private volatile static FahaiUtil tongdunUtil;

    public static FahaiUtil create() {
        if (tongdunUtil == null) {
            synchronized (FahaiUtil.class) {
                tongdunUtil = new FahaiUtil();
            }
        }
        return tongdunUtil;
    }

    @Override
    public DataSourceResponse getData(DataSourceRequest request) {
        DataSourceResponse response = new FahaiResponse();
        response.setMessage("法海信息");
        /**便于测试设置成false*/
        response.setGetDataIsSuccess(false);
        boolean isSuccess = response.isGetDataIsSuccess();
        if(!isSuccess){
            System.out.println("进入下一节点:"+this.successor.getClass().getName());
            return this.successor.getData(request);
        }
        return response;
    }

}
