package silly;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{

	public String hello(){
		
		System.out.println("hello world!");
		
		return SUCCESS;
	}

	public String add(){

		System.out.println("add");

		return SUCCESS;
	}
	
}
