package GuesserGame;
import java.util.Scanner;
class Guesser{
    int GuesserNum;
    public int GuesserNumb(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser Kindly Guess a number:");
        GuesserNum=sc.nextInt();
        return GuesserNum;

    }
}
class Player{
    int PlayerNum;
    public int PlayerNumb(){
        Scanner sc = new Scanner(System.in);
        PlayerNum=sc.nextInt();
        return PlayerNum;

    }
}
class Umpire{
    int Guessernum;
    int Playernum1;
    int Playernum2;
    int Playernum3;
    public void CollectNumFromGuesser(){
        Guesser Gu=new Guesser();
        Guessernum=Gu.GuesserNumb();
    }
    public void CollectNumFromPlayers(){
        Player P1=new Player();
        Player P2=new Player();
        Player P3=new Player();
        System.out.println("Player1 Kindly Guess a number:");
        Playernum1=P1.PlayerNumb();
        System.out.println("Player2 Kindly Guess a number:");
        Playernum2=P2.PlayerNumb();
        System.out.println("Player3 Kindly Guess a number:");
        Playernum3=P3.PlayerNumb();

    }
    public void compare(){
        if(Guessernum==Playernum1){
            if(Guessernum==Playernum2 && Guessernum==Playernum3){
                System.out.println("All Players Won The Game!");
            }
            else if(Guessernum==Playernum2 ){
                System.out.println("Player1 and Player2 Won The Game!");
            }
            else if(Guessernum==Playernum3 ){
                System.out.println("Player1 and Player3 Won The Game!");
            }
            else{
                System.out.println("Player1 Won The Game!");
            }
        }
        else if(Guessernum==Playernum2){
            if( Guessernum==Playernum3){
                System.out.println("Player2 and Player3 Won The Game!");
            }
            else{
                System.out.println("Player2 Won The Game!");
            }
        }
        else if (Guessernum==Playernum3){
                System.out.println("Player3 Won The Game!");

        }
        else {
            System.out.println("All Players Lost The Game!");

        }
    }
}
public class MyGuesserGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("--Game Started--");
            Umpire um=new Umpire();
            um.CollectNumFromGuesser();
            um.CollectNumFromPlayers();
            um.compare();
            System.out.println("--Game Over--");
            System.out.println("Enter 1 For Playing Again Or any other number to Exit:");
            if(sc.nextInt()!=1)
                break;
        }

    }
}
