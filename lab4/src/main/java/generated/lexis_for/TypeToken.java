package generated.lexis_for;

import java.util.regex.Pattern;

public enum TypeToken {
    END("\\$"),
    WORD("[a-zA-Z]+"),
    NUM("[0-9]+"),
    FOR("for"),
    OB("\\("),
    CB("\\)"),
    SEM(";"),
    ASSIGN("="),
    INC("\\+\\+"),
    DEC("--"),
    EQ("=="),
    GREQ(">="),
    LEEQ("<="),
    NEQ("!="),
    GR(">"),
    LE("<");
    private final Pattern pattern;

    TypeToken (String regexp) {
        this.pattern = Pattern.compile(regexp);
    }

    public boolean match(String text) {
        return pattern.matcher(text).matches();
    }
}
