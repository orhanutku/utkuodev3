public abstract class Animal {

    static String name;
    int age;

    public Animal(String name, int age) {

        this.name = name;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract int getAgeInHumanYears(int variable);

    public void information(){

        System.out.println("Adı: " + name +"\n");
        System.out.println("Takvim Yaşı: " + age +"\n");

    };

}

