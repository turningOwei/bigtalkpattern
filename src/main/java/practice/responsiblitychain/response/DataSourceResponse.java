package practice.responsiblitychain.response;

/**
 * Created by 002465 on 2017/10/13.
 */
public class DataSourceResponse {
    /**从第三方获取数据成功,不抛出异常,为了实现责任链模式*/
    private boolean getDataIsSuccess;

    /**消息,方便测试用*/
    private String message;

    public boolean isGetDataIsSuccess() {
        return getDataIsSuccess;
    }

    public void setGetDataIsSuccess(boolean getDataIsSuccess) {
        this.getDataIsSuccess = getDataIsSuccess;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
