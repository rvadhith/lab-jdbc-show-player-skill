package model;

public class Skill {
	Long skillId;
	String skillName;
	
	//Constructor for Skill class
	public Skill(Long skillId, String skillName) {
		this.skillId = skillId;
		this.skillName = skillName;
	}
	
	//Getters and setters for Skill class fields
	public Long getSkillId() {
		return skillId;
	}

	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}	
}
