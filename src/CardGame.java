/**
 * HW 3: Arrays Part B - Programming Projects #2 (p. 419)
 * 
 * @author Ere Santos <ere.santos@twu.ca>
 * Date: March 2, 2016
 * 
 * Referenced: http://www.java-forums.org/new-java/25914-4x4-2d-array-card-game-need-solving.html
 * 
 * A common memory matching game played by young children is to start with a 
 * deck of cards that contain identical pairs. For example, given six cards in the deck, 
 * two might be labeled 1, two labeled 2, and two labeled 3. The cards are shuffled 
 * and placed face down on the table. A player then selects two cards that are face 
 * down, turns them face up, and if the cards match, they are left face up. If the two 
 * cards do not match, they are returned to their original face down position. The 
 * game continues until all cards are face up.
 * 
 * Write a program that plays the memory matching game. Use 16 cards that are laid 
 * out in a 4 x 4 square and are labeled with pairs of numbers from 1 to 8. Your 
 * program should allow the player to specify the cards that he or she would like to 
 * select through a coordinate system.
 */
import java.util.*;
import java.lang.*;
public class CardGame{
	/**
	 * This method prints out the game board layout.
	 */
    public static void boardLYT(){
        int cards[][]=new int[4][4];
        boolean cs[][]=new boolean[4][4];
        cards=shuf();
        System.out.println("   | 1 2 3 4 ");
        System.out.println("---+---------");
        for(int i=0;i<4;++i){
            System.out.print(" " +(i+1) +" | ");
            for(int j=0;j<4;++j){
                System.out.print("* ");
                cs[i][j]=false;
            }
            System.out.println();
        }
        System.out.println();
        str(cs,cards);
}
	/**
	 * This method shuffles the cards.
	 * @return
	 */
    public static int[][] shuf(){
        int start[]={1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8};
        int cards[][]=new int[4][4];
        Random ran=new Random();
        int tmp,i;
        for (int s=0; s<=20; s++){
            for (int x=0; x<16; x++){
                i=ran.nextInt(100000)%15;
                tmp=start[x];
                start[x]=start[i];
                start[i]=tmp;
            }
        }
        i=0;
        for (int r=0; r<4; r++){
            for (int c=0; c<4; c++){
                cards[r][c]=start[i];
                i=i+1;
            }
        }
        return cards;
    }
    /**
     * This method initializes the game
     * @param cs
     * @param cards
     */
    public static void str(boolean[][] cs,int[][] cards){
        boolean ov=false;
        Scanner keyboard=new Scanner(System.in);
        char rw0,rw1,cl0,cl1;
        int r1,c1;
        int r2=0,c2=0,tmr=5000;
        do{
            do{
                System.out.println("What's your guess for the first card: ");
                String rw=new String(keyboard.next());
                rw0=rw.charAt(0);cl0=rw.charAt(1);
                r1=Character.digit(rw0,5);c1=Character.digit(cl0,5);
                if(cs[r1-1][c1-1] == true){
                    System.out.println("You already flipped the card dude... Choose another one.");
                }
            }while(cs[r1-1][c1-1]!= false);
            do{
                System.out.println("What's your guess for the second card: ");
                String rw11=new String(keyboard.next());
                rw1=rw11.charAt(0);cl1=rw11.charAt(1);
                r2=Character.digit(rw1,5);c2=Character.digit(cl1,5);
                if(cs[r2-1][c2-1] == true){
                    System.out.println("You already flipped the card dude... Choose another one.");
                }
                if((r1==r2)&&(c1==c2)){
                    System.out.println("You already chose that card dude... Choose another one!");
                }
            }
            while((cs[r2-1][c2-1]!= false)||((r1==r2)&&(c1==c2)));
            r1--;
            c1--;
            r2--;
            c2--;
            System.out.println();
            System.out.println("   | 1 2 3 4 ");
            System.out.println("---+---------");
            for (int r=0; r<4; r++){
                System.out.print(" " +(r+1) +" | ");
                for (int c=0; c<4; c++){
                    if ((r==r1)&&(c==c1)){
                        System.out.print(cards[r][c] +" ");
                    }
                    else if((r==r2)&&(c==c2)){
                        System.out.print(cards[r][c] +" ");
                    }
                    else if (cs[r][c] == true){
                        System.out.print(cards[r][c] +" ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            if (cards[r1][c1]==cards[r2][c2]){
            	System.out.println("WINNER WINNER CHICKEN DINNER!!!");
            	System.out.println("We found ourselves a match!!");
 
                cs[r1][c1] = true;
                cs[r2][c2] = true;
            }
            try{
                Thread.sleep(2000);
 
            }
            catch (InterruptedException ie){
                System.out.println(ie.getMessage());
            }
            for (int b=0; b<=20; b++){
                System.out.println();
            }
            System.out.println("   | 1 2 3 4 ");
            System.out.println("---+---------");
            for (int r=0; r<4; r++){
                System.out.print(" " +(r+1) +" | ");
                for (int c=0; c<4; c++){
                    if (cs[r][c] == true){
                        System.out.print(cards[r][c] +" ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            ov = true;
            for (int r=0; r<4; r++){
                for (int c=0; c<4; c++){
                    if(cs[r][c]==false){
                      ov = false;
                      c=5;
                    }
                }
                if(ov == false){
                    r=5;
                }
            }
        }
        while(ov != true);
    }
    public static void main(String[] args){
        String playRepeat="";
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter the card coordinate for each card when requested");
        System.out.println("For example you, you could type '11' for the "
        		+ "first coordinate and '22' for the second coordinate.");
        System.out.println();
        do{
            boardLYT();
            System.out.println("CONGRATULATION MAN(or woman) YOU'VE WON!!!");
            System.out.println("If you want to play again, press 'Y' and if not press 'N'.");
            playRepeat=keyboard.next();
        }
        while (playRepeat.equals("y")||playRepeat.equals("Y"));
    System.out.println("Thanks! Play again soon!");
    }
}