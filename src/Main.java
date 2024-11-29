import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //neka dummy promena
//        Person person = new Person("Sanja","Stanković",25,180,60);
//        Person person = new Person();
//        person.name = "Sanja";
//        person.setSurname("Stanković");
//        person.age = 25;
//        person.height = 180;
//        person.weight = 60;
//
//        System.out.println(person.ime());
//        person.setName("Branka");
//        Student student = new Student("Nikola","Đorđević",43,179,73,"IV-3");
//        student.classNumber = "IV-5";
//        student.movement("Car");
//
//
//        System.out.println(person.name+" "+person.getSurname());
//        Person person1 = new Person("Nikola", "Đorđević", 43,179,74);
//
//        Person person1 = new Person();
//        person1.name = "Nikola";
//        person1.surname = "Đorđević";
//        person.name = person1.name;
//        Person person2 = new Person();
//
//        System.out.println(person.name+" "+person.getSurname());
//
//        Kalkulator kalkulator = new Kalkulator(2,3);
//        kalkulator.operand1 = 4;
//        kalkulator.operand2 = 15;
//        kalkulator.add();
//        kalkulator.sub();
//        kalkulator.mul();
//        kalkulator.div();
//
//
//        System.out.println("*************************");
//        System.out.println("#       1       2       3");
//        System.out.println("*************************");
//        for(int i=1;i<=10;i++){
//            System.out.println(i+"       "+(i*1)+"       "+(i*2)+"       "+(i*3));
//        }
//        System.out.print("    ");
//        for (int i = 1; i <= 10; i++) {
//            System.out.printf("%4d", i);
//        }
//        System.out.println();
//
//        // Print the table
//        for (int i = 1; i <= size; i++) {
//
//            System.out.printf("%4d", i);
//
//            for (int j = 1; j <= size; j++) {
//                System.out.printf("%4d", i * j);
//            }
//            System.out.println();

        DwarfWarrior dwarfWarrior = new DwarfWarrior();
        GoblinRouge goblinRouge = new GoblinRouge();
        //prvi napad goblina na dwarf-a
        goblinRouge.firePrimary();
        dwarfWarrior.receiveHit();

        //dwarf uzvraća udarac
        dwarfWarrior.firePrimary();
        goblinRouge.receiveHit();

        //goblin ponovo napada
        goblinRouge.fireSecondary();
        dwarfWarrior.receiveHit();

        //dwarf opet uzvraća udarac
        dwarfWarrior.fireSecondary();
        goblinRouge.receiveHit();

        //dwars se iznervira i napadne specijalnim udarcem
        System.out.println("Dwarf warrior uses his special attack that makes the Earth tremble!!!");
        dwarfWarrior.specialStrike1();
        goblinRouge.areaOfEffect();

        //pošto goblinu ode sva energija, on umire i igra se završava
        System.out.println("Game Over ;)");
        }
    }
