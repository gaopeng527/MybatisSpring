package gao.ssm.po;

import java.util.List;

/**
 * �û���װ���ͣ��������װ����Ҫ�Ĳ�ѯ����
 * @author DELL
 *
 */
public class UserQueryVo {

	// ������id
	private List<Integer> ids;
	
	// �û���ѯ����
	private UserCustom userCustom;

	public UserCustom getUserCustom() {
		return userCustom;
	}

	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}
	
	// ���԰�װ������ѯ���������綩������Ʒ
	// ...
}
