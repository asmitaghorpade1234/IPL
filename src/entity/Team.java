package entity;

public class Team {
	
	private int id;
	
	private String teamName;
	
	private String captionName;
	
	private String coachName;
	
	private float nRR;
	
	private boolean isQualified;
	
	private String shortName;
	
	// toString() - >converts object toString
	// right click -> source -> generate toString()
	@Override
	public String toString() {
		return "Team [id=" + id + ", teamName=" + teamName + ", captionName=" + captionName + ", coachName=" + coachName
				+ ", nRR=" + nRR + ", isQualified=" + isQualified + ", shortName=" + shortName + "]";
	}	
	
	//setter - getter
	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCaptionName() {
		return captionName;
	}

	public void setCaptionName(String captionName) {
		this.captionName = captionName;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public float getnRR() {
		return nRR;
	}

	public void setnRR(float nRR) {
		this.nRR = nRR;
	}

	public boolean isQualified() {
		return isQualified;
	}

	public void setQualified(boolean isQualified) {
		this.isQualified = isQualified;
	}

	
	
	

}
