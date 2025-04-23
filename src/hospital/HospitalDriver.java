/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;


public class HospitalDriver {
public static void main (String[]args){
    
        Hospital H1 =new Hospital("Medipol",4,1);  
        Hospital H2=new Hospital("Medicana",12,3);
        Doctor doctor1 = new Doctor("Dr. Smith", 12, "pediatri");
        Doctor doctor2 = new Doctor("Dr. Brown", 43, "Neurology");
        Doctor doctor3 = new Doctor("Dr. Smith", 1, "Cardiology");
        Patient patient1 = new Patient("Alice", 1, "2024-03-14", doctor1);
        Patient patient2 = new Patient("Alice", 1, "2024-03-14", doctor1);
        Patient patient3 = new Patient("Bob", 2, "2024-03-15", doctor3);
        Patient patient4 = new Patient("Charlie", 3, "2024-03-16", doctor3);
        Patient patient5 = new Patient("David", 4, "2024-03-17", doctor3);
        Patient patient6 = new Patient("Eve", 5, "2024-03-18", doctor3);

        System.out.println("Patient 1: " + patient1);  
        System.out.println("Patient 2: " + patient2);
        System.out.println("Patient 3: " + patient3);
        System.out.println("Patient 4: " + patient4);
        System.out.println("Patient 5: " + patient5);
        System.out.println("Patient 6: " + patient6);
        
        
        System.out.println(patient1.toString());  
        System.out.println(patient2.toString());
        System.out.println(patient2.equals(patient1));  
        
        H2.addDoctor(doctor2);
        H1.addDoctor(doctor3);    
        doctor3.assignPatient(patient1);  
        doctor3.assignPatient(patient2);
        doctor3.assignPatient(patient3);
        doctor3.assignPatient(patient4);
        doctor3.assignPatient(patient5);
        System.out.println("Nuber of patient:  "+doctor3.getNoOfPatients() +"  Nuber of doctor:  "+H1.getNumberOfDoctors());  
        
               
        
        System.out.println("Doctor 1: " + doctor1);
        System.out.println("Doctor 2: " + doctor2);
        System.out.println("Doctor 3: " + doctor3);
       
        doctor3.isAvailable();  //burda doktor dolu, 4 hastası var kapasitesini doldurmuş.
        doctor3.removePatient(patient4);  
        doctor3.removePatient(patient5);
        System.out.println("Updated nuber of patient: "+doctor3.getNoOfPatients() +"  Updated nuber of doctor: "+H1.getNumberOfDoctors()); //hastanenin güncel durumunu yazdırdım.
        doctor3.isAvailable();   // Doktorun durumunu kontrol ettim .Burda ise remove ettiğim için artık doktor müsait.
        H1.findPatient("David");
        H2.findDoctor(43);  //H2 de 43 numaralı doktor olduğu için bulundu diyecek ve bastırıcak.
        H1.findDoctor(12);  //H1 de 12 numaralı doktor olmadığı için bulunamadı diyecek.
    }
}