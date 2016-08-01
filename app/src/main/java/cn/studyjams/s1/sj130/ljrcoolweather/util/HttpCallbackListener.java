package cn.studyjams.s1.sj130.ljrcoolweather.util;

/**
 * Created by liu on 2016/8/1.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
