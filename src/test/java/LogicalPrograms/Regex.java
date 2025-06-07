package LogicalPrograms;

public class Regex {

    public static void main(String[] args) {
        String input = "hello@34%Wo$rld";

        String characterOnly = input.replaceAll("[^a-zA-Z]", "");
        System.out.println("characterOnly : "+characterOnly);

        String numberOnly = input.replaceAll("[^0-9]", "");
        System.out.println("numberOnly : "+numberOnly);

        String specialCharacterOnly = input.replaceAll("[a-zA-Z0-9]", "");
        System.out.println("specialCharacterOnly : "+specialCharacterOnly);
    }
}
