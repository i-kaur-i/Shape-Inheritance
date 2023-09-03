import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
/**
 * This class is to build and draw a rectangle. I used the
 * height and width to build the rectangle and then 
 * I have a method to get the area of a rectangle.This is from the lab.
 *
 * @author Iakjot Kaur
 * @version May 4th, 2020
 */
public class Rectangle extends Shape
{   
    // instance variables
    private int height;
    private int width;

    /**
     * This constructor is initalize the heigh and width and then set it.
     * 
     * I passed in the parameters and called the super class. Then I 
     * set the width and height of the rectangle of the parameters
     * passed in.
     *
     *PRE: paramaters must be positive
     *POST: initializes the variables 
     * @param: int
     * *return: none
     */
    public Rectangle(int x, int y, int xx, int yy){
        super(x,y);
        setHeight(xx);
        setWidth(yy);
    }

    /**
     * This method is to get the height of the rectangle.
     * 
     * I returned the height.
     *
     *PRE: the height must be positive
     *POST: returns the height of the triangle as an int 
     * @param: none
     * *return: int
     */
    public int getHeight(){
        return height;
    }

    /**
     * This method is to get width of the rectangle.
     * 
     * I returned the width
     *
     *PRE: width must be positive
     *POST: returns the width as an int
     * @param: none
     * *return: int
     */
    public int getWidth(){
        return width;
    }

    /**
     * This method is to set the height of the rectangle.
     * 
     * I set the instance variable height to the parameter passed in.
     *
     *PRE: have a height
     *POST: sets the height 
     * @param: int
     * *return: none
     */
    public void setHeight(int xx){
        this.height = xx;
    }

    /**
     * This method is to set the width of the rectangle.
     * 
     * I set the instance variable width to the parameter passed in.
     *
     *PRE: have a width
     *POST: sets the width
     * @param: int
     * *return: none
     */
    public void setWidth(int xy){
        this.width = width;
    }

    /** @Override
     * This method is to get the area of the rectangle.
     * 
     * I returned the height multiplied by the width to get 
     * the area of the reactangle.
     *
     *PRE: height and width must be postitive
     *POST:the area of rectangle
     * @param: none
     * *return: double
     */
    public double getArea(){
        return this.height * this.width;
    }

    /** @Override
     * This method is to draw the rectangle.
     * 
     * I made an object and then filled in the rectangle using
     * the width and height.
     *
     *PRE: have an object
     *POST: draws the rectangle
     * @param: object
     * *return: none
     */
    public void draw(Graphics g){
        Graphics2D gg = (Graphics2D) g;
        gg.fillRect(getX(), getY() , getWidth(), getHeight());
    }
}
