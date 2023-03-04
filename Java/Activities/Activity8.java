package activities;

class customException extends Exception{
    private String message = null;

    public customException(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }
}
public class Activity8 {
    public static void main(String[] args) {
        try {
            Activity8.exceptionTest("Will print to console");
            Activity8.exceptionTest(null); // Exception is thrown here
            Activity8.exceptionTest("Won't execute");
        }
        catch(customException mae) {
            System.out.println("Inside catch block: " + mae.getMessage());
        }
    }


    static void exceptionTest(String str) throws customException {
        if (str == null) {
            throw new customException("String value is null");
        } else {
            System.out.println(str);
        }
    }
}