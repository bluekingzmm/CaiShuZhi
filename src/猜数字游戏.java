import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;

public class ��������Ϸ {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
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

		int max = 100;
		int min = 1;
		int times = 10;// ����
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
		
			long startTime = System.currentTimeMillis();// ����һ��ʱ�����

			SimpleDateFormat sNowDate = new SimpleDateFormat();

			int shu;
			int n;// �����

			System.out.println("1:��ʼ��Ϸ     2����Ϸ����     3����Ϸ����    4���˳���Ϸ");
			int m = sc.nextInt();
			switch (m) {
			case 1:

				n = (int) (Math.random() * 100);
				System.out.println(n);

				System.out.print("�����" + min + "��" + max + " ��һ����" + times
						+ "�λ���,�úð���");

				for (int i = 1; i <= times; i++) {// �û�����ĸ���shuС��i����
					System.out.println("�������������");
					shu = sc.nextInt();

					if (shu == n) {

						System.out.println("��ϲ�㣬������" + i + "�ξͲ¶���");
						break;
					} else if (shu < n) {
						System.out.println("���ź�,���С�ˣ��㻹��" + (times - i)
								+ "�λ���,����");

					} else {
						System.out
								.println("���ź�����´��ˣ��㻹��" + (times - i) + "�λ���");
					}

				}
				long sendTime = System.currentTimeMillis();
				System.out.println("��ǰʱ�� :"
						+ sNowDate.format(new Date(sendTime)));// new
																// Date()Ϊ��ȡ��ǰϵͳʱ��

				// System.out.println("��ǰʱ�� :" +sNowDate);

				System.out.println("����ʱ�� :" + (sendTime - startTime) / 1000
						+ "��");

				break;
			case 2:
				System.out.println("��Ϸ����");
				System.out
						.println("����һ��������Ŀ���ǳ���,ϵͳ�������һ����������£�һ�ǿ�������2�ǿ�����˼ά�����Ͱ�");

				break;

			case 3:

				System.out.println("������������ֵ��ԭ���ֵ�ǣ�" + max);
				max = sc.nextInt();
				System.out.println("�����������Сֵ��ԭ��Сֵ�ǣ�" + min);
				min = sc.nextInt();

				System.out.println("��������Ĵ�����ԭ������" + times);
				times = sc.nextInt();

				break;

			case 4:

				System.out.println("��Ϸ�����ˣ���ӭ���´�������88");
				flag = false;
				break;

			}

		}
		//
		// //������
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
		// //�������һ����100���ڵ�����
		//
		// int number = (int)(Math.random()*100);
		//
		// System.out.println("\n***********������С��Ϸ����hold��ס��*********");
		//
		// System.out.println("\n  ********������ֲ������������㣡*********\n");
		//
		// System.out.println("\n  ***********�𰸣�"+number+"***************\n");
		//
		// System.out.println("�����Ƕ����Խ�����һ�°ɣ�С��ʾ������һ����1��100������");
		//
		// long sTartTime=System.currentTimeMillis();//����һ��ʱ�����
		//
		// for(int i=1;i<100;i++){
		//
		// System.out.println("���������"+i+"�εĲ²�");
		//
		// Cai calssOne;
		// result=Cai.guess(i);//ͨ���������뺯���õ�������
		//
		// //ͨ���Ƚ��������̨
		//
		// if(result>number)
		//
		// System.out.println("������˼�������µ����ִ����յ�����!");
		//
		// else if(result < number)
		//
		// System.out.println("������˼�������µ�����С���յ�����!");
		//
		// else {
		//
		// SimpleDateFormat sNowDate = new
		// SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//
		// long sEndTime=System.currentTimeMillis();
		//
		// System.out.println("\n  ***********��ȷ�𰸣�"+number+"***************\n");
		//
		// if(i==1){
		//
		// System.out.println("perfect!!��ϲ����һ�ξ���!!");
		//
		// }
		//
		// else if(i<10){
		//
		// System.out.println("good job! ���ܹ�����"+i+"��, ��Ҫ��������!!");
		//
		// }
		//
		// else{
		//
		// System.out.println("not bad! ���ܹ�����"+i+"��, ���ض���Զ����");
		//
		// }
		//
		// System.out.println("��ǰʱ�� :" +sNowDate.format(new Date(sEndTime)));//
		// new Date()Ϊ��ȡ��ǰϵͳʱ��
		//
		// //System.out.println("��ǰʱ�� :" +sNowDate);
		//
		// System.out.println("����ʱ�� :" +(sEndTime-sTartTime)/1000+"��");
		//
		// return;
		//
		// }
		//
		// }
		//
		// }
		//
		// //���뺯��
		//
		// public static int guess(int i){
		//
		// //ͨ������import java.util.Scanner���
		//
		// Scanner sc=new Scanner(System.in);
		//
		// int result;
		//
		// try{
		//
		// //ʹ�ڿ���̨��������ݱ���Ϊ����
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
		// System.out.println("��ݔ��Ĳ��ǔ���,�����������"+i+"������");
		//
		// //���ñ�������������
		//
		// guess(i);
		//
		// }
		//
		// return 0;

	}

}
