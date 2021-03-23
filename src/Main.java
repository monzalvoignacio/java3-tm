public class Main {
    public static void main(String[] args)
    {
//        Ej 1.1
//        Password p = new Password("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$");

//        Ej 1.2
        Password ps = new PasswordSimple();
        Password pm = new PasswordMedia();
        Password pf = new PasswordFuerte();
        try {
            ps.setValue("Geeks@portal20");
            pm.setValue("Geeks@portal20");
            pf.setValue("Geeks@portal20");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
