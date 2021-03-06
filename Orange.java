/*Matthew Fishman
 * This class produces oranges and add them to the thread
 */

public class Orange extends Thread{
	private static int count = 0;
	private MessageQueue queue = null;
	public Orange(MessageQueue queue){
		this.queue = queue;
	}
	public void run(){
		for(int i=0;i<10;i++){
			queue.put(generateMessage());
		}
	}
	private synchronized String generateMessage(){
		String msg = "Orange #"+count;
		count ++;

		return msg;
	}
} //end Producer class