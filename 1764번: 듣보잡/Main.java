/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1764                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: kdh1998kdh <boj.kr/u/kdh1998kdh>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1764                           #+#        #+#      #+#    */
/*   Solved: 2025/04/08 09:25:17 by kdh1998kdh    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		int m;
		String buffer;
		List<String> nNames = new ArrayList<>();
		List<String> result = new ArrayList<>();

		n = sc.nextInt();
		m = sc.nextInt();

		for (int idx = 0; idx < n; idx++)
			nNames.add(sc.next());

		for (int i = 0; i < m; i++) {
			buffer = sc.next();
			for (int j = 0; j < n; j++) {
				if (nNames.get(j).equals(buffer)) {
					result.add(nNames.get(j));
					nNames.remove(j);
					result.add(buffer);
					n--;
					break;
				}
			}
		}

		Collections.sort(result);
		System.out.println(result.size());
		for (String name : result) {
			System.out.println(name);
		}

		sc.close();
	}
}