package controller.entities;

/**
* @author Olivia
*
*/

public interface PlayerAttackController {

	/**
	 * attack beetwen the player and the enemie
	 */
	 void attack();
	 
	/** @return player's attack_points
	 * 
	 */
	 int getAttackPoints();
	 
	 void setAttackPoints(int newAttackPoints);
	 
	 void resetAttackPoints();
	 //void getHit(int enemyResponseHit);
}
