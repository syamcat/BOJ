/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 8393                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: kdh1998kdh <boj.kr/u/kdh1998kdh>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/8393                           #+#        #+#      #+#    */
/*   Solved: 2025/04/07 10:55:14 by kdh1998kdh    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = n / 2;
		int middle = 0;

		if (n % 2 != 0)
			middle = n / 2 + 1;
		
		System.out.println(((1 + n) * count + middle));

		sc.close();
	}
}