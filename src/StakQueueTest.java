
public class StakQueueTest {

	public static void main(String[] args) {
StackInt test= new StackInt();
test.push(2);
test.push(4);
test.push(6);
test.push(8);
test.push(10);
System.out.println(test.getSize());
System.out.println(test.pop());
System.out.println(test.peek());
System.out.println(test.getSize());
System.out.println(test.contains(6));
System.out.println(test.contains(3));
QueueInt test2= new QueueInt();
test2.push(2);
test2.push(4);
test2.push(6);
test2.push(8);
test2.push(10);
System.out.println(test2.getSize());
System.out.println(test2.pop());
System.out.println(test2.peek());
System.out.println(test2.getSize());
System.out.println(test2.contains(6));
System.out.println(test2.contains(3));

	}

}
