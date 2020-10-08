class ThreadNaming extends Thread {  

	ThreadNaming(String name){
		super(name);
	}

    public void run() {  
        System.out.println("Running thread name is:" + Thread.currentThread().getName());  
    }  

    public static void main(String args[]) {  
        ThreadNaming m1 = new ThreadNaming("First Thread");  
        ThreadNaming m2 = new ThreadNaming("Second Thread");  

        //Naming via setName Method
        // m1.setName("Thread A");
        // m2.setName("Thread B");

        m1.start();  
        m2.start();  
    }  
}     
