package v2;

import java.awt.*;

public class GoreDole extends Cev{

	public GoreDole() {
		super();
	}
	
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		
		g.setColor(unutrasnjost);
		g.fillRect(w/4, 0 , w/2+1, h);
		
		g.setColor(ivica);
		g.drawLine(w/4, 0, w/4, h);
		g.drawLine(w-w/4, 0, w-w/4, h);
		
		g.setColor(usmerenje);
		g.drawLine(w/2+1, h/10, w/2+1, (h/10)*7);
		int b=(h/10)*7;
		int a=w/2+1;
		int xPoints[] = {a-4,a,a+4};
		int yPoints[] = {b,b+10,b};
		g.fillPolygon(xPoints, yPoints, 3);
		
		
	}
	
}
