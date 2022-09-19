package generated.parser_for;

import generated.lexis_for.LexicalAnalyzer;
import generated.lexis_for.Token;
import generated.lexis_for.TypeToken;

public class Parser {
    private final LexicalAnalyzer tokens;
    private Token token;

    private void nextToken() {
        tokens.nextToken();
        token = tokens.getToken();
    }

    public Parser(LexicalAnalyzer tokens) {
        this.tokens = tokens;
        nextToken();
    }

    public O o() {
        O res = new O("o");
        switch(token.typeToken()) {
            case EQ -> {
                if (token.typeToken() != TypeToken.EQ) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String EQ0 = token.text();
                res.addChild(token.text());
                nextToken();
            }
            case GREQ -> {
                if (token.typeToken() != TypeToken.GREQ) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String GREQ0 = token.text();
                res.addChild(token.text());
                nextToken();
            }
            case LEEQ -> {
                if (token.typeToken() != TypeToken.LEEQ) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String LEEQ0 = token.text();
                res.addChild(token.text());
                nextToken();
            }
            case NEQ -> {
                if (token.typeToken() != TypeToken.NEQ) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String NEQ0 = token.text();
                res.addChild(token.text());
                nextToken();
            }
            case GR -> {
                if (token.typeToken() != TypeToken.GR) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String GR0 = token.text();
                res.addChild(token.text());
                nextToken();
            }
            case LE -> {
                if (token.typeToken() != TypeToken.LE) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String LE0 = token.text();
                res.addChild(token.text());
                nextToken();
            }
            default ->
                throw new ParseException("No valid token: " + token.text());
        }

        return res;
    }

    public C c() {
        C res = new C("c");
        switch(token.typeToken()) {
            case WORD -> {
                if (token.typeToken() != TypeToken.WORD) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String WORD0 = token.text();
                res.addChild(token.text());
                nextToken();
                O o1 = o();
                res.addChild(o1);
                if (token.typeToken() != TypeToken.NUM) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String NUM2 = token.text();
                res.addChild(token.text());
                nextToken();
            }
            default ->
                throw new ParseException("No valid token: " + token.text());
        }

        return res;
    }

    public S s() {
        S res = new S("s");
        switch(token.typeToken()) {
            case FOR -> {
                if (token.typeToken() != TypeToken.FOR) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String FOR0 = token.text();
                res.addChild(token.text());
                nextToken();
                if (token.typeToken() != TypeToken.OB) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String OB1 = token.text();
                res.addChild(token.text());
                nextToken();
                I i2 = i();
                res.addChild(i2);
                if (token.typeToken() != TypeToken.SEM) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String SEM3 = token.text();
                res.addChild(token.text());
                nextToken();
                C c4 = c();
                res.addChild(c4);
                if (token.typeToken() != TypeToken.SEM) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String SEM5 = token.text();
                res.addChild(token.text());
                nextToken();
                K k6 = k();
                res.addChild(k6);
                if (token.typeToken() != TypeToken.CB) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String CB7 = token.text();
                res.addChild(token.text());
                nextToken();
            }
            default ->
                throw new ParseException("No valid token: " + token.text());
        }

        return res;
    }

    public D d() {
        D res = new D("d");
        switch(token.typeToken()) {
            case INC -> {
                if (token.typeToken() != TypeToken.INC) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String INC0 = token.text();
                res.addChild(token.text());
                nextToken();
            }
            case DEC -> {
                if (token.typeToken() != TypeToken.DEC) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String DEC0 = token.text();
                res.addChild(token.text());
                nextToken();
            }
            default ->
                throw new ParseException("No valid token: " + token.text());
        }

        return res;
    }

    public I i() {
        I res = new I("i");
        switch(token.typeToken()) {
            case WORD -> {
                if (token.typeToken() != TypeToken.WORD) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String WORD0 = token.text();
                res.addChild(token.text());
                nextToken();
                if (token.typeToken() != TypeToken.WORD) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String WORD1 = token.text();
                res.addChild(token.text());
                nextToken();
                if (token.typeToken() != TypeToken.ASSIGN) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String ASSIGN2 = token.text();
                res.addChild(token.text());
                nextToken();
                if (token.typeToken() != TypeToken.NUM) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String NUM3 = token.text();
                res.addChild(token.text());
                nextToken();
            }
            default ->
                throw new ParseException("No valid token: " + token.text());
        }

        return res;
    }

    public K k() {
        K res = new K("k");
        switch(token.typeToken()) {
            case WORD -> {
                if (token.typeToken() != TypeToken.WORD) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String WORD0 = token.text();
                res.addChild(token.text());
                nextToken();
                D d1 = d();
                res.addChild(d1);
            }
            default ->
                throw new ParseException("No valid token: " + token.text());
        }

        return res;
    }


    public static class O extends Tree {
        public O(String node) {
            super(node);
        }
    }

    public static class C extends Tree {
        public C(String node) {
            super(node);
        }
    }

    public static class S extends Tree {
        public S(String node) {
            super(node);
        }
    }

    public static class D extends Tree {
        public D(String node) {
            super(node);
        }
    }

    public static class I extends Tree {
        public I(String node) {
            super(node);
        }
    }

    public static class K extends Tree {
        public K(String node) {
            super(node);
        }
    }

}
