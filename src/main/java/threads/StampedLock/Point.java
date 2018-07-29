package threads.StampedLock;

import java.util.concurrent.locks.StampedLock;

/**
 * @Author qiuziyang_i
 * @Date 18/7/3 上午9:59
 */
public class Point {
    private double x,y;
    private final StampedLock s1=new StampedLock();
    void move(double datax,double datay){//普通写锁
        long stamp=s1.writeLock();
        try {
            x+=datax;
            y+=datay;
        }finally {
            s1.unlockWrite(stamp);
        }
    }

    double distanceFromOrigin(){//乐观读
        long stamp=s1.tryOptimisticRead();
        double currentX=x,currentY=y;
        if(!s1.validate(stamp)){
            stamp=s1.readLock();
            try {
                currentX=x;
                currentY=y;
            }finally {
                s1.unlockRead(stamp);
            }
        }
        return Math.sqrt(currentX*currentX+currentY*currentY);
    }

    void moveIfAtOrigin(double newx ,double newy){//悲观读锁
        long stamp=s1.readLock();
        try {
            while (x==0.0&&y==0.0){
                long ws=s1.tryConvertToWriteLock(stamp);
                if(ws!=0L){
                    stamp=ws;
                    x=newx;
                    y=newy;
                    break;
                }else {
                    s1.unlockRead(stamp);
                    stamp=s1.writeLock();
                }
            }
        }finally {
            s1.unlock(stamp);
        }
    }
}
