/**
 *
 */
public class RenamedBlaBla {

	public static int kompare(String one, String two) {

		if (two == null && one == null) { return 0; }

		if (two == null) { return -1; }

		if (one == null) { return 1; }

		return two.compareTo(one);
	}

}
