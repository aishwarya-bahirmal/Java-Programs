import java.*;
import java.util.Scanner;

class CheckingProcess{
    int Mark;
    public CheckingProcess(int i){
        Mark = i;
    }

    public void Condition(){
        if(Mark > 35){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        
    }
}


class CheckResult{
    public static void main(String args[]){
        int no;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Plz enter your Mark : ");
        no = sobj.nextInt();

        CheckingProcess cobj = new CheckingProcess(no);
        cobj.Condition();

    

    }
}