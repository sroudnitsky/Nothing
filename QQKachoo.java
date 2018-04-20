public class QQKachoo<Card> implements deque<Card>{

    private DLLNode<Card> _head;
    private DLLNode<Card> _tail;
    private int _size;
    public QQKachoo(){
	_Deque = new DLLNode<Card>();
	_size = 0;
    }

    public int size() {
	return _size;
    }

    public void addFirst(Card x){
	_head = new DLLNode<Card>(x, null, _head);
    }

    public void addLast(Card x){
	_tail = new DLLNode<Card>(x, null, _tail);
    }

    public Card removeFirst(){
	Card temp = _head.getCargo();
	_head = _head.getNext();
	return temp;
    }

    public Card removeLast(){
	Card temp = _tail.getCargo();
	_tail = _tail.getNext();
	return temp;
    }

    public Card getFirst(){
	return _Deque.get(0);
    }

    public Card getLast(){
	return _Deque.get(_Deque.size() - 1);
    }
}
