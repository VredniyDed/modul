public class Person implements CAPABLE_FOR_FIGHTING_ACTIONS {
   protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected void infoPerson  (){
    System.out.println("serve to " + super.getClass());
    System.out.println("Person`s name : "+ name);
    System.out.println("Person`s age : "+ age);
}
    public void fight()  throws NullPointerException{

            if (name == null) throw new NullPointerException("Name is null");
            if (age >= 18 ) {
                System.out.println(name + " can fight");
            }


    }
    public void report() throws NullPointerException{
        if (this instanceof Soldier) {
            if (this == null){
                throw new NullPointerException("Object is null");
            }
            System.out.println(name + " can report");
        }
    }
}
