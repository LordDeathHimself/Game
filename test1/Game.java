import java.util.Scanner;

/**
BDSM AND IEKDELTA
*/
public class Game
{
public static void main (){
    int answer;
    System.out.println("1- Wielkommen auf BDSM DUNGEON");
    System.out.println("2- Wielkommen auf D&D");
    System.out.println("3- Wielkommen White power supremecy AKA Auswitz");
    System.out.println("4- Entschuldigung Drücken Sie auf eine der oben genannten Optionen ");
    Scanner myObj = new Scanner(System.in);
    answer = myObj.nextInt();
    
    if(answer==1){
        System.out.println("Du bist nur eine Verzögerung");
        System.out.println("1- HundScheisse ");
        System.out.println("2- Choto Mate kudasai ");
        System.out.println("3- onegai shimasu");
        answer = myObj.nextInt();
        if (answer==1){
            System.out.println("Senpai pleaseeee ");
            System.out.println("1- HundScheisse ");
            System.out.println("2- Choto Mate kudasai ");
            System.out.println("3- onegai shimasu");
            answer = myObj.nextInt();
            if (answer==1){
                System.out.println("Senpai pleaseeee ");
            }
            else if (answer==2){
                System.out.println("Oni-chan");
            }
            else if (answer==3){
                System.out.println("Onee-sama");
            }
        
        
        
    }
        if (answer==2){
             System.out.println("Senpai pleaseeee ");
        }
        else if (answer==3){
             System.out.println("Oni-chan");
        }
    
        
    }
    else if (answer==2){
        System.out.println("Du bist nur ein Mega Giga Retard");
        System.out.println("1- HundScheisse ");
        System.out.println("2- Choto Mate kudasai ");
        System.out.println("3- onegai shimasu");
        answer = myObj.nextInt();
        if (answer==1){
             System.out.println("Senpai pleaseeee ");
        }
        else if (answer==2){
             System.out.println("Oni-chan");
        }
        else if (answer==3){
             System.out.println("Onee-sama");
        }
    }
    else if (answer==3){
        System.out.println("HundScheisse DU BIST GIGA CHAD");
        System.out.println("1- HundScheisse ");
        System.out.println("2- Choto Mate kudasai ");
        System.out.println("3- onegai shimasu");
        answer = myObj.nextInt();
        if (answer==1){
             System.out.println("Senpai pleaseeee ");
        }
        else if (answer==2){
             System.out.println("Oni-chan");
        }
        else if (answer==3){
             System.out.println("Onee-sama");
        }
    }
    else if (answer==4){
        System.out.println("HundScheisse");
    }
    else{
        System.out.println("False");
    }
    
    
}


}