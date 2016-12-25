import java.util.Scanner;

public class aa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int max=100;
         int min=1;
         int time=10;
         Scanner sc=new Scanner(System.in);
         boolean flag=true;
    
         while(flag){
        	 int a=(int) (Math.random()*(max-min)+min);
        	
        	 int x=sc.nextInt();
        	 int shu=sc.nextInt();
        	 switch (x) {
			case 1:
				 for(int i=1;i<=time;i++){
	        		 if(shu==a){
	        			 
	        			 
	        		 }
	        	 }
				break;

              case 2:
				
				break;

                  case 3:
	
	                      break;

                   case 4:
	
	                 break;

			default:
				break;
			}
        	
        	 
        	 
         }
		
	}
}
