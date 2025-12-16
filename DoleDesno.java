package v2;

import java.awt.Graphics;

public class DoleDesno extends Cev{

	public DoleDesno() {
		super();
	}
	
	
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		
		g.setColor(unutrasnjost);
		g.fillRect(w/4, h/4, w - w/4, h/2+1);
		g.fillRect(w/4, h/4, w/2+1, h-h/4);
		
		g.setColor(ivica);
		g.drawLine(w/4, h/4, w, h/4);
		g.drawLine(w/4, h/4, w/4, h);
		g.drawLine(w-w/4,h-h/4 , w , h-h/4);
		g.drawLine(w-w/4, h-h/4, w-w/4, h);
		
		g.setColor(usmerenje);
		g.drawLine(w/2+1, h/2+1, (w/10)*7, h/2+1);
		g.drawLine(w/2+1, h/2+1, w/2+1 , h-(h/10));
		int a=(w/10)*7;
		int b=h/2+1;
		int xPoints[] = {a,a+10,a};
		int yPoints[] = {b-4,b,b+4};
		g.fillPolygon(xPoints, yPoints, 3);
		
		
		
	}
	
	
}
