public abstract class Person {
    private String name;

    public Person(String name) { this.name = name; }

    //encapsulation and iheritance
    public String getName(){ return this.name; }

    //polymorphism
    public abstract String speak();

}
