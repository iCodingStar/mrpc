package com.kongzhong.demo.interaction;

import com.kongzhong.mrpc.client.RpcClient;
import com.kongzhong.mrpc.demo.service.PayService;

/**
 * @author biezhi
 *         2017/4/19
 */
public class PayClient {

    public static void main(String[] args) throws Exception {

        RpcClient rpcClient = new RpcClient();

        final PayService payService = rpcClient.getProxyBean(PayService.class);
        System.out.println(payService.pay("pay call"));
        rpcClient.stop();
    }
}
