package com.abc.salesinventory.service.sms;

import org.smslib.GatewayException;
import org.smslib.OutboundMessage;
import org.smslib.Service;
import org.smslib.TimeoutException;
import org.smslib.modem.SerialModemGateway;

import java.io.IOException;

public class SMSMessageEngine {

    private static Service messageService;

    private String comPort = CommPortTester.getConnectedPort();
    private Integer baudRate = 9600;

    public void init() {

        try {
            SerialModemGateway gateway = new SerialModemGateway("", comPort, baudRate.intValue(), "", "");
            gateway.setInbound(true);
            gateway.setOutbound(true);
            messageService = Service.getInstance();
            messageService.addGateway(gateway);
            messageService.startService();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void stop() {
        try {
            messageService.stopService();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public OutboundMessage.MessageStatuses sendSMSMessage(String recipient, String msgText) throws InterruptedException, TimeoutException, GatewayException, IOException {

        OutboundMessage.MessageStatuses status = OutboundMessage.MessageStatuses.SENT;
        OutboundMessage msg = new OutboundMessage(recipient, msgText);
        messageService.sendMessage(msg);
        if (msg.getMessageStatus() != OutboundMessage.MessageStatuses.SENT) {
            status = OutboundMessage.MessageStatuses.FAILED;
        }
        return status;
    }

    public Integer getBaudRate() {
        return baudRate;
    }

    public void setBaudRate(Integer baudRate) {
        this.baudRate = baudRate;
    }

    public String getComPort() {
        return comPort;
    }

    public void setComPort(String comPort) {
        this.comPort = comPort;
    }

}
