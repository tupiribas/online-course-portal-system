package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Student> set = new HashSet<>();

		String[] type = new String[] { "A", "B", "C" };

		int q = 0;
		while (q <= 2) {
			System.out.print("How many studants for course " + type[q] + "? ");
			int quant = sc.nextInt();
			for (int i = 0; i < quant; i++) {
				int id = sc.nextInt();
				set.add(new Student(id));
				sc.nextLine();
			}
			q++;
		}
		System.out.println("Total studant: " + set.size());

		sc.close();

	}
}
