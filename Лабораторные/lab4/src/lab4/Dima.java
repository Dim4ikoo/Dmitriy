package lab4;
import java.util.Scanner;


  public class Dima {

     public static void main(String[] args) {
    	 char[] keys1 = {'h', 'e', 'l', 'p'};
    	 
    	 char[] keys3 = {'d', 'e', 'b', 'u','g'};
    	 boolean dbg_1 =true;
    	 boolean dbg_2 = false; 
    	 
    	 for (int i = 0; i < args.length && i < keys1.length; i++) {
             if (args[i].charAt(0) == keys1[i]) {
               System.out.println("�������� -help ��������.\n" + "�����: �������� �.�. ������: ���101.8� \n"
               + " ��������� ������������� ��� �������� ����� ��������");
             }
         }
         
         
         
         for (int i = 0; i < args.length && i < keys3.length; i++) {
             if (args[i].charAt(0) == keys3[i]) {
               System.out.println("�������� -debug ���������. ������...");
           Switch(dbg_1);
             }
         }
     }
     
     
     
     public static int Switch(boolean debug)
     {
    	 
    	 Scanner key1= new Scanner(System.in);
    	 Scanner input1 = new Scanner (System.in);
    	 String str = " noon noon oppo";
    	 String strr= "noon";
    	 String str1 = "";
    	 String str2 = "";
    	 int key = -1;
    	 System.out.println("1.��������� ����� ");
    	 System.out.println("2.����������� ����� ");
    	 System.out.println("3.�������� ��������� ");
    	 System.out.println("4.����� ");
    	 do {
    	       while (key < 0 || key > 11) {
    	            if (key < -1 || key > 11)
    	             System.out.println("����� ������� ���.");
    	            System.out.print("������� ����� �������: ");
    	            key = input1.nextInt();
    	       }
    	 switch (key)
    	 {
    	 case 1: if (debug ==true)
    	 {
    		 System.out.println("�� ������� " + key);
    	 }
    	 System.out.println("�������� ������: ");
    	 str1=str;
    	 str2=strr;
    	 System.out.println("����� ��������");
    	 key=-1;
    	 break;
    	 case 2:
    		 if(debug==true)
    	        {
    	          System.out.println("�� ������� " + key);
    	        }
    	        System.out.println(str1);
    	        key=-1;
    	        break;
    	 case 3: 
    	        if(debug==true)
    	        {
    	          System.out.println("�� ������� " + key);
    	        }
    	        if(debug==true)
    	        {
    	          System.out.println("��� ���������");
    	        }
    	        func(str1,str2);
    	        //String res = replace(pos, str1, d);
    	        //System.out.println(res);
    	        key=-1;
    	        break;
    	      case 4:
    	    	  System.out.println("��������� �����������");
    	          System.exit(0);
    	      }
    	     }
    	     while (key != 0);
    	     return 0;
    	 }
 
  
     

    private static void func(String str1, String str2)
    {
        StringBuilder res = new StringBuilder();
       
          if(str1.contains(new StringBuilder(str2).reverse().toString())){
            res.append(str2);
          
          System.out.println("���� �����: "+res);
      
    }
    else
    {
    	 System.out.println("�� �������");
    }
  }
  }
  