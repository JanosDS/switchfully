package basic.codelab02;

public class Browser {

	public void multiDownload(Downloadable[] elementsToDownload) {
		for (Downloadable downloadable : elementsToDownload) {
			downloadable.download();
		}
	}
}
