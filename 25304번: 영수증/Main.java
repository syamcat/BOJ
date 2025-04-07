/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 25304                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: kdh1998kdh <boj.kr/u/kdh1998kdh>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/25304                          #+#        #+#      #+#    */
/*   Solved: 2025/04/07 11:09:44 by kdh1998kdh    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int total = 0;
		int variables = 0;
		int items[][] = null;
		int check = 0;

		total = sc.nextInt();
		variables = sc.nextInt();
		items = new int[variables][2];
		for(int idx = 0; idx < variables; idx++) {
			items[idx][0] = sc.nextInt();
			items[idx][1] = sc.nextInt();
			check += items[idx][0] * items[idx][1];
		}
		
		if (total == check)
			System.out.println("Yes");
		else
			System.out.println("No");

		sc.close();
	}
}