package by.htp.linear01.main;

// Дано натуральное число T, которое представляет длительность прошедшего времени в секундах.
// Вывести данное значение длительности в часах, минутах и секундах в следующей форме: HHч MMмин SSс

public class Task22 {
	
	public static void main(String[] args) {
		
		int T = 10000 ;
		int HH;
		int MM;
		int SS;
		
		HH = T / 3600;
		MM =(int)(((double)(T / 3600) - HH) * 60);
		SS =(int)(((((double)(T / 3600) - HH) * 60) - MM) * 60); 
		System.out.println(HH + "ч" + MM + "мин" + SS + "с");
	}

}