package exception;

public class ExceptionTest {
    public static void main(String[] args) throws InvalidUserException{
        try{
            // connect to db
            // response invalid connecion
            //
            InvalidUserException ie = new InvalidUserException();
            throw new InvalidUserException("Calling Invalid User Exception ");
        }catch (InvalidUserException ie){
            System.out.println("Invalid User Exception");
            System.out.println(ie.getMessage());
        }
    }

}
