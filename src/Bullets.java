import java.awt.*;

public class Bullets extends GameObject {

    Handler handler = new Handler();

    public Bullets(int x, int y, ID id, int velX) {
        super(x, y, id);
        int angle1 = 0;
        int angle2 = 0;
        int power1 = 0;
        int power2 = 0;
        this.handler = handler;
        if(id == ID.TankBullet1) {

            velX = 5;
        }

        else if(id == ID.TankBullet2) velX = -5;
        this.velX = velX;

    }
    public double bullPhys(double vel){
        double g = -9.8;
        return 0.0;

    }
    public Rectangle getBounds() {
        return new Rectangle(x, y, 4, 4);
    }

    public void tick() {
        x += velX;
        y += velY;

    }


    public void render(Graphics g) {
        if(id == ID.TankBullet1) g.setColor(Color.BLUE);
        else if(id == ID.TankBullet2) g.setColor(Color.RED);
        g.fillRect(x, y, 16,16);

    }

}
