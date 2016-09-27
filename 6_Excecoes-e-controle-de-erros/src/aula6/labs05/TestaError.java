package aula6.labs05;

/*
 * O que acontece é um java.lang.OutOfMemoryError, que é um Error em vez
 * de uma Exception.
 * http://docs.oracle.com/javase/7/docs/api/java/lang/OutOfMemoryError.html
 * 
 * O código para fazer esse erro é:
 */
public class TestaError {

	public static void main(String[] args) {
		String[] ss = new String[Integer.MAX_VALUE];
	}
	/*
	 * Exception in thread "main" java.lang.OutOfMemoryError: Requested array
	 * size exceeds VM limit at aula6.labs05.TestaError.main(TestaError.java:13)
	 */
}
