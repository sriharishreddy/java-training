package com.mini.project.sim;

public interface SIM {
    public String sendAnSMS(long mobileNo,String message);
    public String dialCall(long mobileNo);
}
