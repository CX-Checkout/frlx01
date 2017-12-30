package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class Checkout {
    public static Integer checkout(String skus) {
        int ac=0,bc=0,cc=0,dc=0;
        for(int i=0;i<skus.length();i++)
        {
            if(skus.charAt(i)=='A')
                ac++;
            else if(skus.charAt(i)=='B')
                bc++;
            else if(skus.charAt(i)=='C')
                cc++;
            else
                dc++;
        }
        int price=0;
        int num=ac/3;
        price+=num*130;
        num=ac%3;
        price+=num*50;
        
        num=bc/2;
        price+=num*45;
        num=bc%2;
        price+=(num*30);
        
        price+=cc*20;
        price+=dc*15;
        
        return price;
        
    }
}
