import java.awt.Graphics;
import java.applet.Applet;

public class HelloWorldApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, Applet World!", 10, 10);
    }
}
