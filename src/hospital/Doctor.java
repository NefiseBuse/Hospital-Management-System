/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.util.Arrays;

public class Doctor {
    private String doctorName;
    private int doctorID;
    private String specialization;  //doktorun uzmanlık alanı
    private int patients[]=new int[4];
    private int noOfPatients = 0; //assignPatient
    private boolean isAvailable=true;

    public String getDoctorName() {
        return doctorName;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int[] getPatients() {
        return patients;
    }

    public int getNoOfPatients() {
        return noOfPatients;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setPatients(int[] patients) {
        this.patients = patients;
    }

    public void setNoOfPatients(int noOfPatients) {
        this.noOfPatients = noOfPatients;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public boolean equals(Object obj) { 
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Doctor other = (Doctor) obj;
        return this.doctorName.equals(other.doctorName);
    }
    
    public String toString() {
        return "Doctor{" + "doctor name=" + doctorName + ", doctor ID=" + doctorID + ", specialization=" + specialization + '}';
    }
    public Doctor(String doctorName, int doctorID, String specialization) {
        this.doctorName = doctorName;
        this.doctorID = doctorID;
        this.specialization = specialization;       
    }
    public Doctor(){   //default constructor       
        doctorName="Nefise Buse";
        doctorID=1;
        specialization="brain surgen";
        noOfPatients=0;
          

    }
    public Doctor(Doctor d){   //copy constructor
        this.doctorID=d.doctorID;
        this.doctorName=d.doctorName;
        this.specialization=d.specialization;      
        
    }
    public void assignPatient(Patient p) { // assigns a patient to the doctor
        if (isAvailable && noOfPatients < 4) {
            patients[noOfPatients] = p.getPatientID();
            p.setDoctor(this);
            noOfPatients++; 
            System.out.println("Patient is assigned...");
        }
        else if (noOfPatients == 4) {
                isAvailable = false;
                System.out.println("Doctor has full capacity. We can not added...");
            }
        
         else {
            System.out.println("Doctor is busy. We can not assign.");
        }
    }
    
    public void removePatient(Patient p) {    
        for(int i=0; i<noOfPatients;i++){
            if(patients[i] == p.getPatientID()){ 
                for(int j=i;j<noOfPatients-1;j++){                    
                    patients[j]=patients[j+1];
                }
                patients[noOfPatients - 1] = -1;               
                p.setDoctor(null);
                noOfPatients--;
                isAvailable = true; 
                return; 
            }          
        }    
        System.out.println("Patient is removed...");        
    }
    
    //isAvailable: the boolean variable which is false if any 4 patients are assigned to the doctor.
    public boolean isAvailable(){
        if(noOfPatients==4){
            System.out.println("Doctor is not available right now");
            return isAvailable==false;
            }else{
               System.out.println("Doctor is available now");
               return isAvailable==true;
            }
        }

    }