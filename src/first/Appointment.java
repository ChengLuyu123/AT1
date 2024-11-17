package first;
public class Appointment {

    public String Name;
    public String Phone;
    public String Time;
    public String Doctor;

    public Appointment() {}

    public Appointment(String Name,String Phone,String Time,String Doctor) {
        this.Name = Name;
        this.Phone = Phone;
        this.Time = Time;
        this.Doctor = Doctor;
    }

    @Override
    public String toString() {
        return "Name:" + Name +", Phone:"+Phone + ", Time:"+ Time +", Doctor:"+ Doctor;
    }

    public void PrintlnGeneralPractitioner(){
        System.out.println("The General Practitioner details are: " + "Name:" + Name +" ,Phone:"+ Phone + " ,Time:"+ Time +" ,Doctor:"+ Doctor);
    }

}
