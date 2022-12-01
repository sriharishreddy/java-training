package com.mini.project.sim;

public class Mobile{

    private SIM sim;
    public void insertSIM(String simName) throws Exception{
        String simBasePackage = "com.mini.project.sim."+simName;
        Object simObject = null;
        try {
            Class simclass = Class.forName(simBasePackage);
            simObject = simclass.newInstance();
        }catch (ClassNotFoundException ce){
            System.out.println("Invalid SIM card Inserted..!");
        }

        if(simObject instanceof SIM){
            sim = (SIM)simObject;
        }else{
            throw new Exception("Invalid SIM Inserted.");
        }
    }
    public String dialCall(long mobileNo){
        return sim.dialCall(mobileNo);
    }

    public String sendAnSMS(long mobileNo, String message) {
        return sim.sendAnSMS(mobileNo,message);
    }
}
