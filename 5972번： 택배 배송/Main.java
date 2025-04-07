/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 5972                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: kdh1998kdh <boj.kr/u/kdh1998kdh>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/5972                           #+#        #+#      #+#    */
/*   Solved: 2024/11/07 12:58:58 by kdh1998kdh    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("------------- result --------------");

		// while (sc.hasNext()) {
		// 	if (sc.hasNextInt()) {
		// 		System.out.println(sc.nextInt() + " ");
		// 	} else {
		// 		System.out.println(sc.next() + " ");
		// 	}
		// }

		while (sc.hasNextInt()) {
			System.out.println(sc.nextInt());
		}

		sc.close();
	}
}