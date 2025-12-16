package v2;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;

public class Aplikacija extends Frame {

	private Kanalizacija kanalizacija;
	
	private Button dodaj = new Button("Dodaj");
	private Panel istok = new Panel(new GridLayout(0,1,5,5));
	private Panel centar = new Panel();
	
	public Aplikacija() {
		
		kanalizacija = new Kanalizacija(5,5);
		setBounds(700,200, kanalizacija.m()*(Kvadrat.w+1),kanalizacija.n()*(Kvadrat.h+1));
		setTitle("Cevi");
		setResizable(false);
		setLayout(new BorderLayout());
		
		popuni();
		
		pack();
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				
				dispose();
			}
		});
		
		setVisible(true);
	}

	private void popuni() {
		
		CheckboxGroup grupa = new CheckboxGroup();
		
		Checkbox lr = new Checkbox("Levo-Desno", false, grupa);
		Checkbox ud = new Checkbox("Gore-Dole", true, grupa);
		Checkbox du = new Checkbox("Dole-Gore", false, grupa);
		Checkbox ld = new Checkbox("Levo-Dole", false, grupa);
		Checkbox lu = new Checkbox("Levo-Gore", false, grupa);
		Checkbox ur = new Checkbox("Gore-Desno", false, grupa);
		Checkbox dr = new Checkbox("Dole-Desno", false, grupa);
		
		istok.add(lr);
		istok.add(ud);
		istok.add(du);
		istok.add(ld);
		istok.add(lu);
		istok.add(ur);
		istok.add(dr);
		
		
		dodaj.addActionListener(ae->{
			String x =grupa.getSelectedCheckbox().getLabel();
			switch(x) {
			case "Levo-Desno" : 
				kanalizacija.dodaj(new LevoDesno()); 
				break;
				
			case "Gore-Dole" :
				kanalizacija.dodaj(new GoreDole()); 
				break;
				
			case "Dole-Gore" :
				kanalizacija.dodaj(new DoleGore());
				break;
				
			case "Levo-Dole" : 
				kanalizacija.dodaj(new LevoDole());
				break;
				
			case "Levo-Gore" :
				kanalizacija.dodaj(new LevoGore());
				break;
				
			case "Gore-Desno" :
				kanalizacija.dodaj(new GoreDesno());
				break;
				
			case "Dole-Desno" : 
				kanalizacija.dodaj(new DoleDesno());
				break;
				
				
			}	
			
		});
		
		istok.add(dodaj);
		
		add(istok, BorderLayout.EAST);
		
		add(kanalizacija, BorderLayout.CENTER);
		
	}
	
	public static void main(String[] args) {
		new Aplikacija();
		
	}
	
}
