public class General extends Commander{
    int awards;
    int soldiers;



    public General(String name, int age, String rank, int yearOfService, int awards, int soldiers) {
        super(name, age, rank, yearOfService);
        this.awards = awards;
        this.soldiers = soldiers;
    }

    public void infoCommander(){
        System.out.println("serve to " + super.getClass());
        System.out.println("num of awards : "+ awards);
        System.out.println("number of soldiers subordinate : "+ soldiers);
    }
}
