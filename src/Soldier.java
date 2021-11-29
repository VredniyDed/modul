public class Soldier extends Commander{
    int numberOfRations;
    int numberOfAllegations;

//    public Soldier(String rank, int yearOfService, int numberOfRations, int numberOfAllegations) {
//        super(rank, yearOfService);
//        this.numberOfRations = numberOfRations;
//        this.numberOfAllegations = numberOfAllegations;
//    }


    public Soldier(String name, int age, String rank, int yearOfService, int numberOfRations, int numberOfAllegations) {
        super(name, age, rank, yearOfService);
        this.numberOfRations = numberOfRations;
        this.numberOfAllegations = numberOfAllegations;
    }

    public void infoCommander(){
        System.out.println("serve to " + super.getClass());
        System.out.println("number Of Rations : "+ numberOfRations);
        System.out.println("number of allegations : "+ numberOfAllegations);
    }
}
