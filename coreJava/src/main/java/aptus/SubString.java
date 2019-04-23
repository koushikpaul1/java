package aptus;

import java.io.*;
import java.util.*;

//return minimum length of substring containing all the characters of a string.
public class SubString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		String S = br.readLine();

		int out_ = SmallestSubString(S);
		wr.println(out_);

		wr.close();
		br.close();
	}

	static int SmallestSubString(String S) {
		Set<String> chars = new HashSet<String>();
		for (int i = 0; i < S.length(); i++) {
			chars.add(Character.toString(S.charAt(i)));
		}
		int len = 999999999;
		for (int i = 0; i < S.length(); i++) {
			for (int j = i + 1; j <= S.length(); j++) {
				String sub = S.substring(i, j);
				String[] CharAr = chars.toArray(new String[chars.size()]);
				boolean flag = true;
				for (int k = 0; k < CharAr.length; k++) {
					if (!sub.contains(CharAr[k]))
						flag = false;
				}
				if (flag == true && sub.length() <= len)
					len = sub.length();
			}
		}
		return len;

	}
}