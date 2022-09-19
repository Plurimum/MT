package grammar;

import java.util.List;

public class Grammar {

    public String name;
    public List<Terminal> terminals;
    public List<Rule> rules;

    public Grammar(final String name, final List<Terminal> terminals, final List<Rule> rules) {
        this.name = name;
        this.terminals = terminals;
        this.rules = rules;
    }
}
