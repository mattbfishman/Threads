/*Matthew Fishman
 * This class produces watermelons and add them to the thread
 */

public class Watermelon extends Thread{
	private static int count = 0;
	private MessageQueue queue = null;
	public Watermelon(MessageQueue queue){
		this.queue = queue;
	}
	public void run(){
		for(int i=0;i<10;i++){
			queue.put(generateMessage());
		}
	}
	private synchronized String generateMessage(){
		String msg = "Watermelon #"+count;
		count ++;

		return msg;
	}
} //end Producer class