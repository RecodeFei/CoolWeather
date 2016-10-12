package app.coolweather.com.coolweather.util;

/**
 * Created by feikuang on 2016/10/12.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
