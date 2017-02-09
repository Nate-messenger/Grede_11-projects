
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nate
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates a city named kitchener
        City kitchener = new City();
        //creates aa new robot named bob
             Robot bob_ross = new Robot(kitchener, 0, 0, Direction.EAST);
        //makes a robot named steve
        Robot steve = new Robot(kitchener, 2, 0, Direction.EAST);
        //labels the bots
        bob_ross.setLabel("bob ross");
        steve.setLabel("steve");
        for(;;){
            
        //moves steve once the way that it is facing
        steve.move();
        //turnes steve around
        steve.turnLeft();
        steve.turnLeft();
        //moves steve once the way that it is facing
        steve.move();
        //turnes steve around
         steve.turnLeft();
          steve.turnLeft();
         //tells the bob_ross to move 
             bob_ross.move();
             
             //turnes bobross around 
             bob_ross.turnLeft();
             bob_ross.turnLeft();
             //tells the bob_ross to move 
             bob_ross.move();
              //turnes steve around
         bob_ross.turnLeft();
          bob_ross.turnLeft();
        }
}
}
