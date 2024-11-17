package first;

import java.util.ArrayList;
import java.util.List;

public class GeneralPractitioner extends HealthProfessional{
    public String duty;
    public List<GeneralPractitioner> ArrayList = new ArrayList<>();
    @Override
    public String toString() {
        return "ID:" + ID +", name:"+name +", grade:"+ grade +", duty:"+ duty;
    }

    public GeneralPractitioner(){}
    public GeneralPractitioner(int ID,String name,String grade, String duty){
        this.ID = ID;
        this.name = name;
        this.grade = grade;
        this.duty = duty;
    }

    public void createGeneralPractitioner() {
        GeneralPractitioner GeneralPractitioner1= new GeneralPractitioner(1,"Mr wang","director", "Check out the condition ");
        this.ArrayList.add(GeneralPractitioner1);
        GeneralPractitioner GeneralPractitioner2= new GeneralPractitioner(2,"Ms.wang","Associate Director", "Check out the condition ");
        this.ArrayList.add(GeneralPractitioner2);
        GeneralPractitioner GeneralPractitioner3= new GeneralPractitioner(3,"Mr.cheng","senior", "Check out the condition ");
        this.ArrayList.add(GeneralPractitioner3);
    }

    public void PrintlnFun(int num){
        System.out.println("The General Practitioner details are: " + "ID:" + ID +", name:"+ name +", grade:"+ grade +", duty:"+ duty);
    }

}
