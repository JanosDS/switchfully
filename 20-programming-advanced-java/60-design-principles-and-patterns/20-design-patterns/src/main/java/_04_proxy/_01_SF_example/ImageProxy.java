package _04_proxy._01_SF_example;

public class ImageProxy implements Displayable {

	private ActualImage actualImage;
	private final String pathToImage;

	public ImageProxy(String pathToImage) {
		this.pathToImage = pathToImage;
	}

	@Override
	public void display() throws InterruptedException {
		if (actualImage == null) {
			displayPlaceholderImageWhileFetchingTheRealImage();
			System.out.println(String.format("(Loading file %s from remote server... This may take a while)", pathToImage));
			actualImage = new ActualImage(pathToImage);
		}
		actualImage.display();
	}

	private void displayPlaceholderImageWhileFetchingTheRealImage() {
		System.out.println("==================");
		System.out.println("=======   ========");
		System.out.println("======     =======");
		System.out.println("=====       ======");
		System.out.println("===  TEMP IMG  ===");
		System.out.println("=====       ======");
		System.out.println("======     =======");
		System.out.println("=======   ========");
		System.out.println("==================");
	}
}
