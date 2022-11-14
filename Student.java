package Lesson5String;

 class Student {
	private int Rno;
	public void setRno(int rno) {
		Rno = rno;
	}
	private float per;
	private String name;
	private String contactno;
	
	

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public int getRno() {
		return Rno;
	}
	@Override
	public String toString() {
		return "Student [rno=" + Rno + ", name=" + name + ", per=" + per + ", contactNo=" + contactno + "]";
	}
 }
		

	

	
	


