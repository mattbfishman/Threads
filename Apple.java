/*Matthew Fishman
 * This class produces apples and addds them to the thread
 */

public class Apple extends Thread{
	private static int count = 0;
	private MessageQueue queue = null;
	public Apple(MessageQueue queue){
		this.queue = queue;
	}
	public void run(){
		for(int i=0;i<10;i++){
			queue.put(generateMessage());
		}
	}
	private synchronized String generateMessage(){
		String msg = "Apple #"+count;
		count ++;

		return msg;
	}
} //end Producer class