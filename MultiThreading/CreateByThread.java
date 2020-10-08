class CreateByThread extends Thread
{
	public void run(){
			System.out.println("Thread is running");
		}
	public static void main(String args[]){
		CreateByThread tr = new CreateByThread();
		tr.start();
	}
}

