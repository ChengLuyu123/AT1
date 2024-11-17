package first;

public class HealthProfessional {
    public int ID;
    public String name;
    public String grade;

    HealthProfessional(){}

    HealthProfessional(int ID,String name,String grade){
        this.ID = ID;
        this.name = name;
        this.grade = grade;
    }

    public void PrintlnHealthProfessional(){
        System.out.println(" ID: " + ID);
        System.out.println(" name: " + name);
        System.out.println(" grade;: " + grade);
    }


}
