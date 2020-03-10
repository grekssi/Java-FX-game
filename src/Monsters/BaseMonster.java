package Monsters;

import Magics.*;

public class BaseMonster implements AttackOn, DeffenceUp, HealTheWorld, Move, Warrrr {

	protected double initialAttackPoints;
	protected double initialDefencePoints;

	public double getInitialAttackPoints() {
		return initialAttackPoints;
	}

	public void setInitialAttackPoints(double initialAttackPoints) {
		this.initialAttackPoints = initialAttackPoints;
	}

	public double getInitialdefencePoints() {
		return initialDefencePoints;
	}

	public void setInitialdefencePoints(double initialDefencePoints) {
		this.initialDefencePoints = initialDefencePoints;
	}

	protected double attackPoints;
	protected double defencePoints;

	protected double magicPoints;
	protected double speed;
	protected boolean canAttack;
	protected boolean hasDoubleAttack = false;


	private int positionX;
	private int positionY;

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}


	private boolean canMove = true;
	private boolean isDead = false;


	protected BaseMonster(double attackPoints, double defencePoints,
						  double magicPoints, double speed){

		this.attackPoints = attackPoints;
		this.defencePoints = defencePoints;
		this.magicPoints = magicPoints;
		this.speed = speed;
	}

	public double getAttackPoints() {
		return attackPoints;
	}

	public void setAttackPoints(double attackPoints) {
		this.attackPoints = attackPoints;
	}

	public double getDefencePoints() {
		return defencePoints;
	}

	public void setDefencePoints(double defencePoints) {
		this.defencePoints = defencePoints;
	}

	public double getMagicPoints() {
		return magicPoints;
	}

	public void setMagicPoints(double magicPoints) {
		this.magicPoints = magicPoints;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double sacrifice(){
		return this.magicPoints;
	}

	@Override
	public void attackOn() {
		if(!this.canAttack) this.canAttack = true;
	}

	@Override
	public void deffenceUp() {
		this.defencePoints = this.initialDefencePoints;
	}

	@Override
	public void heal() {
		this.defencePoints = this.initialDefencePoints;
		this.attackPoints = this.attackPoints;
	}

	@Override
	public void move(int xPos, int yPos) {
		this.positionX = xPos;
		this.positionY = yPos;
	}

	@Override
	public void warrrr() {
		this.hasDoubleAttack = true;
		this.attackPoints = this.attackPoints * 2;
	}
}
