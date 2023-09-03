import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
/**
 * This class is to build a triangle. This class builds a triangle
 * by using the side length and a base. It also has the area of the shape triangle
 * calculated.
 *
 * @author Iakjot Kaur
 * @version May 4th, 2020
 */
public class Triangle extends Shape
{   
    // instance variables
    private int sideLength;
    private int base;

    /**
     * This constructor is to take the side length and base and set it.
     * 
     * I passed in the parameters needed for a triangle
     * and then set the paramters x and y by using super
     * Then I set the sidelength
     * 
     *PRE: int must be a positive number
     *POST: initalizes the variables
     * @param: int
     * *return: none
     */
    public Triangle(int x, int y, int s){
        super(x,y);
        setSideLength(s);
    }

    /**
     * This method is to set the side length of the triangle.
     * 
     * I set the instance variable sideLength to the parameter passed in.
     *
     *PRE: side length must be positive
     *POST: sets the side length of the triangle
     * @param: int
     * *return: none
     */
    public void setSideLength(int side){
        this.sideLength = side;
    }

    /**
     * This method is to get the side length of the triangle.
     * 
     * I returned the side length variable.
     *
     *PRE: have a sidelength
     *POST: return the side length of the triangle
     * @param: none
     * *return: int
     */
    public int getSideLength(){
        return sideLength;
    }

    /** @Override
     * This method is to get the area of the triangle.
     * 
     * I used the instance variables and multiplied them together
     * and then multiplied by two to get the area of the
     * triangle.
     *
     *PRE: have a sidelength and base, no negatives
     *POST: returns the area of the triangle as a double
     * @param: none
     * *return: double
     * @Override
     */
    public double getArea(){
        return (1/2)*(this.sideLength*base);
    }

    /** @Override
     * This method is to draw the triangle.
     * 
     * I created an object and then created two arrays to get the sidelength
     * and the area of the triangle.
     * 
     *PRE: must be an object
     *POST: draws the shape
     * @param: int
     * *return: none
     */
    public void draw(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        int[] xVal = {getX() , (getX() + (getSideLength()/2)) , getX() + getSideLength() };
        int[] yVal = {getY() , (getY() - (getSideLength())) , getY() };
    }

}
