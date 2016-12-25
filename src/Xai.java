import java.util.Scanner;

public class Xai {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
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

		try {
			Scanner sc = new Scanner(System.in);//创建对象
			int max = 100;
			int min = 1;
			int times = 10;//次数
			boolean flag = true;//创造死循环
		
			
			while (flag) {
				

				int m;
				
				System.out
						.println("1:开始游戏（猜数字）  2：游戏帮助   3：游戏配置   4：猜字母  5：游戏退出");
				
				System.out.println("这是从" + min + "到" + max + "的数字,你一共有" + times
						+ "次机会");
				int n = sc.nextInt();//接受对象

				switch (n) {

				case 1:

					m = (int) (Math.random() * (max - min) + min);
					System.out.println(m);

					

					for (int i = 1; i <= times; i++) {
						System.out.print("请输入你的数字");
						int shu = sc.nextInt();
						if (shu == m) {
							System.out.println("恭喜你，你只用" + i + "猜对了，");
							break;

						} else if (shu > m) {
							System.out.println("很遗憾，你猜大了，你还有" + (times - i)
									+ "次机会");
						} else if (shu < m) {
							System.out.println("很遗憾，你猜小了，你还有" + (times - i)
									+ "次机会");

						} else if (i == times) {
							System.out.print("游戏结束，你的次数用完了");
						}

					}

					break;
				case 2:
					System.out.print("这是一个简单的游戏");

					break;
				case 3:

					System.out.println("请输入现在的一个最大值，原来的最大值是"+max);
					int tempMax = sc.nextInt();
					System.out.println("请输入现在的一个最小值，原来的最小值的"+min);
					int tempMin = sc.nextInt();
					System.out.println("请输入现在的次数，原来的次数为" + times);
					int tempTimes = sc.nextInt();
					if(tempMax>tempMin  &&tempTimes<(tempMax-tempMin)){
						System.out.println("恭喜你，你配置成功");
					}else{
						System.out.print("很遗憾，你配置失败");
					}
					
					break;
				case 4:

					
					
					char mchar= (char) (Math.random() * 26 + 'a');
					System.out.println(mchar);
					
					int chartimes = 5;
					
					for (int i = 1; i <= chartimes; i++) {
						System.out.print("请输入你的字母");
						char shu = sc.next().toLowerCase().charAt(0);
						
						
						
						if (shu == mchar) {
							System.out.println("恭喜你，你只用" + i + "猜对了，");
							break;

						} else if (shu > mchar) {
							System.out.println("很遗憾，你猜大了，你还有" + (chartimes - i)
									+ "次机会");
						} else if (shu < mchar) {
							System.out.println("很遗憾，你猜小了，你还有" + (chartimes - i)
									+ "次机会");

						} else if (i == chartimes) {
							System.out.print("游戏结束，你的次数用完了");

						}

					}

					break;
				case 5:

					System.out.print("游戏结束了，欢迎下次再来啊!");
					System.exit(0);
					break;

				default:
					System.out.print("你输入的有错，请重新输入");
					break;
				}

			}

		} catch (Exception e) {
			System.out.println("出错了，你是不是输入了一个无效的字符，请你重新输入");
			main(args);
			// TODO: handle exception
		}

	}

}
