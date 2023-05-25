import java.io.File;

public class KeenTest {
	public static void main(String[] args) {
		printPath("java.class.path");
	}

	public static void printPath(String name) {
		System.out.println(name + ":");
		String[] paths = System.getProperty(name).split(File.pathSeparator);
		for(String path : paths) {
			System.out.println("- " + path);
		}
	}
}
