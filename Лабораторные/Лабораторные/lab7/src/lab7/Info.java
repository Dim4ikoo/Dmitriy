package lab7;


import java.time.LocalDate;
import java.util.Calendar;

public class Info {
	private LocalDate dateOfexit;//���� ��������� 
	private LocalDate dateOfent;//���� ���������
	private Guest guest;
	
	public Guest getOffender() {
		return guest;
	}

	public void setOffender(Guest guest) {
		this.guest = guest;
	}

	public Info(LocalDate dateOfexit, LocalDate dateOfLastduresse, LocalDate dateOfLastexemption, LocalDate dateOfent, Guest guest)
	{
		this.dateOfexit=dateOfexit;
		this.dateOfent= dateOfent;
		this.guest=guest;
	}


	public LocalDate getdateOfexit() {
		return dateOfexit;
	}

	public void setDateOfCrime(LocalDate dateOfexit) {
		this.dateOfexit = dateOfexit;
	}


	public LocalDate getDateOfBirth() {
		return dateOfent;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfent = dateOfent;
	}

	public static void Show(Info hotel)
	{
		System.out.println("�������: " + hotel.guest.getLast_name());
		System.out.println("���: " + hotel.guest.getName());
		System.out.println("��������: " + hotel.guest.getMiddle_name());
		System.out.println("���� ���������: " + hotel.dateOfent);
		System.out.println("���� ���������: " + hotel.dateOfexit);
		System.out.println(("�����: "+ "����" ));
		System.out.println(("������: "+ "20" ));
		System.out.println(("������� ���������: "+ "�������������" ));
	}
}
