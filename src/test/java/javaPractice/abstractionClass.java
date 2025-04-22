package javaPractice;

public class abstractionClass extends AbstractionPractice implements Company {

    @Override
    public void car() {

    }

    @Override
    public void newCompany() {

    }


    @Override
    public void ceo() {
        System.out.println(" CEO IS NK ");
    }

    @Override
    public void cto() {
        System.out.println(" CTO IS NKS ");

    }

    @Override
    public void director() {
        System.out.println(" DIRECTOR IS NK ");

    }

    @Override
    public void lead() {
        System.out.println(" LEAD IS NK ");

    }

    @Override
    public void employees() {

        System.out.println(" EMPLOYEES IS NK ");

    }
}


class newClass extends abstractionClass {

    public static void main(String[] args) {


        abstractionClass aClass = new newClass();
        aClass.ceo();
        aClass.cto();
        aClass.director();
        aClass.lead();
        aClass.employees();

    }
}
