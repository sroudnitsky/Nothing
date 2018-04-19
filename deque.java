public interface deque<Card>{
    //returns size
    public int size();
    
    //returns _head element
    public Card peekFirst();

    //returns _tail element
    public Card peekLast();

    //adds e to _head and reassigns it
    public void addFirst(Card e);

    //adds e to _tail and reassigns it
    public void addLast(Card e);

    //removes element at _head and returns the removed element
    public Card removeFirst();

    //removes element at _tail and returns the removed element
    public Card removeLast();

    //checks if queue contains element e
    public boolean contains(Card e);
    //removes the first occurrence of e and returns whether the element has been removed or not
    public boolean remove(Card e);

}
