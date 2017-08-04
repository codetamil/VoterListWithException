package com.model;

public class TestVoter {

	
	public static void main(String[] args) throws NotEligibleToVote {
		
		Voter v1=new Voter();
		v1.setName("Arvind");
		v1.setAge(25);
		Voter v2=new Voter();
		v2.setName("Sai Ram");
		v2.setAge(17);
		int agearray[]= new int[]{v1.getAge(),v2.getAge()};
		
		
		for(int i=0;i<agearray.length;i++)
		{
			if(agearray[i]<=18)
				throw new NotEligibleToVote("Not Eligible");
			else
				System.out.println("voter added to list ");
		}
	}

}
