import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
/**
 * This class builds the letter "A" by using the size and the 
 * char. It also calculates the area of the letter and then draws
 * it.
 *
 * @author Iakjot Kaur 
 * @version May 4th, 2020
 */
public class Letter extends Shape
{   
    // instance variables
    private char a = 'A';
    private int size;

    /**
     * This constructor is to initalize the letter variables and set the size.
     * 
     * I passed in the parameters and used the super class.
     * And then I set the size using the setSize method.
     *
     *PRE: ints must be positive
     *POST: initializes the variables
     * @param: int
     * *return: none
     */
    public Letter(int x, int y, int s){
        super(x,y);
        setSize(s);
    }

    /**
     * This method is to get the size of the letter.
     * 
     * I returned the instance variable of the size.
     *
     *PRE: size must be positive
     *POST: returns the size of the letter
     * @param: none
     * *return: int
     */
    public int getSize(){
        return this.size;
    }

    /**
     * This method is to set the size of the letter.
     * 
     * I set the instance variable size to the parameter passed in.
     *
     *PRE: size must be an int
     *POST: sets the size
     * @param: int
     * *return: none
     */
    public void setSize(int size){
        this.size = size;
    }

    /** @Override
     * This method is to get the area of the letter.
     * 
     * I returned the instance variable size multiplied by itself and then
     * divided by 4 and then multiplied that outcome by two.
     * 
     * PRE: have a size of letter
     * POST: returns the area of the letter
     * @param: none
     * *return: double
     */
    public double getArea(){
        return (this.size * this.size / 4) * 2;
    }
    
    /**@Override
     * This method is to draw the letter.
     * 
     * I used the font to set it to default and then drew a string
     * and got the sizes and the ints.
     * 
     * PRE: have an objet
     * POST:draws the shape 
     * @param: none
     * *return: double
     */
    public void draw(Graphics g){
        g.setFont( new Font("default",0,size));
        g.drawString("" + a, getX(), getY() + getSize()); 
    }

}
