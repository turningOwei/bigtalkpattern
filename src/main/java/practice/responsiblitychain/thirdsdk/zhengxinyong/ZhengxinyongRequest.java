package practice.responsiblitychain.thirdsdk.zhengxinyong;

import practice.responsiblitychain.request.DataSourceRequest;

/**
 * Created by 002465 on 2017/10/13.
 */
public class ZhengxinyongRequest extends DataSourceRequest {
    private String name;
    private String idNo;
    private String mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
