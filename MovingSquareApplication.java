import java.awt.*;
import javax.swing.*;

public class MovingSquareApplication extends JFrame implements Runnable{

    private static final Dimension WindowSize = new Dimension (600,600);
    private static final int NUMGAMEOBJECTS = 30;
    private GameObject[] GameObjectsArray = new GameObject[NUMGAMEOBJECTS];






    public MovingSquareApplication(){
        this.setTitle("I hope these colors move...");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Thread t = new Thread(this);
        t.start();
        //Display the window, centred on the screen

        Dimension screensize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int x = screensize.width/2 - WindowSize.width/2;
        int y = screensize.height/2 - WindowSize.height/2;
        setBounds(x, y, WindowSize.width, WindowSize.height);
        setVisible(true);

        for (int i = 0; i < NUMGAMEOBJECTS; i++) {
            GameObjectsArray[i] = new GameObject();
        }

    }
    public void run(){
        while(true){

            for (GameObject obj : GameObjectsArray) {
                obj.move();
            }
                repaint(); // Request repaint to update the display

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    public void paint(Graphics g){
        super.paint(g); // Call the superclass paint method

        // Paint each game object
        for (GameObject obj : GameObjectsArray) {
            obj.paint(g);
        }
    }

    public static void main(String[] args){
        new MovingSquareApplication();
    }
}
