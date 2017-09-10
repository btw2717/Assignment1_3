import java.awt.Graphics;
import javax.swing.JApplet;

/**
 * The TicTacToe class displays an image of a completed Tic-Tac-Toe game.
 *
 * This class extends JApplet and so it inherits all of its methods from its superclass
 * javax.swing.JApplet.
 * The JApplet class in turn extends the Applet class.
 *
 * An applet is a small program that is intended not to be run on
 * its own, but rather to be embedded inside another application.
 * The Applet class must be the superclass of any
 * applet that is to be embedded in a Web page or viewed by the Java
 * Applet Viewer.
 *
 * The JApplet class allows this applet to use Swing components.
 * Any applet that contains Swing components must be implemented with a subclass of JApplet,
 * which the TicTacToe class is, having extended JApplet.
 *
 * Because this class extends JApplet and will be run as an applet,
 * it does not contain or utilize a main() method.
 *
 * @author SapperDaddy(2)
 * email: btannerw@gmail.com
 * Created: 10SEP2017
 * @version 1.0
 */

public class TicTacToe extends JApplet
{

    /**
     * The public void paint() method is a void method which will perform some other action than
     * returning an item.  In this case the paint() method is a method of the Component class.
     * The Component class is a member of the package java.awt along with the Graphics class.
     *
     * When AWT invokes the paint() method, the Graphics object parameter is pre-configured with
     * the appropriate state for drawing on this particular component:
     * The Graphics object's color is set to the component's foreground property.
     * The Graphics object's font is set to the component's font property.
     * The Graphics object's translation is set such that the coordinate (0,0) represents the upper
     * left corner of the component.
     * The Graphics object's clip rectangle is set to the area of the component that is in need of
     * repainting.
     *
     * This method necessarily initializes a Graphics object named canvas.
     * Programs must use this Graphics object (or one derived from it) to render output. They are free
     * to change the state of the Graphics object as necessary.
     *
     * @param canvas The Graphics context to use for painting.
     */

    public void paint(Graphics canvas)
    {

        /**
         * The drawing instructions utilize the Graphics object canvas
         * to call upon Graphics methods such as drawLine(),
         * which contain cartesian parameters as arguments.
         * These parameter arguments establish coordinates for the Graphics context to draw in
         * relation to the screen resolution/pixel dimensions.
         *
         * Coordinates are infinitely thin and lie between the pixels of the output device.
         * Operations that draw the outline of a figure operate by traversing an infinitely thin
         * path between pixels with a pixel-sized pen that hangs down and to the right
         * of the anchor point on the path. Operations that fill a figure operate by filling the
         * interior of that infinitely thin path. Operations that render horizontal text render
         * the ascending portion of character glyphs entirely above the baseline coordinate.
         */
        canvas.drawLine(400, 0, 400, 900); // Board Lines vertical
        canvas.drawLine(800, 0, 800, 900);

        canvas.drawLine(0, 300, 1200, 300); //Board Lines horizontal
        canvas.drawLine(0, 600, 1200, 600);


        canvas.drawLine(20, 20, 380, 280); //Top left 'x'
        canvas.drawLine(20, 280, 380, 20);

        canvas.drawLine(820, 20, 1180, 280); //Top right 'x'
        canvas.drawLine(820, 280, 1180, 20);


        canvas.drawLine(20, 320, 380, 580); //Left-middle 'x'
        canvas.drawLine(20, 580, 380, 320);

        canvas.drawLine(420, 320, 780, 580); //Center-Middle 'x'
        canvas.drawLine(420, 580, 780, 320);

        canvas.drawLine(820, 320, 1180, 580); //mid-right 'x'
        canvas.drawLine(820, 580, 1180, 320);


        canvas.drawLine(420, 620, 780, 880); //bottom-middle 'x'
        canvas.drawLine(420, 880, 780, 620);


        canvas.drawOval(420, 20, 360, 260); //Top-middle 'o'

        canvas.drawOval(20, 620, 360, 260); //Bottom left 'o'

        canvas.drawOval(820, 620, 360, 260); //bottom right 'o'


        //canvas.drawLine(0, 450, 1200, 450); //Horizontal line through bottom row of 'x's
        canvas.fillRect(0, 445, 1200, 10);
    }
}
