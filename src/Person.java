public class Person {
    String name;
    private String surname;
    int age;
    int height;
    int weight;
    static int iq;

    public Person(String name, String surname, int age, int height, int weight){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
        showInfo();
    }

    public Person() {
    }

    public String ime(){
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name){
        this.name = name;
    }

    public void showInfo(){
        System.out.println("Kreirana je osoba sa sledećim karakteristikama:");
        System.out.println("Ime: "+this.name);
        System.out.println("Prezime: "+this.surname);
        System.out.println("Broj godina: "+this.age);
        System.out.println("Visina: "+this.height);
        System.out.println("Težina: "+this.weight);
        System.out.println("Jupiiiiii !!!!!!");
    }

    public void movement(){
        System.out.println("Taking a stroll!");
    }

}
