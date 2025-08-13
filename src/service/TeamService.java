package service;

import entity.Team;
import repository.TeamRepository;

public class TeamService {
	public void printTeamDetails() {
		
		Team team = TeamRepository.getMITeamDetails();
		System.out.println(team.getId());
		System.out.println(team.getTeamName());
		System.out.println(team.getCaptionName());
		System.out.println(team.getCoachName());
		System.out.println(team.getnRR());
		System.out.println(team.isQualified());
		System.out.println("------------------------------------------------");
	
		Team team1 = TeamRepository.getCSKTeamDetails();
		System.out.println(team1.getId());
		System.out.println(team1.getTeamName());
		System.out.println(team1.getCaptionName());
		System.out.println(team1.getCoachName());
		System.out.println(team1.getnRR());
		System.out.println(team1.isQualified());
		System.out.println("------------------------------------------------");
		
		Team team2 = TeamRepository.getCSKTeamDetails();
		System.out.println(team2.getId());
		System.out.println(team2.getTeamName());
		System.out.println(team2.getCaptionName());
		System.out.println(team2.getCoachName());
		System.out.println(team2.getnRR());
		System.out.println(team2.isQualified());
		System.out.println("------------------------------------------------");
		
		Team team3 = TeamRepository.getRRTeamDetails();
		System.out.println(team3.getId());
		System.out.println(team3.getTeamName());
		System.out.println(team3.getCaptionName());
		System.out.println(team3.getCoachName());
		System.out.println(team3.getnRR());
		System.out.println(team3.isQualified());
		System.out.println("------------------------------------------------");
		
		Team team4 = TeamRepository.getKKRTeamDetails();
		System.out.println(team4.getId());
		System.out.println(team4.getTeamName());
		System.out.println(team4.getCaptionName());
		System.out.println(team4.getCoachName());
		System.out.println(team4.getnRR());
		System.out.println(team4.isQualified());
		System.out.println("------------------------------------------------");
		
		Team team5 = TeamRepository.getLSGTeamDetails();
		System.out.println(team5.getId());
		System.out.println(team5.getTeamName());
		System.out.println(team5.getCaptionName());
		System.out.println(team5.getCoachName());
		System.out.println(team5.getnRR());
		System.out.println(team5.isQualified());
		System.out.println("------------------------------------------------");
		
		Team team6 = TeamRepository.getRCBTeamDetails();
		System.out.println(team6.getId());
		System.out.println(team6.getTeamName());
		System.out.println(team6.getCaptionName());
		System.out.println(team6.getCoachName());
		System.out.println(team6.getnRR());
		System.out.println(team6.isQualified());
		System.out.println("------------------------------------------------");
		
		Team team7 = TeamRepository.getDCTeamDetails();
		System.out.println(team7.getId());
		System.out.println(team7.getTeamName());
		System.out.println(team7.getCaptionName());
		System.out.println(team7.getCoachName());
		System.out.println(team7.getnRR());
		System.out.println(team7.isQualified());
		System.out.println("------------------------------------------------");
		
		Team team8 = TeamRepository.getPKTeamDetails();
		System.out.println(team8.getId());
		System.out.println(team8.getTeamName());
		System.out.println(team8.getCaptionName());
		System.out.println(team8.getCoachName());
		System.out.println(team8.getnRR());
		System.out.println(team8.isQualified());
		System.out.println("------------------------------------------------");
		
		Team team9 = TeamRepository.getGTTeamDetails();
		System.out.println(team9.getId());
		System.out.println(team9.getTeamName());
		System.out.println(team9.getCaptionName());
		System.out.println(team9.getCoachName());
		System.out.println(team9.getnRR());
		System.out.println(team9.isQualified());
		System.out.println("------------------------------------------------");
		
		Team team10 = TeamRepository.getSRHTeamDetails();
		System.out.println(team10.getId());
		System.out.println(team10.getTeamName());
		System.out.println(team10.getCaptionName());
		System.out.println(team10.getCoachName());
		System.out.println(team10.getnRR());
		System.out.println(team10.isQualified());
	}

}
