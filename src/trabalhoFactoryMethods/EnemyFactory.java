package trabalhoFactoryMethods;

public class EnemyFactory {
	public static Enemy createEnemy(String type) {
		if(type.equals("Goblin")) {
			return new Goblin();
		} else if(type.equals("Imp")) {
			return new Imp();
		}
		return null;
	}
}
