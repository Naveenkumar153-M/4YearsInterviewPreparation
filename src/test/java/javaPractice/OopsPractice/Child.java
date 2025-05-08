package javaPractice.OopsPractice;

public class Child extends Parent {

    @Override
    public void property(String land){
        System.out.println(land);
        System.out.println("Child Method");
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.property("House");
    }

}
