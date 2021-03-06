package com.hyena.spider.connector.factory;

import com.hyena.spider.redis.url.manager.HyenaUrlManager;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

public class HttpConnectionFactory {


    public static Connection getConnection() {
        // 使用HyenaUrlManager获取url
        String url  = HyenaUrlManager.getUrl() ;
        //HttpConnection.connect(url) 会跑出运行时异常
        return HttpConnection.connect(url);
    }


}
