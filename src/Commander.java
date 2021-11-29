public class Commander extends Person{
    String rank;
    int yearOfService;

    public Commander(String name, int age, String rank, int yearOfService) {
        super(name, age);
        this.rank = rank;
        this.yearOfService = yearOfService;
    }



    public void infoCommander(){
        System.out.println("serve to " + super.getClass());
        System.out.println("Rank : "+ rank);
        System.out.println("Num of years of service : "+ yearOfService);
    }
}
