package threadmodule38;


	
	import java.util.ArrayList;
	import java.util.List;

	class PrimeNumberCalculator implements Runnable {
	    private final int start;
	    private final int end;
	    private final List<Integer> primes;

	    public PrimeNumberCalculator(int start, int end, List<Integer> primes) {
	        this.start = start;
	        this.end = end;
	        this.primes = primes;
	    }

	    @Override
	    public void run() {
	        for (int number = start; number <= end; number++) {
	            if (isPrime(number)) {
	                synchronized (primes) {
	                    primes.add(number);
	                }
	            }
	        }
	    }

	    private boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) throws InterruptedException {
	        int limit = 50;
	        List<Integer> primes = new ArrayList<>();
	        List<Thread> threads = new ArrayList<>();

	        // Create 5 threads to calculate prime numbers
	        for (int i = 0; i < 5; i++) {
	            int start = 1 + (i * (limit / 5));
	            int end = (i + 1) * (limit / 5);
	            Thread thread = new Thread(new PrimeNumberCalculator(start, end, primes));
	            threads.add(thread);
	            thread.start();
	        }

	        // Wait for all threads to finish
	        for (Thread thread : threads) {
	            thread.join();
	        }

	        // Calculate sum of all prime numbers found
	        int sum = primes.stream().mapToInt(Integer::intValue).sum();
	        System.out.println("Sum of all prime numbers up to " + limit + " is: " + sum);
	    }
	}

