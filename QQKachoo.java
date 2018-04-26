import java.util.ArrayList;

public class QQKachoo<Card> implements deque<Card>{
    
    private ArrayList<Card> _Deque;
    
//constructor
    public QQKachoo(){
	_Deque = new ArrayList<Card>();
    }
    
//adds new element at head
    public void addFirst(Card x){
	_Deque.add(0,x);
    }//O(n)
    
//adds new element at tail
    public void addLast(Card x){
	_Deque.add(x);
    }//O(1)
    
//remove 1st element
    public Card removeFirst(){
	return _Deque.remove(0);
    }//O(n)
    
//remove last element
    public Card removeLast(){
	return _Deque.remove(_Deque.size() - 1);
    }//O(1)
    
//return 1st element
    public Card getFirst(){
	return _Deque.get(0);
    }//O(1)
    
//return last element
public Card getLast(){
	return _Deque.get(_Deque.size() - 1);
    }//O(1)

//return size of linked list
    public int size(){
	return _Deque.size();
    }//O(1)

//check whether the list has a certain element
    public boolean contains(Card e){
	for (int i = 0; i < _Deque.size(); i++){
	    if (_Deque.get(i).equals(e)){
		return true;
	    }
	}
	return false;
    }//O(n)

//remove 1st occurance of a certain element
    public boolean remove(Card e){
	int counter = 0;
	for (int i = 0; i < _Deque.size(); i++){
	    if (_Deque.get(i).equals(e) && counter == 0){
		_Deque.remove(i);
		counter++;
		return true;
	    }
	}
	return false;
    }//Amortized run time: O(n) in best case, O(n^2) in worst case

    public String toString(){
	String retStr = "[";
	for (int i = 0; i < _Deque.size(); i++){
	    retStr += _Deque.get(i);
	    if (i != _Deque.size() - 1){
		retStr += ", ";
	    }
	}
	retStr += "]";
	return retStr;
    }
    public static void main(String[] args){
	QQKachoo SYXA = new QQKachoo();
	System.out.println(SYXA.size());//0
	SYXA.addFirst("Sean");
	System.out.println(SYXA);//[Sean]
	System.out.println(SYXA.size());//1
	SYXA.addFirst("Yin Xing");
	System.out.println(SYXA);//[Yin Xing, Sean]
	System.out.println(SYXA.size());//2
	SYXA.addLast("Aidan");
	System.out.println(SYXA);//[Yin Xing, Sean, Aidan]
	System.out.println(SYXA.size());//3
	SYXA.addLast("Griffin");
	System.out.println(SYXA);//[Yin Xing, Sean, Aidan, Griffin]
	System.out.println(SYXA.size());//4
	SYXA.addFirst("Jiang");
	System.out.println(SYXA);//[Jiang, Yin Xing, Sean, Aidan, Griffin]
	System.out.println(SYXA.size());//5
	SYXA.addLast("Roudnitsky");
	System.out.println(SYXA);//[Jiang, Yin Xing, Sean, Aidan, Griffin, Roudnitsky]
	System.out.println(SYXA.size());//6
	System.out.println(SYXA.contains("Griffin"));//true
	System.out.println(SYXA.contains("Sea"));//false
	System.out.println(SYXA.removeFirst());//Jiang
	System.out.println(SYXA);//[Yin Xing, Sean, Aidan, Griffin, Roudnitsky]
	System.out.println(SYXA.size());//5
	System.out.println(SYXA.removeLast());//Roudnitsky
	System.out.println(SYXA);//[Yin Xing, Sean, Aidan, Griffin]
	System.out.println(SYXA.size());//4
	System.out.println(SYXA.removeLast());//Griffin
	System.out.println(SYXA);//[Yin Xing, Sean, Aidan]
	System.out.println(SYXA.size());//3
	System.out.println(SYXA.remove("Aidan"));//true
	System.out.println(SYXA);//[Yin Xing, Sean]
	System.out.println(SYXA.size());//2
	System.out.println(SYXA.remove("Roudnitsky"));//false
	System.out.println(SYXA);//[Yin Xing, Sean] 
	System.out.println(SYXA.size());//2
	System.out.println(SYXA.removeFirst());//Yin Xing
	System.out.println(SYXA);//[Sean]
	System.out.println(SYXA.size());//1
	System.out.println(SYXA.removeLast());//Sean
	System.out.println(SYXA);//[]
	System.out.println(SYXA.size());//0
    }
}
