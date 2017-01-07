/*Matthew Fishman
 * This class is the main driver
 */
public class MessageSystem {
	public static void main(String[] args) {
		MessageQueue queue = new MessageQueue(5);
		new Apple(queue).start();
		new Orange(queue).start();
		new Grape(queue).start();
		new Watermelon(queue).start();
		new Customer(queue).start();
		new Customer(queue).start();
		new Customer(queue).start();
	}
} // end MessageSystem class