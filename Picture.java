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
    private Circle topin;
    private Circle botin;
    private Person foot;
    private Person foot2;
    private Square topmid;
    private Square botmid;
    private Circle topbutt;
    private Circle botbutt;
    private Person arm;
    private Circle lefti;
    private Circle ritei;
    private Triangle mouth;

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
        //top box shadow
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-100);
        wall.moveVertical(20);
        wall.changeSize(80);
        wall.makeVisible();
        
        //bot circle shadow
        ball = new Square();
        ball.changeColor("black");
        ball.moveHorizontal(-100);
        ball.moveVertical(-20);
        ball.changeSize(80);
        ball.makeVisible();

        //top circle shadow
        sun = new Circle();
        sun.changeColor("black");
        sun.moveHorizontal(-20);
        sun.moveVertical(-25);
        sun.changeSize(80);
        sun.makeVisible();
        
        //top body circle
        topin = new Circle();
        topin.changeColor("white");
        topin.moveHorizontal(-15);
        topin.moveVertical(-19);
        topin.changeSize(70);
        topin.makeVisible();
        
        //bot circle shadow
        bun = new Circle();
        bun.changeColor("black");
        bun.moveHorizontal(-20);
        bun.moveVertical(85);
        bun.changeSize(80);
        bun.makeVisible();

        //bot butt shadow
        nun = new Circle();
        nun.changeColor("black");
        nun.moveHorizontal(30);
        nun.moveVertical(75);
        nun.changeSize(80);
        nun.makeVisible();
        
        //top butt shadow
        dun = new Circle();
        dun.changeColor("black");
        dun.moveHorizontal(20);
        dun.moveVertical(55);
        dun.changeSize(80);
        dun.makeVisible();
        
        //foot 1
        foot = new Person();
        foot.changeColor("black");
        foot.moveHorizontal(6);
        foot.moveVertical(40);
        foot.makeVisible();
        
        //foot 2
        foot = new Person();
        foot.changeColor("black");
        foot.moveHorizontal(-51);
        foot.moveVertical(40);
        foot.makeVisible();
                
        //bot body circle
        botin = new Circle();
        botin.changeColor("white");
        botin.moveHorizontal(-15);
        botin.moveVertical(89);
        botin.changeSize(70);
        botin.makeVisible();
        
        //topmid body
        topmid = new Square();
        topmid.changeColor("white");
        topmid.moveHorizontal(-94);
        topmid.moveVertical(20);
        topmid.changeSize(70);
        topmid.makeVisible();
        
        //botmid body
        botmid = new Square();
        botmid.changeColor("white");
        botmid.moveHorizontal(-94);
        botmid.moveVertical(-20);
        botmid.changeSize(70);
        botmid.makeVisible();
        
        //bot butt
        botbutt = new Circle();
        botbutt.changeColor("white");
        botbutt.moveHorizontal(25);
        botbutt.moveVertical(62);
        botbutt.changeSize(70);
        botbutt.makeVisible();
        
        //top butt
        topbutt = new Circle();
        topbutt.changeColor("white");
        topbutt.moveHorizontal(36);
        topbutt.moveVertical(81);
        topbutt.changeSize(70);
        topbutt.makeVisible();
        
         // nose
        roof = new Triangle();  
        roof.changeColor("black");
        roof.changeSize(20, 20);
        roof.moveHorizontal(36);
        roof.moveVertical(-40);
        roof.makeVisible();
        
        //arm
        arm = new Person();
        arm.changeColor("black");
        arm.moveHorizontal(-10);
        arm.moveVertical(-20);
        arm.makeVisible();
        
        //left eye
        lefti = new Circle();
        lefti.changeColor("black");
        lefti.moveHorizontal(-20);
        lefti.moveVertical(-5);
        lefti.changeSize(20);
        lefti.makeVisible();
        
        //right eye
        ritei = new Circle();
        ritei.changeColor("black");
        ritei.moveHorizontal(20);
        ritei.moveVertical(-5);
        ritei.changeSize(20);
        ritei.makeVisible();
        
        // mouth
        mouth = new Triangle();  
        mouth.changeColor("black");
        mouth.changeSize(-10, 60);
        mouth.moveHorizontal(32);
        mouth.moveVertical(-0);
        mouth.makeVisible();
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
