package repository;

import entity.Team;

public class TeamRepository {
	
	//should return MI team details
	public static Team getMITeamDetails(){
		
		Team team = new Team();
		
		team.setId(101);
		team.setTeamName("Mumbai Indians");
		team.setCaptionName("Hardik Pandya");
		team.setCoachName("Jaywardhan");
		team.setQualified(false);
		team.setnRR(2.3f);
		team.setShortName("MI");
		return team;		
	}
	
	public static Team getCSKTeamDetails(){
		
		Team team1 = new Team();
		
		team1.setId(102);
		team1.setTeamName("Chennai Superking");
		team1.setCaptionName("M.S.Dhoni");
		team1.setCoachName("Jaywardhan");
		team1.setQualified(false);
		team1.setnRR(3.4f);
		team1.setShortName("CSK");
		return team1;		
	}		
	
	public static Team getRRTeamDetails() {
		
		Team team2 = new Team();
		
		team2.setId(103);
		team2.setTeamName("Rajastahan Royal");
		team2.setCaptionName("Sanju Samson");
		team2.setCoachName("Rahul Dravid");
		team2.setQualified(false);
		team2.setnRR(5.1f);
		team2.setShortName("RR");
		return team2;
		}
		
		public static Team getKKRTeamDetails() {
			
			Team team3 = new Team();
			
			team3.setId(104);
			team3.setTeamName("Kolkata Knight Rider");
			team3.setCaptionName("Ajinkya Rahane");
			team3.setCoachName("Chandu Borde");
			team3.setQualified(false);
			team3.setnRR(1.2f);
			team3.setShortName("KKR");
			return team3;
		}
		
		public static Team getLSGTeamDetails() {
			
			Team team4 = new Team();
			
			team4.setId(105);
			team4.setTeamName("Lucknow Super Giants");
			team4.setCaptionName("RISHABH PANT");
			team4.setCoachName("JUSTIN LANGER");
			team4.setQualified(true);
			team4.setnRR(1.2f);
			team4.setShortName("LSG");
			return team4;
		}		

		public static Team getRCBTeamDetails() {
			
			Team team5 = new Team();
			
			team5.setId(106);
			team5.setTeamName("Royal Chanllenger Bengluru");
			team5.setCaptionName("Rajat Patidar");
			team5.setCoachName("Andy Flower");
			team5.setQualified(true);
			team5.setnRR(1.2f);
			team5.setShortName("RCB");
			return team5;
		}
	
		public static Team getDCTeamDetails() {
	
		Team team6 = new Team();
	
		team6.setId(107);
		team6.setTeamName("Delhi Capital");
		team6.setCaptionName("Axar Patel");
		team6.setCoachName("Hemang Badani");
		team6.setQualified(false);
		team6.setnRR(1.2f);
		team6.setShortName("DC");
		return team6;
	   }
		
		public static Team getPKTeamDetails() {
			
			Team team7 = new Team();
			
			team7.setId(108);
			team7.setTeamName("Punjab Kings XI");
			team7.setCaptionName("Shreyas ayyar");
			team7.setCoachName("Ricky Ponting");
			team7.setQualified(true);
			team7.setnRR(3.4f);
			team7.setShortName("PK");
			return team7;
		}
		
		public static Team getGTTeamDetails() {
			
			Team team8 = new Team();
			
			team8.setId(109);
			team8.setTeamName("Gujrat Titans");
			team8.setCaptionName("Shubhman Gill");
			team8.setCoachName("Ashish Nehra");
			team8.setQualified(false);
			team8.setnRR(1.2f);
			team8.setShortName("GT");
			return team8;
		}
		
		public static Team getSRHTeamDetails() {
			
			Team team9 = new Team();
			
			team9.setId(110);
			team9.setTeamName("SunRisers Hyderbad");
			team9.setCaptionName("Pat Cummins");
			team9.setCoachName("Daniel Vettori");
			team9.setQualified(false);
			team9.setnRR(3.4f);
			team9.setShortName("SRH");
			return team9;
			}	
}