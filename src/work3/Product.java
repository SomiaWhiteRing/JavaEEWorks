package work3;

public class Product {
	private int pro_id;
	private String pro_name;
	private float pro_price;
	private int pro_count;
	private String pro_owner;
	private String pro_address;
	public Product(){
		super();
	}
	public void setpro_id(int pro_id){
		this.pro_id = pro_id;
	}
	public void setpro_name(String pro_name){
		this.pro_name = pro_name;
	}
	public void setpro_price(float pro_price){
		this.pro_price = pro_price;
	}
	public void setpro_count(int pro_count){
		this.pro_count = pro_count;
	}
	public void setpro_owner(String pro_owner){
		this.pro_owner = pro_owner;
	}
	public void setpro_address(String pro_address){
		this.pro_address = pro_address;
	}
	@Override
	public String toString() {
		return "��ƷidΪ:" + pro_id + 
				"\n��Ʒ����Ϊ:" + pro_name + 
				"\n��Ʒ�۸�Ϊ:" + pro_price + "Ԫ" +
				"\n��Ʒ����Ϊ:" + pro_count + "��" +
				"\n��Ʒ������Ϊ:" + pro_owner +
				"\n��Ʒ������Ϊ:" + pro_address;
	}

}
