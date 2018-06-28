import java.util.Scanner;
//scanner

public class Musician {
		
		   private String name;
		   private int skillLevel;
		   private boolean inYouthGroup;
	
		   //data members
		   public Musician(String n, int sLevel, boolean iYG) {
			//Regular constructor
			  name = n;
		      skillLevel = sLevel;
		      inYouthGroup = iYG;
			}
			public Musician(String name){
			  name = null;
		      skillLevel = 0;
		      inYouthGroup = false;
				//Default constructor- no arguments or parameters
			}
			public void setName(String name){
				this.name = name;
			}
			public void setSkillLevel(int skillLevel){
			
				this.skillLevel = skillLevel;
			}
		   public void setInYouthGroup(boolean inYouthGroup)
			{
				this.inYouthGroup = inYouthGroup;
			}
			
		   //setter for all data members 
			public String getName() { return name; }
			public int getSkillLevel() { return skillLevel; }
		   public boolean getInYouthGroup() { return inYouthGroup; }
		   //Getters for the data members
		   
		   public String toString()
		   {
		   String str = "Name: " + name +
		                "\nSkill Level: " + skillLevel +
		                "\nIn Youth Group?: " + inYouthGroup;
		   return str;
		   //To-string method describing the state of student

	}

}
