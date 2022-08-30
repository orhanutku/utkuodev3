import java.util.Scanner;

public class Dog extends Animal {

    String breed;
    int humanYears;

    Dog(String name, String breed, int age){
        super (name,age);
        this.breed = breed;
        this.humanYears = age;

    }



    @Override
    public int getAgeInHumanYears(int variable) {

        if ( age <= 2 ){

            humanYears = age + 11;

        }
        else if( age > 2){
            humanYears = 22 + ((age - 2)*5);
        }
        return humanYears;
    }

    @Override
    public void information() {

        System.out.println("Adı: " + name + "\n");
        System.out.println("Cins: " + breed + "\n");
        System.out.println("Takvim Yılı ile Yaşı: " + humanYears  + "\n");
        System.out.println("İnsan Yılı ile Yaşı: " + getAgeInHumanYears(humanYears) + "\n");

    }
}
