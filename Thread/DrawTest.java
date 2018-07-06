package Thread;

public class DrawTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Account acct = new Account("123456",1000);
		new DrawThread("甲",acct,800).start();
		new DrawThread("乙",acct,800).start();
*/
		//创建一个账户
		Acountwait acctsu = new Acountwait("1245",0);
		new DrawThread("取钱者",acctsu,800).start();
		new DepositThread("存钱者甲",acctsu,800).start();
		new DepositThread("存钱者乙",acctsu,800).start();
		new DepositThread("存钱者丙",acctsu,800).start();
	}

}
