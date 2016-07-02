package gao.ssm.po;

import java.util.Date;
import java.util.List;

/**
 * ������
 * @author DELL
 *
 */
public class Orders {
	private int id;
	private int userId;
	private String number; // ������
	private Date createtime; // ����ʱ��
	private String note; // ��ע
	private User user; // �û���Ϣ���ڲ���resultMapʱʹ��
	private List<Orderdetail> orderdetails; // ������ϸ��Ϣ��һ�����������ж��������ϸ��
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "id: "+this.getId()+", userId: "+this.getUserId()+", number: "+this.getNumber()+
				", createtime: "+this.getCreatetime()+", note: "+this.getNote()+
				", username: "+user.getUsername()+", sex: "+user.getSex()+", address: "+user.getAddress();
	}
	public List<Orderdetail> getOrderdetails() {
		return orderdetails;
	}
	public void setOrderdetails(List<Orderdetail> orderdetails) {
		this.orderdetails = orderdetails;
	}
	
}
