import java.util.*;
class VolumeCylinder{
    public int radius;
    public int height;

    public  VolumeCylinder(int i, int j)
    {
        radius = i;
        height = j;
    }

    public double Volume(){
        double pi = 3.14;
        double Answer = 0;
        Answer= pi * radius*radius*height;
        return Answer;
    }
}


class Cylinder{
    public static void main(String args[]){

        Scanner sobj = new Scanner(System.in);
        int a = 0 , b = 0; 
        double Ans = 0;
        System.out.println("Enter the Radius");
         a= sobj.nextInt();

        System.out.println("Enter the Height");
         b= sobj.nextInt();

        VolumeCylinder vobj = new VolumeCylinder(a,b);
        Ans = vobj.Volume();

        System.out.println("volume of cylinder="+Ans);
    }
}


