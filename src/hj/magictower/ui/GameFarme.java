package hj.magictower.ui;//游戏框架
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.swing.WindowConstants;
import hj.magictower.logic.Action;
public class GameFarme extends PlayFrame {	
    private static final int Win_Width=720+3*48;
    private static final int Win_Height=480+2*70;
    public GameFarme() throws IOException{};
    public static void main (String[] args) throws IOException{
         Login_er start=new Login_er();
        
         PlayFrame Game=new PlayFrame();
         MainMenu mainMenu=new MainMenu();
        start.setJMenuBar(mainMenu);
        start.setVisible(true);
        start.jButton1.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e){
                start.setVisible(false);
       
        Frame.setContentPane(Game);
        Image icon = Toolkit.getDefaultToolkit().getImage("image/mbg.jpeg");
        this.setlconImage(icon);
        setTitle("耗子尾汁");
        Frame.setSize(Win_Width,Win_Height);
        Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Frame.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width -Win_Width) / 2,
                (Toolkit.getDefaultToolkit().getScreenSize().height - Win_Height) / 2);

        Frame.setResizable(false);
        Game.add(PlayFrame.battleFrame);
        Game.add(PlayFrame.msgPane);
        Game.add(PlayFrame.forecastFrame);
        Game.add(PlayFrame.flyFrame);
        Frame.setJMenuBar(mainMenu);
        
        Frame.addKeyListener(new KeyListener() {
        	 @Override//键盘事件类
            public void keyTyped(KeyEvent e) {}
        	 @Override
            public void keyPressed(KeyEvent e){
                if(!inConversation)//谈话
                {
                    switch (e.getKeyCode())//getKeyCode//code键盘，返回键盘值
                    {
                        case 40: //下//10x10
                            if(Game.maker.y+1>=0 &&Game.maker.y+1<10)
                            {
                                Game.maker.drct=3;
                                Action.interaction(Game.maker.x+0,Game.maker.y+1);
                                Frame.repaint();//重绘组件，停在原地不懂
                            }
                            break;
                        case 39: //右
                            if(Game.maker.x+1>=0 &&Game.maker.x+1<10)
                            {
                                Game.maker.drct=2;
                                Action.interaction(Game.maker.x+1,Game.maker.y-0);
                                Frame.repaint();
                            }
                            break;
                        case 38: //上
                            if(Game.maker.y-1>=0 &&Game.maker.y-1<10)
                            {
                                Game.maker.drct=1;
                                Action.interaction(Game.maker.x+0,Game.maker.y-1);
                                Frame.repaint();
                            }
                            break;
                        case 37: //左
                            if(Game.maker.x-1>=0 &&Game.maker.x-1<10)
                            {
                                Game.maker.drct=0;
                                Action.interaction(Game.maker.x-1,Game.maker.y+0);
                                Frame.repaint();
                            }
                            break;
                        case 76:
                            if(forecast)
                            {
                                dispalyForcast();

                            }break;

                        case 74:
                            if(shop)
                            {
                                shop();
                            }

                            break;
                        case 75:
                            if(keyShop)
                            {
                                keyShop();
                            }
                            break;
                        case 69:
                            if(expShop)
                            {
                                expShop();        
                            }
                            break;
                        case 89://穿墙
                            if(maker.wallBreaker>0){
                                if(maker.drct==0) breaker(maker.x-1,maker.y);
                                if(maker.drct==1) breaker(maker.x,maker.y-1);
                                if(maker.drct==2) breaker(maker.x+1,maker.y);
                                if(maker.drct==3) breaker(maker.x,maker.y+1);}
                            break;
                    }}


                else return;
            }
            

            @Override
            public void keyReleased(KeyEvent e) {}});
            Frame.setVisible(true);
            }

			private void setTitle(String string) {
				// TODO Auto-generated method stub
				
			}

			private void setlconImage(Image icon) {
				// TODO Auto-generated method stub
				
			}
        });
        

    }


}
