/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital;

/**
 *
 * @author nefisebuseuzun
 */
public class Hospital {

    private String hospitalName;
    private int numberOfDoctors;
    private int numberOfPatients;
    private int sizeOfPatients=0;
    private int sizeOfDoctors=0;
    Doctor doctors[]=new Doctor[sizeOfDoctors];
    Patient patients[]=new Patient[sizeOfPatients]; 

    public Hospital(){    
        this.hospitalName="No name";
        this.sizeOfPatients=0;
        this.sizeOfDoctors=0;
        doctors=new Doctor[sizeOfDoctors];
        patients=new Patient[sizeOfPatients];
        
    }
    public Hospital(String hospitalName, int sizeOfPatients, int sizeOfDoctors) {
        this.hospitalName = hospitalName;
        this.sizeOfDoctors=sizeOfDoctors;
        this.sizeOfPatients=sizeOfPatients;
        this.doctors=new Doctor[sizeOfDoctors];
        this.patients=new Patient[sizeOfPatients];
    }
    
    public Hospital(Hospital h) {
        this.hospitalName = h.hospitalName;
        this.numberOfDoctors = h.numberOfDoctors;
        this.numberOfPatients = h.numberOfPatients;
        doctors=new Doctor[h.sizeOfDoctors];
        patients=new Patient[h.sizeOfPatients];
    }
    
    public String getHospitalName() {
        return hospitalName;
    }

    public int getNumberOfDoctors() {
        return numberOfDoctors;
    }

    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    public int getSizeOfPatients() {
        return sizeOfPatients;
    }

    public int getSizeOfDoctors() {
        return sizeOfDoctors;
    }

    public Doctor[] getDoctors() {
        return doctors;
    }

    public Patient[] getPatients() {
        return patients;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void setNumberOfDoctors(int numberOfDoctors) {
        this.numberOfDoctors = numberOfDoctors;
    }

    public void setNumberOfPatients(int numberOfPatients) {
        this.numberOfPatients = numberOfPatients;
    }

    public void setSizeOfPatients(int sizeOfPatients) {
        this.sizeOfPatients = sizeOfPatients;
    }

    public void setSizeOfDoctors(int sizeOfDoctors) {
        this.sizeOfDoctors = sizeOfDoctors;
    }

    public void setDoctors(Doctor[] doctors) {
        this.doctors = doctors;
    }

    public void setPatients(Patient[] patients) {
        this.patients = patients;
    }
    
     public int addPatient( Patient p )
    {
	if ( numberOfPatients < sizeOfPatients ) {
            patients[numberOfPatients++]=p;
            return 0;
        }else{
            return -1 ;         
        }	      
    }
    
    public Patient findPatient( String name )
    {
	int i;	
	for ( i = 0; i < numberOfPatients; i++ )
	{
	    if ( patients[i].getPatientName().equals( name ) )
	    {
                System.out.println("Patient is found");
		return ( patients[i] );
	    }
	}
        System.out.println("Patient can not found");
	return null;
    }
    
    void addDoctor(Doctor d) {
        if (numberOfDoctors < sizeOfDoctors) {
            doctors[numberOfDoctors++] = d; 
            System.out.println("Doctor is added to the hospital");
        } else {
            System.out.println("It is full, cannot add more doctors.");
        }
    }
          
           
    public Doctor findDoctor (int id){
        for(int j=0;j<numberOfDoctors;j++)
        {
            if(doctors[j].getDoctorID()==id){                                        
            System.out.println("Doctor is found."+ "   "+doctors[j]);
            return ( doctors[j] );  
        }  
    }
        System.out.println("Doctor can not found");
        return null;
        
    }
    
    public void removePatient(Patient p) {   
        for(int i=0; i<numberOfPatients;i++){
            if(patients[i].equals(p)){
                for(int j=i;j<numberOfPatients-1;j++){                    
                    patients[j]=patients[j+1];
                }
                patients[numberOfPatients - 1] = null;  
                p.setDoctor(null);
                numberOfPatients--;
            }
        }     
    } 
}