public class DequeTester{
    public static void main(String[] args){
	QQKachoo<String> rohan = new QQKachoo<>();
	rohan.addFirst("cat");
	rohan.addFirst("dog");
	rohan.addLast("duck");
	rohan.addLast("cow");

	System.out.println("current Deque: " + rohan);
	System.out.println("Expected Value: 4");
	System.out.println(rohan.size());

	System.out.println("remove first (dog): " + rohan.removeFirst());
	System.out.println("remove last (cow): " +rohan.removeLast());

	
	System.out.println("current Deque: " + rohan);
       	System.out.println("Expected: 2");
	System.out.println(rohan.size());

	System.out.println("getFirst: cat");
	System.out.println(rohan.getFirst());

	System.out.println("getLast: duck");
	System.out.println(rohan.getLast());

	System.out.println("Contains: false");
	System.out.println(rohan.contains("dog"));

	

	
    }


}
