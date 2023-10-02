class Agent {
	private int id;
	private String name;
	private String batch;
	private int height;
	private int weight;
	private double successRate;
	private Address address;
	@Override
	public String toString() {
		return "Agent [id=" + id + ", name=" + name + ", batch=" + batch + ", height=" + height + ", weight=" + weight
				+ ", successRate=" + successRate + "]";
	}
	public Address getAddress() {
		Address ad = new Address();
		ad.aptNo = this.address.aptNo;
		return ad;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Agent(int id, String str) {
		this.id = id;
		this.name = str;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		if(id>=1)
		   this.id = id;
	} 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getSuccessRate() {
		return successRate;
	}
	public void setSuccessRate(double successRate) {
		
		this.successRate = successRate;
	}
}
class Address {
	String aptNo;
	String street;
	int zipcode;
	String city;
	
	
}