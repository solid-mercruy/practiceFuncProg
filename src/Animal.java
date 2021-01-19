public class Animal {
    final private String specie;
    final private Boolean hopper;
    final private Boolean swimmer;

    public Animal(String specie, Boolean canHop, Boolean canSwim){
        this.specie = specie;
        this.hopper = canHop;
        this.swimmer = canSwim;
    }
    public String toString(){return specie;}
    public Boolean canHop(){return hopper;}
    public Boolean canSwim(){return swimmer;}

}
