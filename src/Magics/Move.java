package Magics;

public interface Move extends BaseMagic {
	int requiredMagic = 10;
	void move(int xPos, int yPos);
}
