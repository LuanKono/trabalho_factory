package trabalhoFactoryMethods;

public class Goblin implements Enemy{
	
	private String name;
	private String power;
	
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getPower() {
		return this.power;
	}

	@Override
	public void setPower(String power) {
		this.power = power;
	}
	
}
