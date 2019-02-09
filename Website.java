
public class Website {
 private String name;
 private String userid;
 private String password;
 private String state;
 public void setpropertise(String name,String userid,String password,String state)
 {
	 this.name =name;
	 this.userid=userid;
	 this.password=password;
	 this.state=state;
 }
 public void display()
 {
	 System.out.println("Name: "+name);
	 System.out.println("userid :"+userid);
	 System.out.println("password :"+password);
	 System.out.println("state :"+state);
 }
 public static void main(String[] args) {
		// TODO Auto-generated method stub
      Website w = new Website();
      w.setpropertise("kaier","Abu kaiser","018282","dhaka");
      w.display();
	}

}
