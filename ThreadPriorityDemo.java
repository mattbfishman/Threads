/*Matthew Fishman
 * This class makes and runs the threads.
 */
class A extends Thread {
	public void run() {
	 System.out.println("in side run A");
	 for(int i = 1; i <= 1000; i++) {
		 System.out.println("\t From ThreadA: i= " + i);
	 }
	 System.out.println("Exit from A");
 }
}
class B extends Thread {
	public void run() {
		System.out.println("in side run B");
	 
		for(int j = 1; j <= 1000; j++) {
			System.out.println("\t From ThreadB: j= " + j);
		}
		System.out.println("Exit from B");
 }
}
class C extends Thread {
 public void run() {
	 System.out.println("in side run C");
	 for(int k = 1; k <= 1000; k++) {
		 System.out.println("\t From ThreadC: k= " + k);
	 }
	 System.out.println("Exit from C");
 }
}
class D extends Thread {
	public void run() {
	 System.out.println("in side run D");
	 for(int l = 1; l <= 1000; l++) {
		 System.out.println("\t From ThreadD: l= " + l);
	 }
	 System.out.println("Exit from D");
 }
}
class E extends Thread {
	public void run() {
		System.out.println("in side run E");
	 
		for(int m = 1; m <= 1000; m++) {
			System.out.println("\t From ThreadE: m= " + m);
		}
		System.out.println("Exit from E");
 }
}
class F extends Thread {
 public void run() {
	 System.out.println("in side run F");
	 for(int n = 1; n <= 1000; n++) {
		 System.out.println("\t From ThreadF: n= " + n);
	 }
	 System.out.println("Exit from F");
 }
}



public class ThreadPriorityDemo {
	public static void main(String args[]) {
		A threadA = new A();
		B threadB = new B();
		C threadC = new C();
		
		threadC.setPriority(Thread.MAX_PRIORITY);
		threadA.setPriority(Thread.MIN_PRIORITY);
		threadB.setPriority(threadA.getPriority() + 1);
		
		System.out.println("call Thread start A");
		threadA.start();

		System.out.println("call Thread start B");
		threadB.start();
 
		System.out.println("call Thread start C");
		threadC.start();
 
		System.out.println("End of main thread");
		
		D threadD = new D();
		E threadE = new E();
		F threadF = new F();
		
		threadD.setPriority(Thread.MAX_PRIORITY - 1);
		threadE.setPriority(Thread.MIN_PRIORITY );
		threadF.setPriority(threadA.getPriority() + 3);
		
		System.out.println("call Thread start D");
		threadD.start();

		System.out.println("call Thread start E");
		threadE.start();
 
		System.out.println("call Thread start F");
		threadF.start();
 
		System.out.println("End of main thread");
 }
}