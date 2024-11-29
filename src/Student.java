public class Student extends Person{
    String classNumber;

    public Student(String name, String surname, int age, int height, int weight, String classNumber){
        super(name,surname,age,height,weight);
        this.classNumber = classNumber;
    }

    @Override
    public void movement(){
        System.out.println("Enjoying my skateboard ride!");
    }

    public void area(){}

    public void movement(String vehicle){
        System.out.println("Enjoying a ride in my "+vehicle);
    }
}
