package annotation01;

public class TestDrive {
	public static void main(String[] args) {
		UserA a = new UserA("S001","Test Kim");
		UserB b = new UserB("1","Test Han");
		
		IdExtractor idExtractor = new IdExtractor();
		String idA = idExtractor.extractId(a);
		String idB = idExtractor.extractId(b);
		
		System.out.println("A : " + idA);
		System.out.println("B : " + idB);
	}
}
