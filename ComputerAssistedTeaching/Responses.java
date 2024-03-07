import java.security.SecureRandom;
public class Responses {

    boolean success;
    private String randomResponse;

    public Responses(boolean success){
        this.success = success;
    }

    public boolean getSuccess(){
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String positiveResponses(boolean success , int responseChoice){
        switch (responseChoice){
            case 1:
                randomResponse = "Good job";
                break;
            case 2:
                randomResponse = "Well Done";
                break;
            case 3:
                randomResponse = "Well played";
                break;
            case 4:
                randomResponse = "GG";
                break;
        }
        return randomResponse;
    }

    public String negativeResponses(boolean success , int responseChoice){
        switch (responseChoice){
            case 1:
                randomResponse = "That is a mistake";
                break;
            case 2:
                randomResponse = "Not so good";
                break;
            case 3:
                randomResponse = "You can do better";
                break;
            case 4:
                randomResponse = "FF";
                break;
        }
        return randomResponse;
    }

}
