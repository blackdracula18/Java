import java.util.*;
public class tic_tac_toe{
    public static void main(String[] args) {
        int player, computer;
        int rock = 1, paper = 2, sc = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your choice");
        player = input.nextInt();
        computer = (int )(Math.random()*3);
        if (computer == paper){
            if (player == sc ){
                System.out.println("player wins");
            } else if (player == rock ){
                System.out.println("Computer wins");
            } else if (player == paper ){
                System.out.println("Draw");
            }
        } if (computer ==rock){
            if (player == paper ){
                System.out.println("player wins");
            } else if (player == sc ){
                System.out.println("Computer wins");
            } else if (player == rock ){
                System.out.println("Draw");
            }
        } if (computer == sc){
            if (player == rock ){
                System.out.println("player wins");
            } else if (player == paper ){
                System.out.println("Computer wins");
            } else if (player == sc ){
                System.out.println("Draw");
            }
        }
    }

}
