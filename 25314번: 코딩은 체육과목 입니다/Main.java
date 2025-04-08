/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 25314                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: kdh1998kdh <boj.kr/u/kdh1998kdh>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/25314                          #+#        #+#      #+#    */
/*   Solved: 2025/04/07 12:00:45 by kdh1998kdh    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inputNum;
		int count;

		inputNum = sc.nextInt();

		count = inputNum / 4;

		if (inputNum % 4 > 0)
			count++;

		while (count > 0) {
			System.out.printf("long ");
			count--;
		}

		System.out.printf("int\n");
	}
}