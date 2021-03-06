
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program to preform the game of Snakes and Ladders
        // keeping in mind the different methods of playing the game
        // Once the player has reached 100 than the game has finished and that player has won
        
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // ask what player's name is and store the name
        System.out.print("Enter player's name: ");
        String player = input.nextLine();
        
        // create a variable to track the position the player will first being starting at and throughout the rest of the game
        int position = 1;
        
        // create a variable to deponstrate the number the player is rolling up by
        int roll;
        
        // create a variable to determine when the game has finsished
        boolean playGame = true;
        
        // while the game is not over and player's position is below 100 the player will keep rolling until they reach that position
        while (playGame){
            
            // ask the player what the sum of the dice is and collect the sum
            System.out.print("Enter sum of the dice: ");
            roll = input.nextInt();
            
            // if the roll is greater or equal to 2 and is less or equal to 12 move up positions
            if (roll >= 2 && roll <= 12){
                // determine the position the player is at
                position = roll + position;
                
                // if the player's position is still within 100 than keep rolling
                if (position < 100){
                    // the snakes, if the player is on squares 54, 90, or 99 move the player back and note the move to the user
                    if(position == 54 || position == 90 || position == 99){
                        // if the player is on square 54 move the player back to square 19
                        if(position == 54){
                            position = 19;
                        // if the player is on square 90 move the player back to square 48
                        } else if(position == 90){
                            position = 48;
                        // if the player is on square 99 move the player back to square 77
                        } else if(position == 99){
                            position = 77;
                        }
                        System.out.println(player + " has landed on a snake!");
                    }

                    // the ladders, if the player is on squares 54, 90, or 99 move the player forward and note the move to the user
                    if(position == 9 || position == 40 || position == 67){
                        // if the player is on square 9 move the player forward to square 34
                        if(position == 9){
                            position = 34;
                        // if the player is on square 40 move the player back to square 64
                        } else if(position == 40){
                            position = 64;
                        // if the player is on square 90 move the player back to square 48
                        } else if(position == 67){
                            position = 86;
                        }
                        System.out.println(player + " has landed on a ladder!");
                    }
                    
                // if the player's position is equal to 100 then they has won
                } else if (position == 100) {
                    System.out.println(player + " wins!");
                    playGame = false;
                    
                // if the player position is greater than 100 then they won't move
                } else if (position > 100){
                    position = position - roll;
                }
                
                // if the game is still continuing display the current position
                if(playGame){
                    System.out.println(player + " is now on square " + position);
                }
                
            // if the player has rolled a 1 or greater than 13 tell them to try again
            } else if(roll == 1 || roll >= 13){
                System.out.println("Try again, roll between 2 and 12.");
            
            // if the player has rolled a 0, then they have quit    
            } else if (roll == 0){
                System.out.println(player + " quits!");
                playGame = false;
            }
        }
        // close input scanner
        input.close();
    }
    
}
