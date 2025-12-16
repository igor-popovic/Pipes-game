package v2;

import java.awt.*;

public class LevoDesno extends Cev {

	public LevoDesno() {
		super();
	}
	
	
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		
		g.setColor(unutrasnjost);
		g.fillRect(0, h/4 , w, h/2+1);
		
		g.setColor(ivica);
		g.drawLine(0, h/4, w, h/4);
		g.drawLine(0, (h/4)*3+2, w, (h/4)*3+2);
		
		g.setColor(usmerenje);
		g.drawLine(w/10, h/2+1, (w/10)*7, h/2+1);
		int a=(w/10)*7;
		int b=h/2+1;
		int xPoints[] = {a,a+10,a};
		int yPoints[] = {b+4,b,b-4};
		g.fillPolygon(xPoints, yPoints, 3);
		
	}
	
	
	
	
}
