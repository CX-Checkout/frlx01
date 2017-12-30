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
        price+=num*120;
        num=kc%2;
        price+=num*70;
        
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
            int s = 0,t=0,x=0,y=0,z=0;
            int d=0;
            if(zc>0 && ok<3)
            {
                 d=zc-3;
                if(d<0)
                {
                    z=zc;
                    zc=0;
                    ok+=z;
                }
                else
                {
                    zc-=3;
                    z=3;
                    ok+=3;
                }
                
            }
            
            if(sc>0 && ok<3)
            {
                d=sc-3;
                if(d<0)
                {
                    s=sc;
                    sc=0;
                    ok+=s;
                }
                else
                {
                    sc-=3;
                    s=3;
                    ok+=3;
                }
                
                
            }
            if(tc>0 && ok<3)
            {
                d=tc-3;
                if(d<0)
                {
                    t=tc;
                    tc=0;
                    ok+=t;
                }
                else
                {
                    tc-=3;
                    t=3;
                    ok+=3;
                }
              
                
            }
           
            
            if(yc>0 && ok<3)
            {
                d=yc-3;
                if(d<0)
                {
                    y=yc;
                    yc=0;
                    ok+=y;
                }
                else
                {
                    yc-=3;
                    y=3;
                    ok+=3;
                }
               
            }
            
             if(xc>0 && ok<3)
            {
                 d=xc-3;
                if(d<0)
                {
                    x=xc;
                    xc=0;
                    ok+=x;
                }
                else
                {
                    xc-=3;
                    x=3;
                    ok+=3;
                }
                
            }
            
            if(ok>=3)
            {
                int extra=ok-3;
                  
                price+=(45);
                ok=0;
                 if(extra>0 && x>0)
                {
                   if(x>=extra)
                   {
                       x-=extra; 
                       xc+=extra;
                       extra=0;
                   }
                   else
                   {
                       extra-=x;
                       
                   }
                }
                 
                if(extra>0 && s>0)
                {
                   if(s>=extra)
                   {
                       s-=extra;
                      
                       sc+=extra;
                        extra=0;
                   }
                   else
                   {
                       extra-=s;
                       
                   }
                }
                
                if(extra>0 && t>0)
                {
                   if(t>=extra)
                   {
                       t-=extra;
                        
                       tc+=extra;
                       extra=0;
                   }
                   else
                   {
                       extra-=t;
                       
                   }
                }
                
               
                
                if(extra>0 && y>0)
                {
                   if(y>=extra)
                   {
                       y-=extra; 
                       yc+=extra;
                       extra=0;
                   }
                   else
                   {
                       extra-=y;
                       
                   }
                }
                
                if(extra>0 && z>0)
                {
                   if(z>=extra)
                   {
                       z-=extra;
                       zc+=extra;
                       extra=0;
                   }
                   else
                   {
                       extra-=z;
                       
                   }
                }
              
            }
            else
            {
                if(s>0)
                   sc+=s;
                if(t>0)
                    tc+=t;
                if(x>0)
                    xc+=x;
                if(y>0)
                    yc+=y;
                if(z>0)
                    zc+=z;
                    
                break;
            }
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
