import javax.lang.model.element.NestingKind;

public class MainClass {



    public static void main(String[] args) {
        String password =new String("111");

        System.out.println(password);


    }



    public boolean checkPassword(String password){
        this.checkLength(password);
        this.checkAlphanumericSymbols(password);
        this.checkConsecutiveNumberAndSameN(password);
        return false;

    }
    public boolean checkLength(String password){
        if(password.length()>7 && password.length() < 26){
            return true;
        }else {
            System.out.println("Invalid password length!");
        }
        return false;
    }
    public boolean checkAlphanumericSymbols(String password){
        if(password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")){
            return true;
        }else{
            System.out.println("Invalid alphanumeric password");
        }
        return false;
    }
    public boolean checkConsecutiveNumberAndSameN(String password){
        for (int i = 0; i < password.length(); i++) {


        }
        return false;

    }

}
