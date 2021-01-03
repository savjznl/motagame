package hj.magictower.ui;

import java.applet.AudioClip; 
import java.io.*; 
import java.applet.Applet; 
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL; 

public class PlayMusic { 
    String name="mota.wav";//可以用来选择你想要播放的音乐
     File f = new File("image/"+name); //放音乐文件的路劲，注意一定要是WAV格式的音乐不然不可以播放
     URL url; 
     URI uri;
	 static AudioClip aau; 
    void setMusic(String name)//修改播放的音乐文件
    {
        this.name=name;
        aau.loop();
    }
   public PlayMusic(){     
     try
     {  
        uri=f.toURI();
        url = uri.toURL();
        aau = Applet.newAudioClip(url); 
        aau.loop();//循环播放

        System.out.println("音乐文件已经打开");
    }
     catch (MalformedURLException e) { 
            e.printStackTrace(); 
            System.out.println("播放错误！");
        }
    }

   public void loopMusic()//循环播放
   {
       aau.loop();
   }
   public static void main(String args[]) { 
   new PlayMusic();
   aau.loop();
  }
public void play() {
	aau.loop();
	// TODO Auto-generated method stub
	
}
} 