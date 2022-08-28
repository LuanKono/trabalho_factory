package trabalhoFactoryMethods;

public class Main {
	public static void main(String[] args) {
		
		Enemy enemy01 = EnemyFactory.createEnemy("Goblin");
		
		enemy01.setName("Strygtex");
		enemy01.setPower("Lighting Shot");
		
		System.out.println(enemy01.getName());
		System.out.println(enemy01.getPower().toString());
		System.out.println("Type of enemy: " + enemy01.getClass().getSimpleName().toString());
		
		Enemy enemy02 = EnemyFactory.createEnemy("Imp");
		
		enemy02.setName("Zrop");
		enemy02.setPower("Fire bolt");
		
		System.out.println("\n");
		System.out.println(enemy02.getName());
		System.out.println(enemy02.getPower().toString());
		System.out.println("Type of enemy: " + enemy02.getClass().getSimpleName().toString());
		
		
	}
}
