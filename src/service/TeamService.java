package service;

import java.util.Scanner;

import entity.Team;
import repository.TeamRepository;

public class TeamService {
	//public void printTeamDetails() {
//		Team team = TeamRepository.getMITeamDetails();
//			System.out.println(team.getId());
//			System.out.println(team.getTeamName());
//			System.out.println(team.getCaptainName());
//			System.out.println(team.getCoachName());
//			System.out.println(team.getnRR());
//			System.out.println(team.isQualified());
//	
//		Team team1 = TeamRepository.getCSKTeamDetails();
//			System.out.println(team1.getId());
//			System.out.println(team1.getTeamName());
//			System.out.println(team1.getCaptainName());
//			System.out.println(team1.getCoachName());
//			System.out.println(team1.getnRR());
//			System.out.println(team1.isQualified());
//			
//			Team team2 = TeamRepository.getRRTeamDetails();
//			System.out.println(team2.getId());
//			System.out.println(team2.getTeamName());
//			System.out.println(team2.getCaptainName());
//			System.out.println(team2.getCoachName());
//			System.out.println(team2.getnRR());
//			System.out.println(team2.isQualified());	
//			
//			Team team3 = TeamRepository.getKKRTeamDetails();
//			System.out.println(team3.getId());
//			System.out.println(team3.getTeamName());
//			System.out.println(team3.getCaptainName());
//			System.out.println(team3.getCoachName());
//			System.out.println(team3.getnRR());
//			System.out.println(team3.isQualified());	
//			
//			Team team4 = TeamRepository.getLSGTeamDetails();
//			System.out.println(team4.getId());
//			System.out.println(team4.getTeamName());
//			System.out.println(team4.getCaptainName());
//			System.out.println(team4.getCoachName());
//			System.out.println(team4.getnRR());
//			System.out.println(team4.isQualified());	
//			
//			Team team5 = TeamRepository.getRCBTeamDetails();
//			System.out.println(team5.getId());
//			System.out.println(team5.getTeamName());
//			System.out.println(team5.getCaptainName());
//			System.out.println(team5.getCoachName());
//			System.out.println(team5.getnRR());
//			System.out.println(team5.isQualified());	
//			
//			Team team6 = TeamRepository.getDCTeamDetails();
//			System.out.println(team6.getId());
//			System.out.println(team6.getTeamName());
//			System.out.println(team6.getCaptainName());
//			System.out.println(team6.getCoachName());
//			System.out.println(team6.getnRR());
//			System.out.println(team6.isQualified());	
//			
//			
//			Team team7 = TeamRepository.getPKTeamDetails();
//			System.out.println(team7.getId());
//			System.out.println(team7.getTeamName());
//			System.out.println(team7.getCaptainName());
//			System.out.println(team7.getCoachName());
//			System.out.println(team7.getnRR());
//			System.out.println(team7.isQualified());	
//			
//			Team team8 = TeamRepository.getGTTeamDetails();
//			System.out.println(team8.getId());
//			System.out.println(team8.getTeamName());
//			System.out.println(team8.getCaptainName());
//			System.out.println(team8.getCoachName());
//			System.out.println(team8.getnRR());
//			System.out.println(team8.isQualified());	
//			
//			Team team9 = TeamRepository.getSRHTeamDetails();
//			System.out.println(team9.getId());
//			System.out.println(team9.getTeamName());
//			System.out.println(team9.getCaptainName());
//			System.out.println(team9.getCoachName());
//			System.out.println(team9.getnRR());
//			System.out.println(team9.isQualified());	
//	}	
//}
			public void selectOptions() {
				Scanner sc = new Scanner(System.in);
				System.out.println("Welcome to IPL portal ");
				System.out.println("Please select following options - ");
				System.out.println("1. Get All Team Details");
				System.out.println("2. Get team details by short name");
				System.out.println("3. Get team details by id");
				
				int input = sc.nextInt();
				System.err.println("You have selected option : " + input);

				switch (input) {
				
				case 1: {
					System.out.println(TeamRepository.getMITeamDetails());
					System.out.println(TeamRepository.getCSKTeamDetails());
					System.out.println(TeamRepository.getRRTeamDetails());
					System.out.println(TeamRepository.getKKRTeamDetails());
					System.out.println(TeamRepository.getLSGTeamDetails());
					System.out.println(TeamRepository.getRCBTeamDetails());
					System.out.println(TeamRepository.getDCTeamDetails());
					System.out.println(TeamRepository.getPKTeamDetails());
					System.out.println(TeamRepository.getGTTeamDetails());
					System.out.println(TeamRepository.getSRHTeamDetails());
					break;
				}
				//get team details by short Name
				case 2: {
					System.out.println("Please enter your fav team's short name : ");
					String teamShortName = sc.next();
					System.err.println("Entered team short name is  : " + teamShortName);
					getTeamByShortName(teamShortName);
					break;
				}
				case 3 : {
					System.out.println("Please enter your fav team id : ");
					int id = sc.nextInt();
					System.out.println("Enter Team Id : " +id);
					getTeamById(id);
					break;
					
					// for get team details by ID
					// further logic should not have switch case
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + input);
				}
			}

			private void getTeamByShortName(String shortName) {
				// here we will write a code logic to get team details by short name
				switch (shortName) {
				case "MI": {
					System.out.println(TeamRepository.getMITeamDetails());
					break;
				}
				case "CSK" : {
					System.out.println(TeamRepository.getCSKTeamDetails());
					break;
				}
				case "RR":{
					System.out.println(TeamRepository.getRRTeamDetails());
					break;
				}
				case "KKR":{
					System.out.println(TeamRepository.getKKRTeamDetails());
					break;
				}
				case "LSG":{
					System.out.println(TeamRepository.getLSGTeamDetails());
					break;
				}
				case "RCB":{
					System.out.println(TeamRepository.getRCBTeamDetails());
					break;
				}
				case "DC":{
					System.out.println(TeamRepository.getDCTeamDetails());
					break;
				}
				case "PK":{
					System.out.println(TeamRepository.getPKTeamDetails());
					break;
				}
				case "GT":{
					System.out.println(TeamRepository.getGTTeamDetails());
					break;
				}
				case "SRH":{
					System.out.println(TeamRepository.getSRHTeamDetails());
					break;
				}
				// add remaining teams cases here.
				default:
					throw new IllegalArgumentException("Unexpected value: " + shortName);
				}
			}
			private void getTeamById(int id) {
				
				if(id==101) {
					System.out.println(TeamRepository.getMITeamDetails());
				}
				else if(id==102) {
					System.out.println(TeamRepository.getCSKTeamDetails());
				}
				else if(id==103) {
					System.out.println(TeamRepository.getRRTeamDetails());
				}
				else if(id==104) {
					System.out.println(TeamRepository.getKKRTeamDetails());
				}
				else if(id==105) {
					System.out.println(TeamRepository.getLSGTeamDetails());
				}
				else if(id==106) {
					System.out.println(TeamRepository.getRCBTeamDetails());
				}
				else if(id==107) {
					System.out.println(TeamRepository.getDCTeamDetails());
				}
				else if(id==108) {
					System.out.println(TeamRepository.getPKTeamDetails());
				}
				else if(id==109) {
					System.out.println(TeamRepository.getGTTeamDetails());
				}
				else if(id==110) {
					System.out.println(TeamRepository.getSRHTeamDetails());
				}
				else {
					System.out.println("Enter a valid option.");
				}
		}
}		