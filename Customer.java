/*Matthew Fishman
 * This class makes customers or "consumers"
*/

public class Customer extends Thread {
	private MessageQueue queue = null;
	public Customer(MessageQueue queue){
		this.queue = queue;
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Customer buys " +queue.get()+ " from the queue.");
		}
	}
} //end Consumer class