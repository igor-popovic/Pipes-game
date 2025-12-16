package v2;

import java.awt.*;
import java.awt.event.*;

public abstract class Kvadrat extends Canvas{

	protected Color boja;
	protected boolean oznacen=false;
	public static final int w = 75;
    public static final int h = 75;
	protected Kanalizacija kan;
	
	public Kvadrat(Color boja) {
		
		setSize(new Dimension(w,h));
		setMinimumSize(new Dimension(w-2,h-2));
		setMaximumSize(new Dimension(w+2,h+2));
        setPreferredSize(new Dimension(w,h));
        
		this.boja=boja;
		
		
		addMouseListener(new MouseAdapter () {
			public void mouseClicked(MouseEvent e) {
				kan.oznaci(Kvadrat.this);
			}
		});
	}
	
	
	public void paint(Graphics g) {
		
		g.setColor(boja);
		//g.fillRect(0, 0, 75, 75);
		setBackground(boja);
		
		
		if(oznacen) {
			g.setColor(Color.RED);
			g.drawRect(1, 1, w-2, h-2);
			
		} else return;
		
	}
	
	public abstract boolean mozeOznaci();
	
	
	//nesto od ovoga treba da se iskoristi
	public void oznaci(boolean b) throws GOznaka {
		
		if(!mozeOznaci()) throw new GOznaka();
		oznacen=b;
		repaint();
	}
	
	/*public void promeniOznaku() throws GOznaka {
		oznaci(!oznacen);
	}*/
	
	
	public void setKan(Kanalizacija k) {
		kan = k;
	}
	
	
	
	
	
	
	
}
