package arohatechproject;

public class Student {
	private int Roll;
	private String Name;
	private String Branch;
	private float Percentage;
	private String Result;
	
	public Student(int Roll,String Name, String Branch,float Percentage,String Result) {
		this.Roll=Roll;
		this.Name=Name;
		this.Branch=Branch;
		this.Percentage=Percentage;
		this.Result=Result;
	}

	public int getRoll() {
		return Roll;
	}

	public void setRoll(int roll) {
		Roll = roll;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

	public float getPercentage() {
		return Percentage;
	}

	public void setPercentage(float percentage) {
		Percentage = percentage;
	}

	public String getResult() {
		return Result;
	}

	public void setResult(String result) {
		Result = result;
	}
	

}
