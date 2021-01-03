package hj.magictower.property;

import hj.magictower.ui.PlayFrame;

import java.awt.image.BufferedImage;
import java.io.IOException;


public class Monester {
    public int id;

    Monester(){}

    public BufferedImage monDraw()  throws IOException{//BufferedImage
        if(this instanceof Enemy){
            return PlayFrame.enemyImg.getSubimage(48*this.id,0,48,48);//x，y，长，宽
        }
        else if(this instanceof Dialogue){
            return PlayFrame.dialogueImg.getSubimage(48*this.id,0,48,48);
        }
        else return PlayFrame.itemImg.getSubimage(48*this.id,0,48,48);
    }



}
