import java.util.ArrayList;

public class QQKachoo<Card> implements deque<Card>{

    private ArrayList<Card> _Deque;

    public QQKachoo(){
	_Deque = new ArrayList<Card>();
    }

    public void addFirst(Card x){
	_Deque.add(0,x);
    }

    public void addLast(Card x){
	_Deque.add(x);
    }

    public Card removeFirst(){
	return _Deque.remove(0);
    }

    public Card removeLast(){
	return _Deque.remove(_Deque.size() - 1);
    }

    public Card getFirst(){
	return _Deque.get(0);
    }

    public Card getLast(){
	return _Deque.get(_Deque.size() - 1);
    }
}