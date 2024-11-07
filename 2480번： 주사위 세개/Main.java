/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2480                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: kdh1998kdh <boj.kr/u/kdh1998kdh>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2480                           #+#        #+#      #+#    */
/*   Solved: 2024/11/06 22:56:22 by kdh1998kdh    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		int dice3 = sc.nextInt();
		int result = 0;

		sc.close();

		if (dice1 == dice2 && dice2 == dice3) {
			result = 10000 + (dice1 * 1000);
		} else if(dice1 == dice2 || dice2 == dice3 || dice1 == dice3) {
			result = 1000 + ((dice1 == dice2 ? dice1 : (dice2 == dice3 ? dice2 : dice3)) * 100);
		} else {
			result = (dice1 > dice2 ? (dice1 > dice3 ? dice1 : dice3) : (dice2 > dice3 ? dice2 : dice3)) * 100;
		}

		System.out.println(result);
	}
}