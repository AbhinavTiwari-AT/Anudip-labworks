package threadmodule38;

public class EvenAndOdd implements Runnable {
	
	    private final int limit;
	    private final boolean isEven;
	    private static volatile int number =1;
	    private static final Object lock = new Object();

	    public EvenAndOdd(int limit, boolean isEven) {
	        this.limit = limit;
	        this.isEven = isEven;
	    }

	    @Override
	    public void run() {
	        while (number<=limit){
	            if(isEven && number %2==0 || (!isEven && number%2 !=0)){
	                synchronized (lock){
	                    System.out.println(Thread.currentThread().getName()+":"+number);
	                    number++;
	                    lock.notify();// notify other thread are waiting on lock
	                }
	            }else {
	                synchronized (lock){
	                    try {
	                        lock.wait();//wait for other thread to notify
	                    } catch (InterruptedException e) {
	                     e.printStackTrace();
	                    }
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int limit=20;
	        Thread evenThread = new Thread(new EvenAndOdd(limit,true),"Even Thread");
	        Thread oddThread= new Thread(new EvenAndOdd(limit,false),"odd thread");
	        evenThread.start();
	        oddThread.start();
	    }

	}

/*   output:-
 odd thread:11
Even Thread:12
odd thread:13
Even Thread:14
odd thread:15
Even Thread:16
odd thread:17
Even Thread:18
odd thread:19
Even Thread:20

*/