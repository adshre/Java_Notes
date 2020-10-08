class CreateByRunnable implements Runnable
{
	public void run(){
			System.out.println("Thread is running");
		}
	public static void main(String args[]){
		CreateByRunnable runnable = new CreateByRunnable();
		Thread tr = new Thread(runnable);
		tr.start();
	}
}
