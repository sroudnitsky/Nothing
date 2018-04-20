# Nothing  

Team Nothing - Sean Roudnitsky, Ying Xin Jiang, Aidan Griffin  
  
# To-do List  
0. Fix submodule  (done)
1. Create interface deque (done)
2. Create class QQkachoo (done)
3. Implement Essential Methods:  
+size()  
+addFirst(e)  
+addLast(e)  
+removeFirst()  
+removeLast()
+getFirst()	
+getLast()  
+contains(e)  
+remove(e)  

# Summary of Development Plan
size():  
  returns _size attribute  
  
getFirst():  
  returns _head element  
  
getLast():  
  returns _tail element  
  
addFirst(e):  
  adds e to the head and reassign _head  
  
addLast(e):   
  adds e to the tail and reassign _tail  
 
removeFirst():  
  removes element at _head   
  return removed element

removeLast():  
  removes element at _tail  
  return removed element
  
contains(e):  
  checks if queue conatains element e  
  returns boolean
   
remove(e):  
  removes first occurance of e  
  returns boolean
