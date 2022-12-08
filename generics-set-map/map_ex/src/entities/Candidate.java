package entities;

public class Candidate {
	private String name;
	private Integer numberOfVotes;
	
	public Candidate() {
	}

	public Candidate(String name, Integer numberOfVotes) {
		this.name = name;
		this.numberOfVotes = numberOfVotes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumberOfVotes() {
		return numberOfVotes;
	}

	public void setNumberOfVotes(Integer numberOfVotes) {
		this.numberOfVotes = numberOfVotes;
	}
}
