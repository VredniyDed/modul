public class Main {

    public static void main(String[] args) {
        Person[] headquarters = new Person[9];
        headquarters[0] = new Soldier("Name1",20,"junoir soldat",2,0,2);
        headquarters[1] = new Soldier("Name2",20,"junoir soldat",1,1,2);
        headquarters[2] = new Soldier("Name3",30,"senoir soldat",5,3,6);
        headquarters[3] = new Soldier("Name4",23,"middle soldat",2,0,2);
        headquarters[4] = new Soldier("Name5",25,"middle soldat",3,2,4);
        headquarters[5] = new Soldier("Name6",22,"middle soldat",3,0,2);
        headquarters[6] = new General("Name7",49,"middle general",15,10,2);
        headquarters[7] = new General("Name8",50,"senoir general",20,15,4);
        headquarters[8] = new Commander("Daniel",65, "Senoir commander", 40);
        for (int i = 0; i < headquarters.length; i++){
            headquarters[i].report();
            headquarters[i].fight();
            headquarters[i].infoPerson();
        }
    }



}
