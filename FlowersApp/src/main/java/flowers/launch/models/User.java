package flowers.launch.models;

public class User {
	
	private Long userId;
	private String userName;
	private String userType;
	private String password;
	
	public User(Long userId, String userName, String userType, String password) 
	{
		super();
		this.setUserId(userId);
		this.setUserType(userType);
		this.setUserName(userName);
		this.setPassword(password);
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
