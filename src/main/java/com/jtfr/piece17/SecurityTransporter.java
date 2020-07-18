
package com.jtfr.piece17;

import javax.xml.ws.Response;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.HttpClient;
import org.omg.CORBA.Request;

/**
 * 安全的子类，没有改变原有的逻辑，符合里氏替换原则
 */
public class SecurityTransporter extends Transporter {

    private String appId;
    private String appToken;

    public SecurityTransporter(HttpClient httpClient, String appId, String appToken) {
        super(httpClient);
        this.appId = appId;
        this.appToken = appToken;
    }

    @Override
    public Response sendRequest(Request request) {
        if (StringUtils.isNotBlank(appId) && StringUtils.isNotBlank(appToken)) {
            //request.add
            // 这里不改变原有逻辑行为，并且保证正确性，没有破坏。
        }
        return super.sendRequest(request);
    }
}
