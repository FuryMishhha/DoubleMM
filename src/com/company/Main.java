package com.company;
import com.company.Fut;
import com.company.Story;

import java.util.Scanner;

public class Main {

	public static java.lang.Character manager;
	public static Story story;
	public static Fut fut;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);


		int n = 0;
		int a = 10, b = 20;
		int c = 0, d = 0;
		while (true) {


			story = new Story(n);


			System.out.println("=====\nУмения нашейй команды:" + a + "\tНастроение нашей команды:"
					+ b + "\n=====");
			fut = new Fut();
			if (n != 0) {


				fut.go1(n);
				c = fut.current_situation1.um;
				d = fut.current_situation1.mor;
				System.out.println("=====\nУмения соперника:" + c + "\tНастроение соперника:"
						+ d + "\n=====");
				if (d + c > a + b && d != 23) {
					System.out
							.println("====================Поражение, увы((((===================");
					return;
				} else {

					System.out
							.println("====================Победа!===================");
					if(n==3){
						System.out
								.println("====================ВЫ выиграли чемпионать мира, поздравляю!!!!!!!===================");
						System.out
								.println("====================the end!===================");
						return;
					}
					if(n!=3) {
						System.out.println("=============" + "-"
								+ story.current_situation.subject + "==============");
						System.out.println(story.current_situation.text);
						if (story.isEnd()) {
							System.out
									.println("====================the end!===================");
							return;
						}

						story.go(in.nextInt());
						a = a + story.current_situation.um;
						b += story.current_situation.mor;
						n++;
					}
				}

			} else {
				System.out.println("=============" + "-"
						+ story.current_situation.subject + "==============");
				System.out.println(story.current_situation.text);
				if (story.isEnd() || n == 3) {
					System.out
							.println("====================the end!===================");
					return;
				}

				story.go(in.nextInt());
				a = a + story.current_situation.um;
				b += story.current_situation.mor;
				n++;
			}

		}
	}
}
