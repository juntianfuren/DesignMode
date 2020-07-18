/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2020. All Rights Reserved.
 */

package com.jtfr.piece17;

import javax.xml.ws.Response;

import org.apache.http.client.HttpClient;
import org.omg.CORBA.Request;

public class Transporter {
    private HttpClient httpClient;

    public Transporter(HttpClient httpClient) {
        this.httpClient = httpClient;
    }
    
    public Response sendRequest(Request request) {
        // HttpClient send request
        return null;
    }
}
