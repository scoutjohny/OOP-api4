public class Kalkulator {
    double operand1;
    double operand2;

    public Kalkulator(double operand1,double operand2){
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
    public void add(){
        System.out.println("Zbir unetih brojeva je: "+(operand1+operand2));
    }
    public void sub(){
        System.out.println("Razlika unetih brojeva je: "+(operand1-operand2));
    }
    public void mul(){
        System.out.println("Proizvod unetih brojeva je: "+(operand1*operand2));
    }
    public void div(){
        System.out.println("Količnik unetih brojeva je: "+(operand1/operand2));
    }
}
