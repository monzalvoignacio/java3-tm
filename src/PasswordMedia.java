public class PasswordMedia extends Password {

    public PasswordMedia() {
        super("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}$");
    }
}
