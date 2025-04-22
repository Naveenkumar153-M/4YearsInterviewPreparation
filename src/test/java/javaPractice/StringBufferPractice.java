package javaPractice;

public class StringBufferPractice {

    static StringBuffer buffer = new StringBuffer("Newly added in the buffer ");


    public static void toRun(){
        buffer.append("Apple");
        buffer.append("Ball" + "Catch"+ "Doggy");
        buffer.append("Eggs");
        buffer.append(786);
        buffer.append(3423445);
        buffer.append(" Final thing added in the Buffer object to the practice so it wod be nice for every once");

    }

    public static void main(String[] args) {
        toRun();
        System.out.println(buffer.capacity());
        System.out.println(buffer);
        System.out.println("Length of the Stringbuffer is :"+buffer.length());
    }
}
