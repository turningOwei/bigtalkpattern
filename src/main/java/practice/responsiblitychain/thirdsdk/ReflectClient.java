package practice.responsiblitychain.thirdsdk;

import practice.responsiblitychain.request.DataSourceRequest;
import practice.responsiblitychain.response.DataSourceResponse;
import practice.responsiblitychain.util.DataSourceApiUtil;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by 002465 on 2017/10/13.
 */
public class ReflectClient {
    public static void main(String[] args) {
        DataSourceRequest request = new DataSourceRequest();
        try {
            DataSourceApiUtil fahaiUtil =  ReflectClient.getDataSourceApiUtil("practice.responsiblitychain.thirdsdk.fahai.FahaiUtil","create");
            DataSourceApiUtil tongdunUtil =  ReflectClient.getDataSourceApiUtil("practice.responsiblitychain.thirdsdk.tongdun.TongdunUtil","create");
            DataSourceApiUtil zhengxinyongUtil =  ReflectClient.getDataSourceApiUtil("practice.responsiblitychain.thirdsdk.zhengxinyong.ZhengxinyongUtil","create");

            fahaiUtil.setSuccessor(tongdunUtil);
            tongdunUtil.setSuccessor(zhengxinyongUtil);

            /**设置责任链*/
            DataSourceResponse response = fahaiUtil.getData(request);
            System.out.println(response.getMessage());
            System.out.println("");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    public static DataSourceApiUtil getDataSourceApiUtil(String classPathAndName,String methodName) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class utilClass = Class.forName(classPathAndName);
        Method createMethod = utilClass.getDeclaredMethod(methodName, null);
        DataSourceApiUtil util = (DataSourceApiUtil)createMethod.invoke(utilClass);
        return util;
    }
}
