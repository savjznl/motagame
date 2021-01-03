package hj.magictower.ui;//界面菜单

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MainMenu extends JMenuBar{
    public static boolean win=false;
    public MainMenu(){

        JMenu
                gameMenu = new JMenu("游戏");

        JMenuItem
                pauseMenuItem =new JMenuItem("暂停"),
                resumeMenuItem = new JMenuItem("恢复"),
                gameInfo = new JMenuItem("关于");
        gameMenu.add(pauseMenuItem);//菜单类
        gameMenu.add(resumeMenuItem);
        gameMenu.add(gameInfo);

        pauseMenuItem.addActionListener(event->pauseGame());
        resumeMenuItem.addActionListener(event->resumeGame());
      

        this.add(gameMenu);


    }
   
    static JLabel pause=new JLabel();
    public static void pauseGame()
    {
        PlayFrame.inConversation=true;
        new Suspend().setVisible(true);
        pause.setFont(new Font("Serif",0,40));
        pause.setForeground(Color.WHITE);
        if(win) pause.setText("你赢了！！！");
        pause.setBounds(90,150,200,50);
        PlayFrame.flyFrame.add(pause);
        PlayFrame.flyFrame.setVisible(true);

    }
    private void resumeGame()
    {
        GameFarme.displayMessage("恢复游戏");
        PlayFrame.flyFrame.setVisible(false);
        GameFarme.inConversation=false;
    }
}
  
