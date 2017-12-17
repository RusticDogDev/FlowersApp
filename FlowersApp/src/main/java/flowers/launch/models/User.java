package flowers.launch.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	private String userName;
	private String userType;
	private String password;
	
	public User() {}
	
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
	
	@Override
    public String toString() {
        return String.format(
                "User[userId=%d, userType='%s', userName='%s', password='%s']",
                userId, userType, userName, password);
    }


}
