package gao.ssm.po;
/**
 * ���������չ��
 * @author DELL
 * ͨ������ӳ�䶩�����û���ѯ������ô���̳����Խ϶��pojo��
 */
public class OrdersCustom extends Orders {
	private String username;
	private String sex;
	private String address;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "id: "+this.getId()+", userId: "+this.getUserId()+", number: "+this.getNumber()+
				", createtime: "+this.getCreatetime()+", note: "+this.getNote()+
				", username: "+username+", sex: "+sex+", address: "+address;
	}
	
}
