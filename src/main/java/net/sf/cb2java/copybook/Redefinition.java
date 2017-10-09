package net.sf.cb2java.copybook;

/** FOO redefines BAR
 * Keep both foo and bar
 */
public class Redefinition {

    private final String foo;
    private final String bar;

    public Redefinition(String foo, String bar) {
        this.foo = foo;
        this.bar = bar;
    }

    public String getFoo() {
        return foo;
    }

    public String getBar() {
        return bar;
    }

    public String toString() {
        return foo + " redefines " + bar;
    }
}
