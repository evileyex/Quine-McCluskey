import java.util.*;
class bin
{
    public String gtbin(int number)
    {
        int i;
        String s=Integer.toBinaryString(number);
        String fin="";
        int num=s.length();
        if(num==1)
           fin="000000"+s;
        if(num==2)
           fin="00000"+s;
         if(num==3)
           fin="0000"+s;
          if(num==4)
           fin="000"+s;
           if(num==5)
           fin="00"+s;
            if(num==6)
           fin="0"+s;
             if(num==7)
           fin=s; 
             return fin;
    }
}
public class qm
{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int j,k,l;
        ArrayList<Integer> min=new ArrayList<>();
        ArrayList<Integer> don=new ArrayList<>();
        ArrayList<String> prime=new ArrayList<>();
        bin binclass=new bin();
        System.out.println("Enter the min terms and press -1 after finishing");
        int i,temp;
        temp=in.nextInt();
        while(temp!=-1){
            min.add(temp);
            prime.add(Integer.toString(temp));
            temp=in.nextInt();
        }
        System.out.println("Enter 1 if you want to add minterms and press -1 to terminate");
        temp=in.nextInt();
        if(temp==1)
        {
            temp=in.nextInt();
        while(temp!=-1){
            don.add(temp);
            temp=in.nextInt();
        } 
        }
         bin bi=new bin();
         ArrayList<String>c1=new ArrayList<>();
         for(i=0;i<min.size();++i)
          c1.add(bi.gtbin(min.get(i)));
          for(i=0;i<don.size();++i)
          c1.add(bi.gtbin(don.get(i))); 
          ArrayList<String>c2=new ArrayList<>();
          ArrayList<String>c3=new ArrayList<>();
          ArrayList<String>c4=new ArrayList<>();
          ArrayList<String>c5=new ArrayList<>();
          ArrayList<String>c6=new ArrayList<>();
          ArrayList<String>c7=new ArrayList<>();
          int count=0;
          for(i=0;i<c1.size();++i){
              for(j=i+1;j<c1.size();++j){
                  count=0;
              for( k=0;k<7;++k)
              {
              if((c1.get(i).charAt(k)!=c1.get(j).charAt(k)))
              {
                  ++count;
              temp=k;
              }
              if(count==1)
              { 
              String te1=c1.get(j).substring(0,temp)+"_"+c1.get(j).substring(temp+1,7);
               c2.add(te1);
            
              }
          }
          }
          }
           System.out.println(c2);
          
        
    }
    }


    
   /* public static int getindex(String a,String b)
    {
        int i,count=0,temp;
        for(i=0;i<a.length();++i)
        {
          if(a.charAt(i)!=b.charAt(i)) 
              ++count;
          temp=i;
        }
       if(count==1)
           return temp
    }
}*/  
       
