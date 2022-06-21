package com.zchuber;

import com.zchuber.utils.HttpClientUtils;

public class MsgService {

    private String url;

    private String accessKeyId;

    private String accessKeySecret;

    public MsgService(String url, String accessKeyId, String accessKeySecret) {
        this.url=url;
        this.accessKeyId=accessKeyId;
        this.accessKeySecret=accessKeySecret;
    }

    public int sendMsg(String msg) {
        return HttpClientUtils.sendMsg(url,accessKeyId,accessKeySecret,msg);
    }


}
