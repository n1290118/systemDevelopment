import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MyFrame extends JFrame implements MouseListener{

	private int px, py; 		//円を描画する座標(中心座標)

	public MyFrame(){			 //コンストラクタ
	setTitle("円の移動"); 			//ウィンドウタイトルを変更
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(408, 334); 		//ウィンドウサイズを 408×334に設定
	px = 200; 				//円を描画する座標を(200,150)に設定
	py = 150;

	getContentPane().addMouseListener(this); 		//ｳｨﾝﾄﾞｳ内側にリスナーを登録
	}

	public void mouseClicked(MouseEvent arg0){} //ﾏｳｽﾎﾞﾀﾝがクリックされたとき
	public void mouseEntered(MouseEvent arg0){} //ﾏｳｽがウィンドウ内に入ったとき
	public void mouseExited(MouseEvent arg0){} //ﾏｳｽがウィンドウ内から出たとき




	public void paint(Graphics g){ 			//ウィンドウ内へ描画する処理
	super.paint(g); 							//オーバライド前の処理を実行※11
	g = getContentPane().getGraphics(); 		//ウィンドウ内への描画用ｵﾌﾞｼﾞｪｸﾄ取得
	g.setColor(Color.RED); 						//これ以降の色を赤に変更
	g.fillOval(px-30, py-30, 60, 60); 			//(px, py)が中心になるように黒で塗つぶ
	} 												//された円を描画//ｳｨﾝﾄﾞｳを閉じたら終了する
	public void mousePressed(MouseEvent e){
	px = e.getX(); 				//px にﾏｳｽｶｰｿﾙの x座標を代入
	py = e.getY(); 				//py にﾏｳｽｶｰｿﾙの y座標を代入
	repaint();
}
	public void mouseReleased(MouseEvent e){} //ﾏｳｽﾎﾞﾀﾝが離されたとき
}
