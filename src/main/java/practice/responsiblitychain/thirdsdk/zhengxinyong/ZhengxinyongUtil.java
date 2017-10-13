package practice.responsiblitychain.thirdsdk.zhengxinyong;

import practice.responsiblitychain.request.DataSourceRequest;
import practice.responsiblitychain.response.DataSourceResponse;
import practice.responsiblitychain.thirdsdk.tongdun.TongdunResponse;
import practice.responsiblitychain.util.DataSourceApiUtil;

/**
 * Created by 002465 on 2017/10/13.
 * 单例模式
 */
public class ZhengxinyongUtil extends DataSourceApiUtil{
    private ZhengxinyongUtil(){}
    private volatile static ZhengxinyongUtil zhengxinyongUtil;

    public static ZhengxinyongUtil create() {
        if (zhengxinyongUtil == null) {
            synchronized (ZhengxinyongUtil.class) {
                zhengxinyongUtil = new ZhengxinyongUtil();
            }
        }
        return zhengxinyongUtil;
    }

    @Override
    public DataSourceResponse getData(DataSourceRequest request) {
        DataSourceResponse response = new ZhengxinyongResponse();
        response.setMessage("正信用信息");
        /**便于测试设置成false*/
        response.setGetDataIsSuccess(true);
        boolean isSuccess = response.isGetDataIsSuccess();
        if(!isSuccess){
            return this.successor.getData(request);
        }
        return response;
    }

}
