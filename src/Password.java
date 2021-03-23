import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Password {
    private String value;
    private String pat;

    public Password(String pattern){
        this.pat = pattern;
    }

    public void setValue(String pwd)  throws Exception {
        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(pwd);
        boolean matchFound = matcher.find();
        if(matchFound) {
            this.value = pwd;
        } else {
            throw new Exception("Password pattern not matched");
        }
    }
}

