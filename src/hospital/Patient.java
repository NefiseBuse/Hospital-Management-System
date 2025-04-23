/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author nefisebuseuzun
 */
public class Patient {
private String patientName;
   private int patientID;  
   private String entryDate;
   private Doctor doctor =new Doctor();
   
    public Patient() {
        patientName="Melike";
        patientID=24;
        entryDate="03.08.2024";
        
    }

    public Patient(String patientName, int patientID, String entryDate, Doctor doctor) {
        this.patientName = patientName;
        this.patientID = patientID;
        this.entryDate = entryDate;
        this.doctor = new Doctor(doctor);
    }
    
    public Patient(Patient m){   //copy constructor
        this.patientName=m.patientName;       
        this.entryDate=m.entryDate;
        this.patientID=m.patientID;
        this.doctor=m.doctor;
    }
    
    public String getPatientName() {
        return patientName;
    }

    public int getPatientID() {
        return patientID;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

 
    public String toString() {
        return "Patient{ " + "patientName=" + patientName + ", patientID=" + patientID + ", entryDate=" + entryDate + ", doctor=" + doctor + '}';
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())  
            return false;

        Patient other = (Patient) obj;
        return this.patientID == other.patientID;
    }
    
}