package com.cpg.lab7.exercise6;

public class VotingMachineMain {

	public static void main(String[] args) {
		VotingMachine obj=new VotingMachine();
		obj.getRegistration();
		obj.calculateAge(obj.reg);
		obj.displayVoters();

	}

}
