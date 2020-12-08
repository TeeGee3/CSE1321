import java.util.*;

class Enemy {
    int HP, damage;
    boolean isAlive;

    Enemy (int HP, int damage) {
        //initialize the variables
        HP = HP;
        damage = damage;
        isAlive = true;
    }
    void takeDamage(int amount) {
        HP -= amount;
        if (HP <= 0) isAlive = false;
    }
}

class Hero {
    //Similarly write class hero
    int HP, damage;
    boolean isAlive;
    Hero (int HP, int damage) {
        //initialize the variables
        this.HP = HP;
        this.isAlive = true;
    }
    void takeDamage(int amount) {
        HP -= amount;
        if (HP <= 0) isAlive = false;
    }
}



public class Lab13A {


       public static int numEnemies(Enemy[] enemies) {
           //calculate num of enemies left
           int numEnemiesLeft = 0;

           for (int i = 0; i < enemies.length; i++)
               if (enemies[i].isAlive == true) {
                   numEnemiesLeft++;
               }

           return numEnemiesLeft;
       }

        static void printArray(Enemy[] enemies) {
            for (int i = 0; i < enemies.length; i++) {
                System.out.print("|"+enemies[i].HP);
            }
            System.out.println();
        }

    public static void main(String[] args) {
        int numEnemies;
        int enemyDamage, enemyHP = 0;
        int heroDamage, heroHP;
        int numEnemiesLeft = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of enemies: ");
            numEnemies = sc.nextInt();
        System.out.println("Enter the enemy damage: ");
            enemyDamage = sc.nextInt();
        System.out.println("Enter the hero's starting HP: ");
            heroHP = sc.nextInt();
        System.out.println("Enter the hero's damage: ");
            heroDamage = sc.nextInt();

        Enemy[] enemies = new Enemy[numEnemies];


        for (int i = 0; i < enemies.length; i++) { // loop to create HP of each enemy based on index placement
            enemies[i] = new Enemy(10+(i*2), enemyDamage);
        }


        Hero hero = new Hero(heroHP, heroDamage);

        int roundCount = 1;
        do {
            heroHP = heroHP - heroDamage;
            enemyHP = enemyHP - enemyDamage;
            roundCount++;

        } while ((numEnemiesLeft > 0)&&(hero.isAlive));

        System.out.println("==== After round "+roundCount+" ====");
            for(int j = 0; j<enemies.length; j++){
                System.out.print(enemies[j].HP+"|");
            }
            System.out.println();
        System.out.println("Num enemies left: "+numEnemiesLeft);


        if (hero.isAlive) System.out.println ("Hero wins!");
        else System.out.println ("Enemies win!");



    }
}
