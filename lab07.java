public class lab07 {
  public static void main(String[] args) {
        Person myPerson = new Person("Bartosz", 20, "Warsaw", 2004);
        
        myPerson.displayInfo();
        
        myPerson.growOld(10);
        myPerson.displayInfo();
        
        myPerson.beYounger();
        myPerson.displayInfo();
    }
}
