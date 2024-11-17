package first;

import java.util.ArrayList;
import java.util.List;

public class AssignmentOne {
    public List<Appointment> ArrayList = new ArrayList<>();
    public void createAppointment(Appointment param) {
        if(param.Name.isEmpty() || param.Phone.isEmpty() || param.Time.isEmpty() || param.Doctor.isEmpty()){
            System.out.println("Incomplete information");
        } else {
            this.ArrayList.add(param);
        }
    }
    public void printExistingAppointments() {
        if(this.ArrayList.isEmpty()){
            System.out.println("no appointments!");
        } else {
            for(int i=0;i<this.ArrayList.size();i++)
            {
                System.out.println("Appointments " + (i+1) + ": " + this.ArrayList.get(i));
            }
        }
    }
    public void cancelBooking(String phone) {
        if(this.useList(this.ArrayList, phone) != null){
            this.ArrayList.remove(this.useList(this.ArrayList, phone));
            System.out.println("Cancel an appointment for a record !!");
        } else {
            System.out.println("phone is not found !!");
        }
    }

    public static Object useList(List<Appointment> arr, String targetValue) {
        for(Appointment obj: arr){
            if(obj.Phone.equals(targetValue)){
                return obj;
            }
        }
        return null;
    }


    public static void main(String[] args){
        // Part 3 – Using classes and objects
        GeneralPractitioner newGeneralPractitioner= new GeneralPractitioner();
        newGeneralPractitioner.createGeneralPractitioner();
        nurses newDietitians = new nurses();
        newDietitians.createSurgeonsList();
        for(int i=0;i<newGeneralPractitioner.ArrayList.size();i++)
        {
            System.out.println("The General Practitioner " + " details are: " + newGeneralPractitioner.ArrayList.get(i));
        }
        for(int i = 0; i< newDietitians.ArrayList.size(); i++)
        {
            System.out.println("The Specialists " + " details are: " + newDietitians.ArrayList.get(i));
        }

        //Part 5 – Collection of appointments
        AssignmentOne myAssignmentOne= new AssignmentOne();
        Appointment Appointment1 = new Appointment("patient1","13011111111", "08:00", "Mr.cheng");
        Appointment Appointment2 = new Appointment("patient2","13022222222", "10:00", "Ms.wang");
        Appointment Appointment3 = new Appointment("patient3","13033333333", "14:00", "nurses A");
        Appointment Appointment4 = new Appointment("patient4","13044444444", "16:00", "nurses B");
        myAssignmentOne.createAppointment(Appointment1);
        myAssignmentOne.createAppointment(Appointment2);
        myAssignmentOne.createAppointment(Appointment3);
        myAssignmentOne.createAppointment(Appointment4);
        // print
        myAssignmentOne.printExistingAppointments();
        // cancelBooking
        myAssignmentOne.cancelBooking("13033333333");
        // print
        myAssignmentOne.printExistingAppointments();
    }
}
