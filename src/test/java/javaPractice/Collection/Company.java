package javaPractice.Collection;

public interface Company {

    public void ceo();

    public void cto();

    public void director();

    public void lead();

    public void employees();


    default void room(){
        System.out.println("interace running");
    }

    public static void cash(){
        System.out.println("interace running");

    }

    public static void main(String[] args) {


    Company.cash();

    }


}
