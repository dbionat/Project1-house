/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square ball;
    private Square sall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle bun;
    private Circle nun;
    private Circle dun;
    private Person foot;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-100);
        wall.moveVertical(20);
        wall.changeSize(80);
        wall.makeVisible();
        
        ball = new Square();
        ball.changeColor("black");
        ball.moveHorizontal(-100);
        ball.moveVertical(-20);
        ball.changeSize(80);
        ball.makeVisible();
        
        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(290);
        roof.moveVertical(-60);
        roof.makeVisible();

        //top body circle
        sun = new Circle();
        sun.changeColor("black");
        sun.moveHorizontal(-20);
        sun.moveVertical(-25);
        sun.changeSize(80);
        sun.makeVisible();
        
        //bot body circle
        bun = new Circle();
        bun.changeColor("black");
        bun.moveHorizontal(-20);
        bun.moveVertical(85);
        bun.changeSize(80);
        bun.makeVisible();
        
        //bot butt
        nun = new Circle();
        nun.changeColor("black");
        nun.moveHorizontal(30);
        nun.moveVertical(75);
        nun.changeSize(80);
        nun.makeVisible();
        
        //top butt
        dun = new Circle();
        dun.changeColor("black");
        dun.moveHorizontal(20);
        dun.moveVertical(55);
        dun.changeSize(80);
        dun.makeVisible();
        
        foot = new Person();
        foot.changeColor("blue");
        foot.moveHorizontal(11);
        foot.moveVertical(40);
        foot.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
