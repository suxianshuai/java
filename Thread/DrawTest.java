package Thread;

public class DrawTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Account acct = new Account("123456",1000);
		new DrawThread("��",acct,800).start();
		new DrawThread("��",acct,800).start();
*/
		//����һ���˻�
		Acountwait acctsu = new Acountwait("1245",0);
		new DrawThread("ȡǮ��",acctsu,800).start();
		new DepositThread("��Ǯ�߼�",acctsu,800).start();
		new DepositThread("��Ǯ����",acctsu,800).start();
		new DepositThread("��Ǯ�߱�",acctsu,800).start();
	}

}
