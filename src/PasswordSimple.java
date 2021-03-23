public class PasswordSimple extends Password {

    public PasswordSimple() {
        super("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}$");
    }

}
