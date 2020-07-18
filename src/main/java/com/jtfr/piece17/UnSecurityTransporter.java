
package com.jtfr.piece17;

import javax.xml.ws.Response;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.HttpClient;
import org.omg.CORBA.Request;

/**
 * 改变原有逻辑行为，抛出了异常，不符合里氏替换原则
 */
public class UnSecurityTransporter extends Transporter {

    private String appId;
    private String appToken;

    public UnSecurityTransporter(HttpClient httpClient, String appId, String appToken) {
        super(httpClient);
        this.appId = appId;
        this.appToken = appToken;
    }

    @Override
    public Response sendRequest(Request request) {
        if (StringUtils.isNotBlank(appId) && StringUtils.isNotBlank(appToken)) {
            // 抛出了异常改变原有逻辑行为，，不符合里氏替换原则
            throw new RuntimeException();
        }
        //request.add
        return super.sendRequest(request);
    }
}
