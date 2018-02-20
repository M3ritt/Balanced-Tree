public class User {
	private String userName, password;

	public User() {
		this.userName = this.password = "";
	}

	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return this.userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setUserName(String influx) {
		this.userName = influx;
	}

	public void setPassword(String qwop) {
		this.password = qwop;
	}
}