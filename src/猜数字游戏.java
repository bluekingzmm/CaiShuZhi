import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;

public class 猜数字游戏 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out
				.println("┌─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┐\n");
		System.out
				.println("│                                           <(￣︶￣)><(￣︶￣)><(￣︶￣)><(￣︶￣)><(￣︶￣)><(￣︶￣)><(￣︶￣)><(￣︶￣)>               │\n");
		System.out
				.println("│                                    (^_^)∠※(^_^)∠※(^_^)∠※(^_^)∠※(^_^)∠※(^_^)∠※(^_^)∠※(^_^)∠※                                                                                     │\n");
		System.out
				.println("│               猜数字游戏                                                                                                   ●０●                                                                    │\n");
		System.out
				.println("│                                                                                                                         │\n");
		System.out
				.println("│                                    ^_^o~ 努力！@_@           (>^ω^<)(>^ω^<)(>^ω^<)(>^ω^<)                                 │\n");
		System.out
				.println("│                        ●０●●０●●０●●０●●▽●(>^ω^<)(>^ω^<)(>^ω^<)(>^ω^<)(>^ω^<)(>^ω^<)(>^ω^<)(>^ω^<)                        │\n");
		System.out
				.println("│                                                                                                                         │\n");
		System.out
				.println("└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘\n");
		for (int a = 0; a < 40; a++) {
			Thread.sleep(40);
			System.out.print("<<<");

		}
		System.out.println();

		int max = 100;
		int min = 1;
		int times = 10;// 次数
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
		
			long startTime = System.currentTimeMillis();// 定义一个时间变量

			SimpleDateFormat sNowDate = new SimpleDateFormat();

			int shu;
			int n;// 随机数

			System.out.println("1:开始游戏     2：游戏帮助     3：游戏配置    4：退出游戏");
			int m = sc.nextInt();
			switch (m) {
			case 1:

				n = (int) (Math.random() * 100);
				System.out.println(n);

				System.out.print("请你猜" + min + "到" + max + " 你一共有" + times
						+ "次机会,好好把握");

				for (int i = 1; i <= times; i++) {// 用户输入的个数shu小于i次数
					System.out.println("请输入你的数字");
					shu = sc.nextInt();

					if (shu == n) {

						System.out.println("恭喜你，你用了" + i + "次就猜对了");
						break;
					} else if (shu < n) {
						System.out.println("很遗憾,你猜小了，你还有" + (times - i)
								+ "次机会,加油");

					} else {
						System.out
								.println("很遗憾，你猜大了，你还有" + (times - i) + "次机会");
					}

				}
				long sendTime = System.currentTimeMillis();
				System.out.println("当前时间 :"
						+ sNowDate.format(new Date(sendTime)));// new
																// Date()为获取当前系统时间

				// System.out.println("当前时间 :" +sNowDate);

				System.out.println("所用时间 :" + (sendTime - startTime) / 1000
						+ "秒");

				break;
			case 2:
				System.out.println("游戏帮助");
				System.out
						.println("这是一个智力题目，非常简单,系统会随机抽一个数字让你猜，一是靠运气，2是靠大脑思维，加油吧");

				break;

			case 3:

				System.out.println("请输入你的最大值，原最大值是：" + max);
				max = sc.nextInt();
				System.out.println("请输入你的最小值，原最小值是：" + min);
				min = sc.nextInt();

				System.out.println("请输入你的次数，原次数是" + times);
				times = sc.nextInt();

				break;

			case 4:

				System.out.println("游戏结束了，欢迎你下次再来，88");
				flag = false;
				break;

			}

		}
		//
		// //主函数
		//
		//
		//
		//
		//
		//
		//
		//
		//
		// //shit+Ctrl+o
		//
		// int result;
		//
		// //随机产生一个在100以内的数字
		//
		// int number = (int)(Math.random()*100);
		//
		// System.out.println("\n***********猜数码小游戏，你hold得住吗？*********");
		//
		// System.out.println("\n  ********随机数字产生：不告诉你！*********\n");
		//
		// System.out.println("\n  ***********答案："+number+"***************\n");
		//
		// System.out.println("让我们动动脑筋来猜一猜吧，小提示：他是一个从1到100的整数");
		//
		// long sTartTime=System.currentTimeMillis();//定义一个时间变量
		//
		// for(int i=1;i<100;i++){
		//
		// System.out.println("请输入你第"+i+"次的猜测");
		//
		// Cai calssOne;
		// result=Cai.guess(i);//通过调用输入函数得到输入结果
		//
		// //通过比较输出控制台
		//
		// if(result>number)
		//
		// System.out.println("不好意思，您所猜的数字大于谜底数字!");
		//
		// else if(result < number)
		//
		// System.out.println("不好意思，您所猜的数字小于谜底数字!");
		//
		// else {
		//
		// SimpleDateFormat sNowDate = new
		// SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//
		// long sEndTime=System.currentTimeMillis();
		//
		// System.out.println("\n  ***********正确答案："+number+"***************\n");
		//
		// if(i==1){
		//
		// System.out.println("perfect!!恭喜您！一次就中!!");
		//
		// }
		//
		// else if(i<10){
		//
		// System.out.println("good job! 您总共猜了"+i+"次, 还要继续加油!!");
		//
		// }
		//
		// else{
		//
		// System.out.println("not bad! 您总共猜了"+i+"次, 任重而道远啊！");
		//
		// }
		//
		// System.out.println("当前时间 :" +sNowDate.format(new Date(sEndTime)));//
		// new Date()为获取当前系统时间
		//
		// //System.out.println("当前时间 :" +sNowDate);
		//
		// System.out.println("所用时间 :" +(sEndTime-sTartTime)/1000+"秒");
		//
		// return;
		//
		// }
		//
		// }
		//
		// }
		//
		// //输入函数
		//
		// public static int guess(int i){
		//
		// //通过引入import java.util.Scanner类包
		//
		// Scanner sc=new Scanner(System.in);
		//
		// int result;
		//
		// try{
		//
		// //使在控制台输入的内容必须为数字
		//
		// result=sc.nextInt();
		//
		// return result;
		//
		// }
		//
		// catch (Exception e) {
		//
		// // TODO: handle exception
		//
		// System.out.println("你輸入的不是數字,请重新输入第"+i+"个数字");
		//
		// //调用本函数重新输入
		//
		// guess(i);
		//
		// }
		//
		// return 0;

	}

}
