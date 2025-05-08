package javaPractice;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class POJO_BioData {

    private String firstName;
    private String lastName;
    private String dob;
    private long mobileNumber;
    private List skills;


    public void setFirstName(String firstName){
    this.firstName=firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setDob(String dob){
        this.dob=dob;
    }

    public String getDob(){
        return dob;
    }

    public void setMobileNumber(long mobileNumber){
        this.mobileNumber=mobileNumber;
    }

    public long getMobileNumber(){
        return mobileNumber;
    }

    public void setSkills(List skills){
        this.skills=skills;
    }

    public List getSkills(){
        return skills;
    }
}

