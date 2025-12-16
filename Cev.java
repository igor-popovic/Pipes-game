package v2;

import java.awt.Color;
import java.awt.Graphics;


public abstract class Cev extends Kvadrat{

	protected Color unutrasnjost,ivica,usmerenje;
	
	public Cev() {
		super(new Color(170,170,170));
		unutrasnjost=new Color(204,204,204);
		ivica=Color.BLACK;
		usmerenje=Color.BLACK;
	}

	@Override
	public boolean mozeOznaci() {
		return true;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
	}

}
