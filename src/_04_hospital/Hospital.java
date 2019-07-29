package _04_hospital;

import java.util.ArrayList;

import _04_hospital.Doctor.DoctorFullException;

public class Hospital {
	ArrayList<Doctor> doctors;
	ArrayList<Patient> patients;
	public Hospital()
	{
		doctors = new ArrayList<Doctor>();
		patients = new ArrayList<Patient>();
	}
	public void addDoctor(Doctor doc)
	{
		doctors.add(doc);
	}
	public ArrayList<Doctor> getDoctors()
	{
		return doctors;
	}
	public void addPatient(Patient pat)
	{
		patients.add(pat);
	}
	public ArrayList<Patient> getPatients()
	{
		return patients;
	}
	public void assignPatientsToDoctors() throws DoctorFullException {
		int patientNum = 0;
		for(int i = 0; i < doctors.size(); i++)
		{
			while(doctors.get(i).getPatients().size() < 3 && patientNum < patients.size())
			{
				doctors.get(i).assignPatient(patients.get(patientNum));
				patientNum++;
			}
		}
	}
}
