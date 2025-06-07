package LogicalPrograms;

import java.util.*;

public class CommonCharInTwoString {


        public static void main(String[] args) {

            String s1="Naveenkumar".toUpperCase();
            String s2="MeiMithran".toUpperCase();

            Set<Character> set= new HashSet<>();

            for(char c1:s1.toCharArray()){
                for(char c2:s2.toCharArray()){

                    if(c1==c2){
                        set.add(c1);
                    }
                }
            }

            System.out.println(set);

        }
    }
