import java.util.Scanner;

public class Xai {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.out
		.println("������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������\n");
System.out
		.println("��                                           <(�����)><(�����)><(�����)><(�����)><(�����)><(�����)><(�����)><(�����)>               ��\n");
System.out
		.println("��                                    (^_^)�ϡ�(^_^)�ϡ�(^_^)�ϡ�(^_^)�ϡ�(^_^)�ϡ�(^_^)�ϡ�(^_^)�ϡ�(^_^)�ϡ�                                                                                     ��\n");
System.out
		.println("��               ��������Ϸ                                                                                                   �񣰡�                                                                    ��\n");
System.out
		.println("��                                                                                                                         ��\n");
System.out
		.println("��                                    ^_^o~ Ŭ����@_@           (>^��^<)(>^��^<)(>^��^<)(>^��^<)                                 ��\n");
System.out
		.println("��                        �񣰡�񣰡�񣰡�񣰡�񨌡�(>^��^<)(>^��^<)(>^��^<)(>^��^<)(>^��^<)(>^��^<)(>^��^<)(>^��^<)                        ��\n");
System.out
		.println("��                                                                                                                         ��\n");
System.out
		.println("������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������\n");
for (int a = 0; a < 40; a++) {
	Thread.sleep(40);
	System.out.print("<<<");

}
System.out.println();

		try {
			Scanner sc = new Scanner(System.in);//��������
			int max = 100;
			int min = 1;
			int times = 10;//����
			boolean flag = true;//������ѭ��
		
			
			while (flag) {
				

				int m;
				
				System.out
						.println("1:��ʼ��Ϸ�������֣�  2����Ϸ����   3����Ϸ����   4������ĸ  5����Ϸ�˳�");
				
				System.out.println("���Ǵ�" + min + "��" + max + "������,��һ����" + times
						+ "�λ���");
				int n = sc.nextInt();//���ܶ���

				switch (n) {

				case 1:

					m = (int) (Math.random() * (max - min) + min);
					System.out.println(m);

					

					for (int i = 1; i <= times; i++) {
						System.out.print("�������������");
						int shu = sc.nextInt();
						if (shu == m) {
							System.out.println("��ϲ�㣬��ֻ��" + i + "�¶��ˣ�");
							break;

						} else if (shu > m) {
							System.out.println("���ź�����´��ˣ��㻹��" + (times - i)
									+ "�λ���");
						} else if (shu < m) {
							System.out.println("���ź������С�ˣ��㻹��" + (times - i)
									+ "�λ���");

						} else if (i == times) {
							System.out.print("��Ϸ��������Ĵ���������");
						}

					}

					break;
				case 2:
					System.out.print("����һ���򵥵���Ϸ");

					break;
				case 3:

					System.out.println("���������ڵ�һ�����ֵ��ԭ�������ֵ��"+max);
					int tempMax = sc.nextInt();
					System.out.println("���������ڵ�һ����Сֵ��ԭ������Сֵ��"+min);
					int tempMin = sc.nextInt();
					System.out.println("���������ڵĴ�����ԭ���Ĵ���Ϊ" + times);
					int tempTimes = sc.nextInt();
					if(tempMax>tempMin  &&tempTimes<(tempMax-tempMin)){
						System.out.println("��ϲ�㣬�����óɹ�");
					}else{
						System.out.print("���ź���������ʧ��");
					}
					
					break;
				case 4:

					
					
					char mchar= (char) (Math.random() * 26 + 'a');
					System.out.println(mchar);
					
					int chartimes = 5;
					
					for (int i = 1; i <= chartimes; i++) {
						System.out.print("�����������ĸ");
						char shu = sc.next().toLowerCase().charAt(0);
						
						
						
						if (shu == mchar) {
							System.out.println("��ϲ�㣬��ֻ��" + i + "�¶��ˣ�");
							break;

						} else if (shu > mchar) {
							System.out.println("���ź�����´��ˣ��㻹��" + (chartimes - i)
									+ "�λ���");
						} else if (shu < mchar) {
							System.out.println("���ź������С�ˣ��㻹��" + (chartimes - i)
									+ "�λ���");

						} else if (i == chartimes) {
							System.out.print("��Ϸ��������Ĵ���������");

						}

					}

					break;
				case 5:

					System.out.print("��Ϸ�����ˣ���ӭ�´�������!");
					System.exit(0);
					break;

				default:
					System.out.print("��������д�����������");
					break;
				}

			}

		} catch (Exception e) {
			System.out.println("�����ˣ����ǲ���������һ����Ч���ַ���������������");
			main(args);
			// TODO: handle exception
		}

	}

}
