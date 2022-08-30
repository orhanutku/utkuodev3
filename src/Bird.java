public class Bird extends Animal {

    String breed;
    int humanYears;

    Bird(String name, String breed, int age){
        super (name,age);
        this.breed = breed;

    }

    @Override
    public int getAgeInHumanYears(int variable) {

        if ( age<=2 ){

            age = age + 11;
        }
        else{
            age = 22 + ((age - 2)*5);
        }

        humanYears = age;
        return humanYears;
    }

    @Override
    public void information() {

        super.information();
        System.out.println("Cins: " + breed + "\n");

    }


}
