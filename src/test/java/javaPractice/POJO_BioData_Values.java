package javaPractice;
import java.util.Arrays;

public class POJO_BioData_Values {


    public static void main(String[] args) {

        POJO_BioData bioData=new POJO_BioData();

        System.out.println(bioData.getMobileNumber());
        bioData.setMobileNumber(8508250272L);
        System.out.println(bioData.getMobileNumber());


//        bioData.setFirstName("Naveenkumar");
//        bioData.setLastName("M");
//        bioData.setDob("15.03.1998");
//        bioData.setMobileNumber(8508250272L);
//        bioData.setSkills(Arrays.asList("Java","Selenium"));
//
//        System.out.println(bioData.getFirstName());
//        System.out.println(bioData.getLastName());
//        System.out.println(bioData.getDob());
//        System.out.println(bioData.getMobileNumber());
//        System.out.println(bioData.getMobileNumber());
//        System.out.println(bioData.getSkills());

    }
}
