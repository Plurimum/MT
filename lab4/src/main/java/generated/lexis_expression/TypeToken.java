package generated.lexis_expression;

import java.util.regex.Pattern;

public enum TypeToken {
    END("\\$"),
    POW("\\*\\*"),
    PLUS("\\+"),
    MINUS("-"),
    MUL("\\*"),
    DIV("/"),
    NUM("[0-9]+"),
    OPEN("\\("),
    CLOSE("\\)");
    private final Pattern pattern;

    TypeToken (String regexp) {
        this.pattern = Pattern.compile(regexp);
    }

    public boolean match(String text) {
        return pattern.matcher(text).matches();
    }
}
