import java.util.Scanner;

class Guesser
{
    int guesserNum()
    {
        int guessNum;
        System.out.println("Guesser guess the num between 1 to 10 : ");
        Scanner scan =new Scanner(System.in);
        guessNum = scan.nextInt();

        return guessNum;

    }
}
class Umpire
{
    void compareNum()
    {
        int guesserNum,playerNum1,playerNum2,playerNum3,playerNum4,playerNum5;
        int numOfCount=3;

        Guesser guesser= new Guesser();
        guesserNum=guesser.guesserNum();
        if(!(guesserNum<=10)&&(guesserNum>=1))
        {
            System.out.println("Wrong choice");
            guesserNum=guesser.guesserNum();
        }
        while(numOfCount>=0)
        {
            Player player1 = new Player();
            Player player2 = new Player();
            Player player3 = new Player();
            Player player4 = new Player();
            Player player5 = new Player();

            System.out.println("Player1 guess the num between 1 to 10 : ");
            playerNum1= player1.playerNum();
            if(!(playerNum1<=10)&&(playerNum1>=1))
            {
                System.out.println("Player1 Wrong choice guess again number between 1 to 10");
                playerNum1= player1.playerNum();
            }

            System.out.println("Player2 guess the num between 1 to 10 : ");
            playerNum2= player2.playerNum();
            if(!(playerNum2<=10)&&(playerNum2>=1))
            {
                System.out.println("Player2 Wrong choice guess again number between 1 to 10");
                playerNum2= player2.playerNum();
            }
            System.out.println("Player3 guess the num between 1 to 10 : ");
            playerNum3= player3.playerNum();
            if(!(playerNum3<=10)&&(playerNum3>=1))
            {
                System.out.println("Player3 Wrong choice guess again number between 1 to 10");
                playerNum3= player3.playerNum();
            }
            System.out.println("Player4 guess the num between 1 to 10 : ");
            playerNum4= player4.playerNum();
            if(!(playerNum4<=10)&&(playerNum4>=1))
            {
                System.out.println("Player4 Wrong choice guess again number between 1 to 10");
                playerNum4= player4.playerNum();
            }
            System.out.println("Player5 guess the num between 1 to 10 : ");
            playerNum5= player5.playerNum();
            if(!(playerNum5<=10)&&(playerNum5>=1))
            {
                System.out.println("Player5 Wrong choice guess again number between 1 to 10");
                playerNum5= player5.playerNum();
            }


            if((guesserNum==playerNum1)&& (guesserNum==playerNum2)
                    &&(guesserNum==playerNum3)&&(guesserNum==playerNum4)&&(guesserNum==playerNum5))
            {
                System.out.println("All players are correct");
                break;
            }
            else
            {
                if(guesserNum==playerNum1)
                {
                    if((guesserNum==playerNum2)&&(guesserNum==playerNum3)&&(guesserNum==playerNum4))
                    {
                        System.out.println("Player1,player2 ,Player3,Player4 are correct");
                        break;
                    }
                    else
                    {
                        if((guesserNum==playerNum2)&&(guesserNum==playerNum3)&&(guesserNum==playerNum5))
                        {
                            System.out.println("Player1,Player2,Player3,Player 5 are correct");
                            break;
                        }
                        else
                        if((guesserNum==playerNum3)&&(guesserNum==playerNum4)&&(guesserNum==playerNum5))
                        {
                            System.out.println("Player1,Player3,Player4,Player5 are correct");
                            break;
                        }
                        if((guesserNum==playerNum2)&&(guesserNum==playerNum3))
                        {
                            System.out.println("Player1,Player2,Player3 are correct");
                            break;
                        }
                        else
                        if((guesserNum==playerNum2)&&(guesserNum==playerNum4))
                        {
                            System.out.println("Player1,Player2,Player4 are correct");
                            break;
                        }
                        else
                        if((guesserNum==playerNum3)&&(guesserNum==playerNum4))
                        {
                            System.out.println("Player1,Player3,Player4 are correct");
                            break;
                        }
                        else
                        if((guesserNum==playerNum2)&&(guesserNum==playerNum5))
                        {
                            System.out.println("Player1,Player2,Player5 are correct");
                            break;
                        }
                        else
                        if((guesserNum==playerNum3)&&(guesserNum==playerNum5))
                        {
                            System.out.println("Player1,Player3,Player5 are correct");
                            break;
                        }
                        else
                        if((guesserNum==playerNum4)&&(guesserNum==playerNum5))
                        {
                            System.out.println("Player1,Player4,Player5 are correct");
                            break;
                        }
                        else
                        if(guesserNum==playerNum2)
                        {
                            System.out.println("Player1 & Player2 won the game");
                            break;
                        }
                        else
                        if(guesserNum==playerNum3)
                        {
                            System.out.println("Player1 & Player3 won the game");
                            break;
                        }
                        else
                        if(guesserNum==playerNum4)
                        {
                            System.out.println("Player1 & Player4 won the game");
                            break;
                        }
                        else
                        if(guesserNum==playerNum5)
                        {
                            System.out.println("Player1 & Player5 won the game");
                            break;
                        }
                        else
                        {
                            System.out.println("Player1 won the game");
                            break;
                        }


                    }

                }
                else
                {
                    if(guesserNum==playerNum2)
                    {
                        if((guesserNum==playerNum3) && (guesserNum==playerNum4) &&(guesserNum==playerNum5))
                        {
                            System.out.println("Player2, Player3,Player4,Player5 are correct");
                            break;
                        }
                        else
                        {
                            if((guesserNum==playerNum3)&&(guesserNum==playerNum4))
                            {
                                System.out.println("Player2,Player3,Player4 are correct");
                                break;
                            }
                            else
                            if((guesserNum==playerNum3)&&(guesserNum==playerNum5))
                            {
                                System.out.println("Player2,Player3,Player5 are correct");
                                break;
                            }
                            else
                            if((guesserNum==playerNum4)&&(guesserNum==playerNum5))
                            {
                                System.out.println("Player2,Player4,Player5 are correct");
                                break;
                            }
                            else
                            if(guesserNum==playerNum3)
                            {
                                System.out.println("Player2 & Player 3 are correct");
                                break;
                            }
                            else
                            if(guesserNum==playerNum4)
                            {
                                System.out.println("Player2 & Player4 are correct");
                                break;
                            }
                            else
                            if(guesserNum==playerNum5)
                            {
                                System.out.println("Player2 & Player5 are correct");
                                break;
                            }
                            else
                            {
                                System.out.println("Player2 won the game");
                                break;
                            }
                        }
                    }

                    else
                    if(guesserNum==playerNum3)
                    {
                        if((guesserNum==playerNum4)&&(guesserNum==playerNum5))
                        {
                            System.out.println("Player3,Player4,Player5 are correct");
                            break;
                        }
                        else
                        if(guesserNum==playerNum4)
                        {
                            System.out.println("Player3,Player4 are correct");
                            break;
                        }
                        else
                        if(guesserNum==playerNum5)
                        {
                            System.out.println("Player3,Player5 are correct");
                            break;
                        }
                        else
                        {
                            System.out.println("Player3 won the game");
                            break;
                        }


                    }

                    else
                    if(guesserNum==playerNum4)
                    {
                        if(guesserNum==playerNum5)
                        {
                            System.out.println("Player4,Player5 are correct");
                            break;
                        }
                        else
                        {
                            System.out.println("Player4 won the game");
                            break;
                        }
                    }

                    else
                    if(guesserNum==playerNum5)
                    {
                        System.out.println("Player5 won the game");
                        break;
                    }
                    else
                        System.out.println("You loose the game");
                    System.out.println("You have "+numOfCount+" chance to play again");
                    numOfCount--;

                }
            }
        }

    }

}
class Player
{
    int playerNum()
    {
        int playerNum;
        //System.out.println("Player guess the num between 1 to 10 : ");
        Scanner scan =new Scanner(System.in);
        playerNum = scan.nextInt();
        return playerNum;
    }

}
public class GuesserGame {
    public static void main(String[] args) {
        Umpire umpire = new Umpire();
        umpire.compareNum();
    }
}
