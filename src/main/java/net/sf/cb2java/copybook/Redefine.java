package net.sf.cb2java.copybook;

import net.sf.cb2java.types.Element;

/**
 * Redefinition of an earlier record in Cobol
 */
public class Redefine {
    /**
     * The name of this redefinition
     */
    private final String name;

    /**
     * Redefines this definition
     */
    private final String redefines;

    /**
     * With this element.
     */
    private final Element element;


    public Redefine(String name, String redefines, Element element) {
        this.name = name;
        this.redefines = redefines;
        this.element = element;
    }

    public String getName() {
        return name;
    }

    public String getRedefines() {
        return redefines;
    }

    public Element getElement() {
        return element;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Redefine redefine = (Redefine) o;

        if (!name.equals(redefine.name)) return false;
        return redefines.equals(redefine.redefines);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + redefines.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return name + " redefines " + redefines;
    }
}
