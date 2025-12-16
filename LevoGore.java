package v2;

import java.awt.Graphics;

public class LevoGore extends Cev{

	public LevoGore() {
		super();
	}
	
	
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		
		g.setColor(unutrasnjost);
		g.fillRect(0, h/4, w - w/4, h/2+1);
		g.fillRect(w/4, 0, w/2+1, h-h/4);
		
		g.setColor(ivica);
		g.drawLine(0, h-h/4, w-w/4, h-h/4);
		g.drawLine(w-w/4, h-h/4, w-w/4, 0);
		g.drawLine(0, h/4 , w/4 , h/4);
		g.drawLine(w/4, h/4, w/4, 0);
		
		g.setColor(usmerenje);
		g.drawLine(w/10, h/2+1, w/2+1, h/2+1);
		g.drawLine(w/2+1, h/2+1, w/2+1 , (h/10)*3);
		int a=w/2+1;
		int b=(h/10)*3;
		int xPoints[] = {a-4,a,a+4};
		int yPoints[] = {b,b-10,b};
		g.fillPolygon(xPoints, yPoints, 3);
		
		
		
	}
	
	
	
}
