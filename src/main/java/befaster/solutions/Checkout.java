package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class Checkout {
    public static Integer checkout(String skus) {
           int ac=0,bc=0,cc=0,dc=0,ec=0,fc=0;
      int gc=0,hc=0,ic=0,jc=0,kc=0,lc=0,mc=0,nc=0;
      int oc=0,pc=0,qc=0,rc=0,sc=0,tc=0,uc=0,vc=0,wc=0,xc=0,yc=0,zc=0;
        int c=0;
        
        for(int i=0;i<skus.length();i++)
        {
            if(skus.charAt(i)=='A')
                ac++;
            else if(skus.charAt(i)=='B')
                bc++;
            else if(skus.charAt(i)=='C')
                cc++;
            else if(skus.charAt(i)=='D')
                dc++;
            else if(skus.charAt(i)=='E')
                ec++;
            else if(skus.charAt(i)=='F')
                fc++;
            else if(skus.charAt(i)=='G')
                gc++;
            else if(skus.charAt(i)=='H')
                hc++;
            else if(skus.charAt(i)=='I')
                ic++;
            else if(skus.charAt(i)=='J')
                jc++;
            else if(skus.charAt(i)=='K')
                kc++;
            else if(skus.charAt(i)=='L')
                lc++;
            else if(skus.charAt(i)=='M')
                mc++;
            else if(skus.charAt(i)=='N')
                nc++;
            else if(skus.charAt(i)=='O')
                oc++;
            else if(skus.charAt(i)=='P')
                pc++;
            else if(skus.charAt(i)=='Q')
                qc++;
            else if(skus.charAt(i)=='R')
                rc++;
            else if(skus.charAt(i)=='S')
                sc++;
            else if(skus.charAt(i)=='T')
                tc++;
            else if(skus.charAt(i)=='U')
                uc++;
            else if(skus.charAt(i)=='V')
                vc++;
            else if(skus.charAt(i)=='W')
                wc++;
            else if(skus.charAt(i)=='X')
                xc++;
            else if(skus.charAt(i)=='Y')
                yc++;
            else if(skus.charAt(i)=='Z')
                zc++;
            else
                c++;
        }
        
        
        if(c>0)
            return -1;
        
        int price=0;
        int num=ac/5;
        price+=num*200;
        num=ac%5;
        
        ac=num;
        num=ac/3;
        price+=num*130;
        num=ac%3;
        
        price+=num*50;
        
        bc=bc-(ec/2);
        
        if(bc>0)
        {
            /// calculation of bc
            num=bc/2;
            price+=num*45;
            num=bc%2;
            price+=(num*30);
        }
        price+=cc*20;
        price+=dc*15;
        
        price+=ec*40;
       
        while(fc>2)
        {
            price+=20;
            fc-=3;
        }
        price+=fc*10;
        price+=gc*20;
        
        num=hc/10;
        price+=num*80;
        num=hc%10;
        
        hc=num;
        num=hc/5;
        price+=num*45;
        num=hc%5;
        
        price+=num*10;
        
        
        
        
        price+=ic*35;
        price+=jc*60;
        
        num=kc/2;
        price+=num*150;
        num=kc%2;
        price+=num*80;
        
        price+=lc*90;
        
        mc=mc-(nc/3);
        
        if(mc>0)
        {
           
            price+=(mc*15);
        }
        price+=nc*40;
        price+=oc*10;
        
        num=pc/5;
        price+=num*200;
        num=pc%5;
        price+=num*50;
        
        qc=qc-(rc/3);
        
        if(qc>0)
        {
            num=qc/3;
            price+=num*80;
            num=qc%3;
            price+=num*30;
        }
        
        price+=rc*50;
        int ok=0;
        int gro=0;
        while(true)
        {
            if(sc>0 && ok<3)
            {
                sc--;
                ok++;
            }
            if(tc>0 && ok<3)
            {
                tc--;
                ok++;
            }
            if(xc>0 && ok<3)
            {
                xc--;
                ok++;
            }
            
            if(yc>0 && ok<3)
            {
                yc--;
                ok++;
            }
            
            if(zc>0 && ok<3)
            {
                zc--;
                ok++;
            }
            if(ok==3)
            {
                price+=(5*45);
                ok=0;
            }
            else
                break;
        
        }
        
        price+=sc*20;
        price+=tc*20;
        price+=wc*20;
        price+=xc*17;
        price+=yc*20;
        price+=zc*21;
        
        while(uc>3)
        {
            price+=120;
            uc-=4;
        }
        price+=uc*40;
        
                
        num=vc/3;
        price+=num*130;
        num=vc%3;
        
        vc=num;
        num=vc/2;
        price+=num*90;
        num=vc%2;
        price+=num*50;
        
        return price;
        
    }
}
