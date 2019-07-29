package _04_hospital;

import java.util.ArrayList;

public class Doctor{
	ArrayList<Patient> patients;
	public Doctor()
	{
		patients = new ArrayList<Patient>();
	}
	public boolean performsSurgery()
	{
		return this instanceof Surgeon;
	}
	public boolean makesHouseCalls()
	{
		return this instanceof GeneralPractitioner;
	}
	public void assignPatient(Patient pat) throws DoctorFullException
	{
		if(patients.size() < 3)
			patients.add(pat);
		else
			throw new DoctorFullException();
	}
	public ArrayList<Patient> getPatients()
	{
		return patients;
	}
	public void doMedicine ()
	{
		for(Patient pat : patients)
		{
			pat.setCaredFor(true);
		}
	}
	class DoctorFullException extends Exception{
		
	}
}
