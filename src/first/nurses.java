package first;

import java.util.ArrayList;
import java.util.List;

public class nurses extends HealthProfessional{
    public String duty;
    public List<nurses> ArrayList = new ArrayList<>();

    @Override
    public String toString() {
        return "ID:" + ID +", name:"+name +", grade:"+ grade +", duty:"+ duty;
    }

    public nurses(){}

    public nurses(int ID, String name, String grade, String duty){
        this.ID = ID;
        this.name = name;
        this.grade = grade;
        this.duty = duty;
    }

    public void createSurgeonsList() {
        nurses nurses1 = new nurses(4,"nurses A","nurse", "give consideration to patient");
        this.ArrayList.add(nurses1);
        nurses nurses2 = new nurses(5,"nurses B","head nurse", "give consideration to patient");
        this.ArrayList.add(nurses2);
    }

    public void PrintlnSurgeons(){
        System.out.println("The Surgeons details are: " + "ID:" + ID +" ,name:"+ name +" ,grade:"+ grade +" ,duty:"+ duty);
    }
}
