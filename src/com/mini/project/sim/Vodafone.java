package com.mini.project.sim;

public class Vodafone implements SIM{

    @Override
    public String sendAnSMS(long mobileNo, String message) {
        System.out.println("Processing the Implementation for Sending an SMS. Mobile No : "+ mobileNo +" , Message : " + message);
        String ack = "Vodafone : Your SMS send Successfully";
        return ack;
    }

    @Override
    public String dialCall(long mobileNo) {
        System.out.println("Calling Number : " + mobileNo);
        String ack = "Vodafone : the number you are dialing is busy,Please call after sometime.";
        return ack;
    }
}
