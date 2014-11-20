package containers;

public class Account {

	private int accountid;
	private String firstname;
	private String lastname;
	private String phonenumber;
	private String username;
	private String email;
	private String password;
	private Address billinginfo;
	private Address shippinginfo;
	
	
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Address getBillinginfo() {
		return billinginfo;
	}
	public void setBillinginfo(Address billinginfo) {
		this.billinginfo = billinginfo;
	}
	public Address getShippinginfo() {
		return shippinginfo;
	}
	public void setShippinginfo(Address shippinginfo) {
		this.shippinginfo = shippinginfo;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
