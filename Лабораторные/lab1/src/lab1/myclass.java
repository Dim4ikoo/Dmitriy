package lab1;
public class myclass {
    public static void main(String[] args) {
        int NumBook = 0x4656; //number of my stud book in 16th system (18006 in 10th)
        System.out.println("����� ���� ������� � ����������������� �������: " + NumBook);
        long PhoneNumber = 380992282703L;
        System.out.println("��� ������� ����� : "+ PhoneNumber);
        int TwoLastNum = 0b100101; // 37, showed in 2th system
        System.out.println("��� ��������� ��������� ����� ����� ��������: " + TwoLastNum);
        int TwoLastNum1 = 07220; //3728 in 8th system
        System.out.println("������ ��������� ��������� ����� ����� ��������: " +  TwoLastNum1);
        int NumList = 8; //my number in studylist
        System.out.println("NumList mod 26 = " + ((NumList - 1 % 26)-1)); 
        System.out.println("������ �������� ��������: \u0046");
    	System.out.println("���-�� ������ � �������� ����� � ������ �������: ");
        Par_Nepar(NumBook);
        System.out.println("���-�� ������ � �������� ����� � ������ ��������: ");
        Par_Nepar_Long(PhoneNumber);
        System.out.println("���-�� ������ � �������� ����� � ��������� ���� ��������� ������ �� ������ : ");
        Par_Nepar(TwoLastNum);
        System.out.println("���-�� ������ � �������� ����� � ��������� ������� ��������� ������ �� ������ : ");
        Par_Nepar(TwoLastNum1);
        System.out.println("���-�� ������ � �������� ����� � ������ ������  : ");
        Par_Nepar(NumList);
        System.out.println("���-�� ������ � ������ ������� � �������� �������: ");
        Par_Nepar_Bin(NumBook);
        System.out.println("���-�� ������ � ������ �������� � �������� �������: ");
        Par_Nepar_Bin_Long(PhoneNumber);
        System.out.println("���-�� ������ � ��������� ���� ��������� ������ �� ������ � �������� �������: ");
        Par_Nepar_Bin(TwoLastNum);
        System.out.println("���-�� ������ � ��������� ������� ��������� ������ �� ������ � �������� �������: ");
        Par_Nepar_Bin(TwoLastNum1);
        System.out.println("���-�� ������ � ������ ������ � �������� ������� : ");
        Par_Nepar_Bin(NumList);
        
    }

public static void Par_Nepar(int k)
{
	String res = Integer.toString(k,10); // ������� 16. ����� � 10 
	int count_par = 0; 
	int count_nepar = 0;
	for (int i=0;i< res.length();i++)
	{
		int x = res.charAt(i) - '0'; // ������� ��� �������� � int
		if (x%2==0) {
			count_par++;
		}
		else {
		count_nepar++;	
		}
	}
	System.out.println(count_par);
	System.out.println(count_nepar);
}


public static void Par_Nepar_Long(long k)
{
	String res = Long.toString(k,10); // ������� 16. ����� � 10 
	int count_par = 0; 
	int count_nepar = 0;
	for (int i=0;i< res.length();i++)
	{
		int x = res.charAt(i) - '0'; // ������� ��� �������� � int
		if (x%2==0) {
			count_par ++;
		}
		else {
		count_nepar++;	
		}
	}
	System.out.println(count_par);
	System.out.println(count_nepar);
}

public static void Par_Nepar_Bin(int k)
{
	String res = Integer.toBinaryString(k); // ������� 16. ����� � 10 
	int count_odin = 0; 
	for (int i=0;i< res.length();i++)
	{
		int x = res.charAt(i) - '0'; // ������� ��� �������� � int
		if (x%2==1) {
			count_odin ++;
		}
	}
	System.out.println(count_odin);
}
public static void Par_Nepar_Bin_Long(long k)
{
	String res = Long.toBinaryString(k); // ������� 16. ����� � 10 
	int count_odin = 0; 
	for (int i=0;i< res.length();i++)
	{
		int x = res.charAt(i) - '0'; // ������� ��� �������� � int
		if (x%2==1) {
			count_odin ++;
		}
	}
	System.out.println(count_odin);
}

}

