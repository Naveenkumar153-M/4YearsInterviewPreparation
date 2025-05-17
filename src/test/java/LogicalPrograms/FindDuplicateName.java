package LogicalPrograms;

import org.testng.annotations.Test;

import java.util.*;

public class FindDuplicateName {

    public static void main(String[] args) {

        String[] strValue={"Naveen","Shubaa","Naveen","Selvi","Keerthi","Sandy"};
        String[] duplicateValue=new String[strValue.length];
        String[] dupRemoved=new String[strValue.length];
        for (int i=0;i< strValue.length;i++){
            for (int j=i+1;j<strValue.length;j++){
                if (strValue[i].equalsIgnoreCase(strValue[j])){
                    System.out.println("Duplication : "+strValue[i]);
                    duplicateValue[i]=strValue[i];
                }
            }
            if (!duplicateValue[i].contains(strValue[i])){
                duplicateValue[i]=strValue[i];
            }
        }

        for (String str:dupRemoved){
            System.out.println("str "+str);
        }

}
}
