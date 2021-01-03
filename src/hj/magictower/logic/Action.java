package hj.magictower.logic;//行动

import hj.magictower.property.Dialogue;
import hj.magictower.property.Enemy;
import hj.magictower.property.Item;
import hj.magictower.property.Player;
import hj.magictower.ui.PlayFrame;

import java.io.IOException;

public class Action extends PlayFrame{
    public static void interaction (int x,int y)//交互类
    {
        if(monMap[nowFloor][x][y] instanceof Enemy && (maker.forecast((Enemy)monMap[nowFloor][x][y]).equals("???")||Integer.parseInt(maker.forecast((Enemy)monMap[nowFloor][x][y]))>=maker.hp))
            return;//防止出现非整数报错
        else if (monMap[nowFloor][x][y] instanceof Enemy)//判定是否可以转换为敌人
        {
            if (maker.muteki>0)//人物行动
            	//在人物向上移动时，判断人物所在位置上方数组monmap中的值是否为0，为0就代表没物体阻挡
            	//如果为0就继续前面移动的方式，如果不为0的话就不执行前面移动的方式.
            {
                maker.muteki--;
                PlayFrame.monMap[nowFloor][x][y]=null;
            }
            maker.battle((Enemy)monMap[nowFloor][x][y]);
            System.out.println((enemyDict[monMap[nowFloor][x][y].id][0].toString()));
            PlayFrame.monMap[nowFloor][x][y]=null;
        }
        else if(monMap[nowFloor][x][y] instanceof Item)
        	//通过人物所在的这个数组元素位置，
        	//找出这个坐标上下左右的数组元素的值
        {
            ((Item)monMap[nowFloor][x][y]).use();
            monMap[nowFloor][x][y]=null;
        }
        else if(monMap[nowFloor][x][y] instanceof Dialogue)
        {
            ((Dialogue)monMap[nowFloor][x][y]).perform();
            if(((Dialogue)monMap[nowFloor][x][y]).id==3)
            {
                monMap[nowFloor][x-1][y]=null;
                monMap[nowFloor][x+1][y]=null;
            }
            monMap[nowFloor][x][y]=null;
        }
        else
        switch (Map[nowFloor][y][x])
        {
            case 1:maker.move(x,y); break;
            case 0:
                if(sheep==true) {maker.move(x,y);}
                break;
            case 2://上下楼
                nowFloor--;
                maker.move(finPos[nowFloor][0],finPos[nowFloor][1]);
                break;
            case 3:
                nowFloor++;
                PlayFrame.maxFloor=Math.max(maxFloor,nowFloor);
                maker.move(startPos[nowFloor][0],startPos[nowFloor][1]);
                break;
            case 6://使用钥匙
                if(maker.Gkey>0){
                    Map[nowFloor][y][x]=1;
                    maker.Gkey--;
                    maker.move(x,y);
                }
                break;
            case 7:
                if(maker.Ykey>0){
                    Map[nowFloor][y][x]=1;
                    maker.Ykey--;
                    maker.move(x,y);
                }
                break;
            case 8:
                if(maker.Bkey>0){
                    Map[nowFloor][y][x]=1;
                    maker.Bkey--;
                    maker.move(x,y);
                }
                break;
            case 9:
                if(maker.Rkey>0){
                    Map[nowFloor][y][x]=1;
                    maker.Rkey--;
                    maker.move(x,y);
                }
                break;
            case 10:
                Map[nowFloor][y][x]=1;
                maker.move(x,y);
                break;
        }
    }
    public Action() throws IOException{

    }
}
