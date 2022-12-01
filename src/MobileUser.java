import com.mini.project.sim.Mobile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MobileUser {
    public static void main(String[] args) throws Exception {
        Mobile iphone = new Mobile();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please Insert SIM");
        String userSIM = br.readLine();
        iphone.insertSIM(userSIM);
        System.out.println("Type 1 and press <Enter> key to send an SMS");
        System.out.println("Type 2 and press <Enter> key to to make a call");

        System.out.println(" Enter your Option");
        String option = br.readLine();

        if(option.equals("1")){
            System.out.println("type the message and press <Enter> key.");
            String message = br.readLine();
            System.out.println("Please enter Mobile No.");
            String mobileNo = br.readLine();
            if(isMobileNoValid(mobileNo)) {
                long mobileNumber = Long.parseLong(mobileNo);
                String response = iphone.sendAnSMS(mobileNumber,message);
                System.out.println(response);
            }else{
                throw new Exception("Invalid Mobile No..");
            }
        }else if(option.equals("2")){
            System.out.println("PLease Enter Mobile No.");
            String mobileNo = br.readLine();
            if(isMobileNoValid(mobileNo)) {
                long mobileNumber = Long.parseLong(mobileNo);
                String response = iphone.dialCall(mobileNumber);
                System.out.println(response);
            }else{
                throw new Exception("Invalid Mobile No..");
            }
        }else {
            System.out.println("Invalid Option Selected.");
        }

    }

    private static boolean isMobileNoValid(String mobileNo){
        if(mobileNo.length() == 10){
            return true;
        }else{
            return false;
        }

    }
}
