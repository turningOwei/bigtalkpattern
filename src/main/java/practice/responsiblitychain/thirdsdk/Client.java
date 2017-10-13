package practice.responsiblitychain.thirdsdk;

import practice.responsiblitychain.request.DataSourceRequest;
import practice.responsiblitychain.response.DataSourceResponse;
import practice.responsiblitychain.thirdsdk.fahai.FahaiUtil;
import practice.responsiblitychain.thirdsdk.tongdun.TongdunUtil;
import practice.responsiblitychain.thirdsdk.zhengxinyong.ZhengxinyongUtil;
import practice.responsiblitychain.util.DataSourceApiUtil;

/**
 * Created by 002465 on 2017/10/13.
 */
public class Client {
    public static void main(String[] args) {
        DataSourceRequest request = new DataSourceRequest();

        DataSourceApiUtil tongdunUtil = TongdunUtil.create(),
                zhengxinyongUtil = ZhengxinyongUtil.create(),
                fahaiUtil = FahaiUtil.create();
        /**设置责任链*/
        fahaiUtil.setSuccessor(tongdunUtil);
        tongdunUtil.setSuccessor(zhengxinyongUtil);

        DataSourceResponse response = fahaiUtil.getData(request);
        System.out.println(response.getMessage());
    }
}
