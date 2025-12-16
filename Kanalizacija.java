package v2;

import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;



	public class Kanalizacija extends Panel {
	
		private int m,n;
		
		Kvadrat oznacen=null;
		
		public Kanalizacija(int mm, int nn) {
			m=mm;
			n=nn;
			
			setLayout(new GridLayout(mm,nn,1,1));
			
			for(int i=0; i<m*n; i++) {
				Zid z=new Zid();
				z.setKan(this);
				this.add(z);
			}
			
		}


		public void oznaci(Kvadrat k) {
			
			if(oznacen==null){
				try {
					k.oznaci(true);
					oznacen=k;
				} catch (GOznaka e) {} 
			} else {
				try {
					oznacen.oznaci(false);
					oznacen.repaint();
					k.oznaci(true);
					oznacen=k;
					
				} catch (GOznaka e) {}
				
			}
			
		}
		
		
		
		public void dodaj(Cev c) {
			Component[] komponente = this.getComponents();
			for(int i=0; i<komponente.length; i++) {
				if(komponente[i]==oznacen) {
					this.remove(i);
					c.setKan(this);
					this.add(c,i);
					break;
				}
			}
			
			
			revalidate();
			repaint();
		}
		
		
		
		public int m() {return m;}
		public int n() {return n;}
		
	}





























