public class MessageUtilForJUnitTesting {

    private String message;

    public MessageUtilForJUnitTesting(String message){
        this.message = message;
    }

    public String printMessage(){
        System.out.println(message);
        return message;
    }
}
