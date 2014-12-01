//Ankit Kumar
//1301Cs10
import java.util.*;
class bin1
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
  /*  public  static String getex(String c,int v){
       if(v==1){
           if(c.charAt(6)=='0')
               c="A"
                       else if(c.charAt(6)=='1')
                           c="A"
         
       } 
       if(v==2){
           if(c.charAt())  
       } 
       if(v==3){
           c=c.substring(4,7);   
       } 
       if(v==4){
           c=c.substring(3,7);   
       } 
       if(v==5){
           c=c.substring(2,7);   
       } 
       if(v==6){
           c=c.substring(1,7);   
       } 
       if(v==7){
           c=c.substring(0,7);   
       } 
       return c;
    }*/
}
class cell
{
    String bin;
    String dec;
    String[] arr=new String[1000];
    ArrayList<Integer> arr2=new ArrayList<>();
    boolean check=false;
    public cell(String a,String b)
    {
        bin=a;
        dec=b;
    }
}
public class qm 
{
      public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int j,k,l;
        ArrayList<cell> min=new ArrayList<>();
        ArrayList<cell> don=new ArrayList<>();
        ArrayList<cell> min2=new ArrayList<>();
        ArrayList<cell> min3=new ArrayList<>();
        ArrayList<cell> min4=new ArrayList<>();
        ArrayList<cell> min5=new ArrayList<>();
        ArrayList<cell> min6=new ArrayList<>();
        ArrayList<cell> min7=new ArrayList<>();
        ArrayList<cell> min8=new ArrayList<>();
        ArrayList<cell> finalv=new ArrayList<>();
        ArrayList<cell> esent =new ArrayList<>();
        ArrayList<String> rr=new ArrayList<>();
        bin1 binclass=new bin1();
        System.out.println("Enter the min terms  in standard format in integer format and press -1 after finishing");
        int i,temp,count;
        temp=in.nextInt();
        while(temp!=-1)
        {
            String t=binclass.gtbin(temp);
            String g=Integer.toString(temp);
            min.add(new cell(t,g));
            temp=in.nextInt();
        }
        String temp0=in.nextLine();
        System.out.println("Enter y  if you want to add dont care terms  in std. integer format else n and -1 after adding all ");
       String temp1=in.nextLine();
        if(temp1.equals("y"))
        {
            temp=in.nextInt();
        while(temp!=-1)
        {
           String t=binclass.gtbin(temp);
            String g=Integer.toString(temp);
            don.add(new cell(t,g));
            temp=in.nextInt();
        } 
        }
int max=Integer.parseInt(min.get(min.size()-1).dec);
if(don.size()>0){
if(max<Integer.parseInt(don.get(don.size()-1).dec))
    
    max=Integer.parseInt(don.get(don.size()-1).dec);
}
if(don.size()>0){
    for(i=0;i<don.size();++i){
        min.add(new cell(don.get(i).bin,don.get(i).dec));
    }
}

     int var=0;
                   if(max>0&&max<=2)
                       var=1;
                     if(max<=4&&max>2)
                       var=2;
                       if(max<=8&&max>4)
                       var=3;
                         if(max<=16&&max>8)
                       var=4;
                           if(max<=32&&max>16)
                       var=5;
                             if(max<=64&&max>32)
                       var=6;
                               if(max<=128&&max>64)
                       var=7;
                                 if(max>=128)
       
                                    System.out.println("Can only do for 7 variables maximum");
                                 if(min.size()!=Math.pow(2,var)){
       for(i=0;i<min.size();++i)
       {
           for(j=i+1;j<min.size();++j)
           {
               boolean bol=true;  
               count=0;
              for( k=0;k<7;++k)
              {
              if(min.get(i).bin.charAt(k)!= min.get(j).bin.charAt(k))
              {
                  ++count;
              temp=k;
              }
              }
              if(count==1)
              { 
              String te1=min.get(j).bin.substring(0,temp)+"_"+min.get(j).bin.substring(temp+1,7);
               String te2=min.get(i).dec+","+min.get(j).dec;
                min2.add(new cell(te1,te2));
                min.get(i).check=true;
                min.get(j).check=true;
              }
           }
       }
  /*      for(i=0;i<min.size();++i)
       {
           for(j=0;j<don.size();++j)
           {boolean bol=true;
                 count=0;
              for( k=0;k<7;++k)
              {
              if(min.get(i).bin.charAt(k)!= don.get(j).bin.charAt(k))
              {
                  ++count;
              temp=k;
              }
              }
              if(count==1)
              { 
              String te1=min.get(j).bin.substring(0,temp)+"_"+don.get(j).bin.substring(temp+1,7);
               String te2=min.get(i).dec+","+don.get(j).dec;
                min2.add(new cell(te1,te2));
                min.get(i).check=true;
                don.get(j).check=true;
              }
           }
      
       }*/
         for(i=0;i<min2.size();++i)
       {
           for(j=i+1;j<min2.size();++j)
           {boolean bol=true;
                 count=0;
              for( k=0;k<7;++k)
              {
              if(min2.get(i).bin.charAt(k)!= min2.get(j).bin.charAt(k))
              {
                  ++count;
              temp=k;
              }
              }
              if(count==1)
              { 
              String te1=min2.get(j).bin.substring(0,temp)+"_"+min2.get(j).bin.substring(temp+1,7);
               String te2=min2.get(i).dec+","+min2.get(j).dec;
                min3.add(new cell(te1,te2));
                min2.get(i).check=true;
                min2.get(j).check=true;
              }
           }
       }
          for(i=0;i<min3.size();++i)
       {
           for(j=i+1;j<min3.size();++j)
           {boolean bol=true;
                 count=0;
              for( k=0;k<7;++k)
              {
              if(min3.get(i).bin.charAt(k)!= min3.get(j).bin.charAt(k))
              {
                  ++count;
              temp=k;
              }
              }
              if(count==1)
              { 
              String te1=min3.get(j).bin.substring(0,temp)+"_"+min3.get(j).bin.substring(temp+1,7);
               String te2=min3.get(i).dec+","+min3.get(j).dec;
                min4.add(new cell(te1,te2));
                min3.get(i).check=true;
                min3.get(j).check=true;
              }
           }
       }
          for(i=0;i<min4.size();++i)
       {
           for(j=i+1;j<min4.size();++j)
           {boolean bol =true;
                 count=0;
              for( k=0;k<7;++k)
              {
              if(min4.get(i).bin.charAt(k)!= min4.get(j).bin.charAt(k))
              {
                  ++count;
              temp=k;
              }
              }
              if(count==1)
              { 
              String te1=min4.get(j).bin.substring(0,temp)+"_"+min4.get(j).bin.substring(temp+1,7);
               String te2=min4.get(i).dec+","+min4.get(j).dec;
                   min5.add(new cell(te1,te2));
                min4.get(i).check=true;
                min4.get(j).check=true;
              }
           }
       }
           for(i=0;i<min5.size();++i)
       {
           for(j=i+1;j<min5.size();++j)
           {boolean bol=true;
                 count=0;
              for( k=0;k<7;++k)
              {
              if(min5.get(i).bin.charAt(k)!= min5.get(j).bin.charAt(k))
              {
                  ++count;
              temp=k;
              }
              }
              if(count==1)
              { 
              String te1=min5.get(j).bin.substring(0,temp)+"_"+min5.get(j).bin.substring(temp+1,7);
               String te2=min5.get(i).dec+","+min5.get(j).dec;
                min6.add(new cell(te1,te2));
                min5.get(i).check=true;
                min5.get(j).check=true;
              }
           }
       }
            for(i=0;i<min6.size();++i)
       {
           for(j=i+1;j<min6.size();++j)
           {boolean bol=true;
                 count=0;
              for( k=0;k<7;++k)
              {
              if(min6.get(i).bin.charAt(k)!= min6.get(j).bin.charAt(k))
              {
                  ++count;
              temp=k;
              }
              }
              if(count==1)
              { 
              String te1=min6.get(j).bin.substring(0,temp)+"_"+min6.get(j).bin.substring(temp+1,7);
               String te2=min6.get(i).dec+","+min6.get(j).dec;
                min7.add(new cell(te1,te2));
                min6.get(i).check=true;
                min6.get(j).check=true;
              }
           }
       }
          for(i=0;i<min7.size();++i)
       {
           for(j=i+1;j<min7.size();++j)
           {boolean bol=true;
                 count=0;
              for( k=0;k<7;++k)
              {
              if(min7.get(i).bin.charAt(k)!= min7.get(j).bin.charAt(k))
              {
                  ++count;
              temp=k;
              }
              }
              if(count==1)
              { 
              String te1=min7.get(j).bin.substring(0,temp)+"_"+min7.get(j).bin.substring(temp+1,7);
               String te2=min7.get(i).dec+","+min7.get(j).dec;
                min8.add(new cell(te1,te2));
                min7.get(i).check=true;
                min7.get(j).check=true;
              }
           }
       }
         for(i=0;i<min.size();++i){
               for(j=i+1;j<min.size();++j){
              if(min.get(i).bin.equals(min.get(j).bin)&&min.get(j).check==false&&min.get(i).check==false)
                  min.remove(i);        
          }
           }
                
           for(i=0;i<min2.size();++i){
               for(j=i+1;j<min2.size();++j){
              if(min2.get(i).bin.equals(min2.get(j).bin)&&min2.get(j).check==false&&min2.get(i).check==false)
                  min2.remove(i);        
          }
           }
        
                
           for(i=0;i<min3.size();++i)
           {
               for(j=i+1;j<min3.size();++j)
               {
              if(min3.get(i).bin.equals(min3.get(j).bin)&&min3.get(j).check==false&&min3.get(i).check==false)
                  min3.remove(i);        
               }
           }
               
           for(i=0;i<min4.size();++i)
           {
               for(j=i+1;j<min4.size();++j)
               {
              if(min4.get(i).bin.equals(min4.get(j).bin)&&min4.get(j).check==false&&min4.get(i).check==false)
                  min4.remove(i);        
               }
           }
        
               
           for(i=0;i<min5.size();++i){
               for(j=i+1;j<min5.size();++j){
              if(min5.get(i).bin.equals(min5.get(j).bin)&&min5.get(j).check==false&&min5.get(i).check==false)
                  min5.remove(i);        
          }
           }
        
               
           for(i=0;i<min6.size();++i){
               for(j=i+1;j<min6.size();++j){
              if(min6.get(i).bin.equals(min6.get(j).bin)&&min6.get(j).check==false&&min6.get(i).check==false)
                  min6.remove(i);        
          }
           }
        
               
           for(i=0;i<min7.size();++i){
               for(j=i+1;j<min7.size();++j){
              if(min7.get(i).bin.equals(min7.get(j).bin)&&min7.get(j).check==false&&min7.get(i).check==false)
                  min7.remove(i);        
          }
           }     
           for(i=0;i<min8.size();++i){
               for(j=i+1;j<min8.size();++j){
              if(min8.get(i).bin.equals(min8.get(j).bin)&&min8.get(j).check==false&&min8.get(i).check==false)
                  min8.remove(i);        
          }
           }
             for(i=0;i<min.size();++i){
              if(min.get(i).check==false)
                  finalv.add(new cell(min.get(i).bin,min.get(i).dec));
          }
          for(i=0;i<min2.size();++i){
              if(min2.get(i).check==false)
                   finalv.add(new cell(min2.get(i).bin,min2.get(i).dec));
          }
               
          for(i=0;i<min3.size();++i){
              if(min3.get(i).check==false)
                   finalv.add(new cell(min3.get(i).bin,min3.get(i).dec));
          }
               
          for(i=0;i<min4.size();++i){
              if(min4.get(i).check==false)
                   finalv.add(new cell(min4.get(i).bin,min4.get(i).dec));
          }
               
          for(i=0;i<min5.size();++i){
              if(min5.get(i).check==false)
                   finalv.add(new cell(min5.get(i).bin,min5.get(i).dec));
          }
               
          for(i=0;i<min6.size();++i){
              if(min6.get(i).check==false)
                   finalv.add(new cell(min6.get(i).bin,min6.get(i).dec));
          }
               for(i=0;i<min7.size();++i){
              if(min7.get(i).check==false)
                   finalv.add(new cell(min7.get(i).bin,min7.get(i).dec));
          }
               for(i=0;i<min8.size();++i){
              if(min8.get(i).check==false)
                   finalv.add(new cell(min8.get(i).bin,min8.get(i).dec));
          }
               for(i=0;i<finalv.size();++i)
               {
                finalv.get(i).arr=finalv.get(i).dec.split("[,]");
                for(j=0;j<finalv.get(i).arr.length;++j){
                    finalv.get(i).arr2.add(Integer.parseInt(finalv.get(i).arr[j]));
                       }
                
               }
              if(don.size()>0)
              {
                  ArrayList<Integer> fr=new ArrayList<>();
                  for(i=0;i<don.size();++i)
                      fr.add(Integer.parseInt(don.get(i).dec));
                  for(k=0;k<fr.size();++k)
                  {
              for(i=0;i<finalv.size();++i)
               {
               for(j=0;j<finalv.get(i).arr2.size();++j)
               {
               if(finalv.get(i).arr2.get(j)==fr.get(k))
               finalv.get(i).arr2.remove(j);
               }
               }
               }
              }
                ArrayList<Integer> t=new ArrayList<>();
                   int[] occurence=new int[128];
               for(j=0;j<finalv.size();++j)
               {
                   for(i=0;i<finalv.get(j).arr2.size();++i){
                       for(k=0;k<128;++k){
                       if(finalv.get(j).arr2.get(i)==k)
                       ++occurence[k];
                   }
                   }
               }
               ArrayList<Integer> res=new ArrayList<>();  
               int ty=0;
               
                           for(j=0;j<finalv.size();++j){
                             for(k=0;k<finalv.get(j).arr2.size();++k){
                                 for(i=0;i<128;++i){
                                  if(occurence[i]==1&&finalv.get(j).arr2.get(k)==i){
                                   res.add(j);
                                 esent.add(new cell(finalv.get(j).bin,finalv.get(j).dec));
                                finalv.get(j).check=true;
                               
                               }     
                       }
                   }
                   }
                           for(j=0;j<res.size();++j){
                       
                           for(i=0;i<finalv.get(res.get(j)).arr2.size();++i){
                               t.add(finalv.get(res.get(j)).arr2.get(i));
                           }
                   }       
                 //  for(i=0;i<finalv.get(res[i]).arr2.size();++i)
                  // {
                  //     System.out.println(finalv.get(res[i]).arr2.get(i));
                      
                  // }
                      
                 
                  for(i=0;i<t.size();++i){
                    for(j=0;j<finalv.size();++j){
                       for(k=0;k<finalv.get(j).arr2.size();++k){
                           if(finalv.get(j).arr2.get(k)==t.get(i))
                               finalv.get(j).arr2.remove(k);
                       } 
                    } 
                  }
                  int counter;
                  for(i=0;i<finalv.size();++i){
                      for(j=i+1;j<finalv.size();++j){
                          counter=0;
                      if(finalv.get(i).check==false&&finalv.get(j).check==false){
                          if(finalv.get(i).arr2.size()>finalv.get(j).arr2.size()){
                            for(k=0;k<finalv.get(i).arr2.size();++k){
                                for(l=0;l<finalv.get(j).arr2.size();++l)
                                {
                                    if(finalv.get(i).arr2.get(k)== finalv.get(j).arr2.get(l))
                                        ++counter;
                                }
                                
                            }
                            if(counter==finalv.get(j).arr2.size()){
                                esent.add(new cell(finalv.get(i).bin,finalv.get(i).dec));
                            }
                          }
                         else if(finalv.get(i).arr2.size()<finalv.get(j).arr2.size()){
                            for(k=0;k<finalv.get(j).arr2.size();++k){
                                for(l=0;l<finalv.get(i).arr2.size();++l)
                                {
                                    if(finalv.get(j).arr2.get(k)== finalv.get(i).arr2.get(l))
                                        ++counter;
                                }
                                
                            }
                            if(counter==finalv.get(i).arr2.size()){
                                esent.add(new cell(finalv.get(j).bin,finalv.get(j).dec));
                                finalv.remove(i);
                            }
                          }
                         else{
                         
                              esent.add(new cell(finalv.get(j).bin,finalv.get(j).dec));
                              rr.add(finalv.get(i).bin);
                              finalv.remove(i);
                      }
                  }
                  }
                  }
                   for(i=0;i<esent.size();++i)
                   {
                       for(j=0;j<esent.size();++j)
                       {
                           if(esent.get(i).bin.equals(esent.get(j).bin)&&i!=j)
                               esent.remove(j);
                       }
                  }
                  
                //   for(i=0;i<esent.size();++i)
         // System.out.println(esent.get(i).bin);
                   
              
         String[] store=new String[100];
        int var2=7-var; 
        for(j=0;j<esent.size();++j){
             k=65;
        for(i=var2;i<7;++i){
            if(esent.get(j).bin.charAt(i)=='1'){
            store[j]+=Character.toString((char)(k));
            ++k;
            }
            else if(esent.get(j).bin.charAt(i)=='0'){
            
                store[j]+=(Character.toString((char)k)+"'");
                ++k;
        }
            else
                ++k;
}  
        }
        String result="";
        for(i=0;i<store.length;++i){
            if(store[i]!=null){
                result+=store[i].substring(4)+"+";     
            }
              
        }
          System.out.println(result);
        /*String result1,result2;
        int yu=1;
        if(rr.size()==0)
          System.out.println(result);
        if(rr.size()!=0){
          for(i=0;i<rr.size();++i){
              if(rr.size()==1){
                  System.out.println(result); 
                  System.out.println(result+"+"+rr.get(0));
              }
              else
                 result+=rr.get(i);  
              yu=0;
          }if(yu==0)
            System.out.println(result);
        }*/
                                 }
                                 else 
                                     System.out.println("1");
      }               
      }
    

                         
