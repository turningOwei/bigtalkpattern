package practice.responsiblitychain.datasourceapi;

import practice.responsiblitychain.response.DataSourceResponse;

/**
 * Created by 002465 on 2017/10/13.
 */
public abstract class DataSourceApi<T extends DataSourceResponse> {
    private String apiName;

    private T model;

    public DataSourceApi(String apiName, T model) {
        this.apiName = apiName;
        this.model = model;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }
}
