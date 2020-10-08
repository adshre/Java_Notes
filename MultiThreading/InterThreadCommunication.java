public class InterThreadCommunication{

	//This main class will act as  Thread A
	public static void main(String args[]) throws InterruptedException{

		ThreadB t2 = new ThreadB();
		t2.start();
		synchronized(t2){
			System.out.println("Thread A calling wait method");
			t2.wait();
			System.out.println("Resumed Thread A on notify call");

			System.out.println("Final Amount = " + t2.balance);
		}

	}
}

class ThreadB extends Thread{

	int balance = 0;
	public void run(){

		synchronized(this){
			System.out.println("Thread B running and calculating amount");

			for(int i=0; i<10; i++){
				balance = balance + i;
			}

			System.out.println("Thread B gives notiication call");
			this.notify();

		}
	}
}
