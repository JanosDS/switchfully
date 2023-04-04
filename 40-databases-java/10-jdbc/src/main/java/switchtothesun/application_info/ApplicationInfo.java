package switchtothesun.application_info;

public class ApplicationInfo {

	private int id;
	private String title;
	private String adminEmail;
	private int version;

	public ApplicationInfo(int id, String title, String adminEmail, int version) {
		this.id = id;
		this.title = title;
		this.adminEmail = adminEmail;
		this.version = version;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public int getVersion() {
		return version;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}
