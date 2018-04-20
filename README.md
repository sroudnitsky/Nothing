# Nothing  

Team Nothing - Sean Roudnitsky, Ying Xin Jiang, Aidan Griffin  
  
# To-do List  
0. Fix submodule  (done)
1. Create interface deque (done)
2. Create class QQkachoo (done)
3. Implement Essential Methods(done):  
+size() -> done 
+addFirst(e) -> done
+addLast(e) -> done
+removeFirst() -> done  
+removeLast() -> done
+getFirst() -> done	
+getLast() -> done  
+contains(e) -> done  
+remove(e) -> done  

# Summary of Development Plan
size():  
  returns the number of elements in the Queue  
  
getFirst():  
  returns element at index 0 
  
getLast():  
  returns element at index size() - 1 
  
addFirst(e):  
  adds e to index 0 of the Queue
  
addLast(e):   
  adds e to index size() - 1 of the Queue  
 
removeFirst():  
  removes element at index 0   
  return removed element

removeLast():  
  removes element at index size() - 1  
  return removed element
  
contains(e):  
  returns whether the queue contains element e  
   
remove(e):  
  removes first occurrence of e if it exists
  returns boolean
