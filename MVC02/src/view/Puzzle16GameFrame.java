package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import model.*;

public class Puzzle16GameFrame extends JFrame implements MouseListener {

	private Color[] colTbl= {Color.GREEN,Color.CYAN,Color.YELLOW,Color.LIGHT_GRAY};

	private Puzzle16 board=new Puzzle16();

	public Puzzle16GameFrame() {
		setTitle("16パズル");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(232,247);
		getContentPane().addMouseListener(this);
		board.createBoard();
	}

	public void paint(Graphics g) {
		int i,j,v;
		super.paint(g);
		g=getContentPane().getGraphics();

		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {

				v=board.getCell(i, j);
				if(v !=16) {
					g.setColor(colTbl[(v-1)/4]);
					g.fillRect(j*50+1+8, i*50+1, 49, 49);
					g.setColor(Color.BLACK);
					g.drawRect(j*50+8, i*50, 50, 50);
					g.drawString(""+v, j*50+20+8,i*50+30);
				}else {
					g.setColor(Color.WHITE);
					g.fillRect(j*50+1+8, i*50+1, 49, 49);
				}
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int pi,pj,n;
		pi=e.getY()/50;
		pj=e.getX()/50;
		if(board.getCell(pi, pj)== 16 && (e.getModifiers()& MouseEvent.BUTTON3_MASK) !=0){
			board.bonusBoard();
		}else{
			for(n=-1;n<=1;n+=2) {
				if(board.getCell(pi+n, pj)==16) {
					board.moveSpace(-n,0);
					break;
				}
				if(board.getCell(pi, pj+n)==16) {
					board.moveSpace(0,-n);
					break;
				}
			}
		}
		repaint();
	}


	public void mouseReleased(MouseEvent e) {
		if(board.clearCheck()==true) {
			Graphics g=getContentPane().getGraphics();
			g.setColor(Color.WHITE);
			g.fillRect(10,90, 180, 20);
			g.setColor(Color.BLUE);
			g.drawString("ゲームクリア！おめでとう！", 25, 104);
		}
	}
	@Override
	public void mouseClicked(MouseEvent e){

	}
	@Override
	public void mouseEntered(MouseEvent e){

	}
	@Override
	public void mouseExited(MouseEvent e){

	}
	}
