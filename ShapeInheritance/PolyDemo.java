import java.util.*;
import javax.swing.*;
import java.awt.*;
/*
 * Class PolyDemo (is a JFrame) and PolyDemoPanel (is a JPanel)
 *
 * Author: Rob Nash
 */
class PolyDemo extends JFrame {
    /**
     * This constructor is to set and initialize variables.
     * 
     * The poly demo panel is added and the size is set.
     * The visibility is there.
     * 
     * @param: none
     * *return: none
     */
    public PolyDemo() {
        getContentPane().add( new PolyDemoPanel() );
        //just some windowing stuff that must happen for all Frames
        setSize( 300,300 );
        setVisible( true );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

    /**
     * This method is to test the shapes.
     * 
     * a new object is created and stored.
     * 
     * @param: none
     * *return: none
     */
    public static void main( String args[] ) {
        PolyDemo myApp = new PolyDemo();
    }
    //this is our first "inner" or internal class
    //the purpose of this class is solely to support the JFrame class above, and
    //I don't want it reused in arbitrary contexts, so by nesting this class here
    //I can indicate the intent a bit more clearly that this class "goes with"
    //the class above it
    //In general, each class is a separate entity that should be contained in a
    //separate file
    public class PolyDemoPanel extends JPanel {
        Shape[] myShapes= new Shape[20];
        public PolyDemoPanel() {
            // Shape a = new Shape( getRandInt(), getRandInt());
            //Shape b = new Circle( getRandInt(), getRandInt(),
            //        getRandInt() );
            //a = new Triangle(getRandInt(), getRandInt(),getRandInt()); 
            //getRandInt();
            //a = getRandShape();
            //( (Circle) b ).getRadius();
            /**********************************************************************************
             ***********************************
             * Code for populating our myShapes changes minimally when new
            classes are introduced (only in getRandShape())
             ***********************************************************************************
             **********************************/
            // goes through the array and sets the array full of random shapes
            for( int i = 0; i < 20; i++ ) {
                myShapes[i] =  getRandShape();
            }
        }

        /**********************************************************************************
         ***********************************
         * Code for drawing our shapes doesn't change at all! Since we intended
        to take advantage of polymorphism, we coded
         * this "in general" with respect to the superclass, and not specific
        to any subclass.
         ***********************************************************************************
         **********************************/
        public void paint( Graphics g ) {
            super.paint(g);  //don't remove - required for GUI widgets to
            //draw correctly
            /************************
             * Late Binding Demo
             ************************/
            for( int i = 0; i < myShapes.length; i++ ){
                //which draw method is invoked here? There are many forms
                //of the method (polymorphic), so which is chosen?
                //Java has RTTI about every object, and it uses this info
                //to choose the correct method to invoke!
                myShapes[i].draw( g );
            }
        }

        /**
         * This method is to get generate random ints in a range.
         * 
         * The math and random is returned multipled with 200
         * and casted to an int.
         * 
         * @param: none
         * *return: none
         */
        public int getRandInt() {
            return ( (int) ( Math.random() * 200 ) );
        }

        /**
         * This method is to use the classes I made.
         * 
         * The poly demo panel is added and the size is set.
         * The visibility is there.
         * 
         * @param: none
         * *return: none
         */
        public Shape getRandShape() {
            Shape retVal = null;
            final int x = getRandInt();
            final int y = getRandInt();
            /********************************
             * Polymorphic extensibility demo
             *
             *******************************/
            switch( ( int )(Math.random() * 4) ) {
                case 0:     retVal = new Triangle(getRandInt(),getRandInt(),getRandInt());//new Square( x, y,
                //getRandInt(), getRandInt() );
                break;
                case 1:     retVal = new Circle( getRandInt(),getRandInt(),getRandInt() );//Cube( x, y,
                //getRandInt(), getRandInt(), getRandInt() );
                break;
                case 2:     retVal = new Rectangle( getRandInt(),getRandInt(),getRandInt(),getRandInt() );
                break;
                case 3:     retVal = new Letter( getRandInt(),getRandInt(),getRandInt());//new
                //retVal = new Circle( x,y,getRandInt() );////new Cylinder( x,y, getRandInt(), getRandInt() );
                break;
            }
            return retVal;
        }
    }
}

