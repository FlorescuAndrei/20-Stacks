# 20-Stacks
Stacks implementation with Array, Stacks implementation with LinkedList.  

Stacks  
  -  Abstract data type   
  -  LIFO   
  -  push – add item  
  -  pop – removes the top item  
  -  peek – gets the top item  
  -  Ideal backing data structure: linked list O(1).  

Array can be good for backing the stack only if you know the maximum number of items that will ever be on the stack O(1).  
Otherwise if the array have to be resize then we have O(n). 

All the stack do is to limit the operation you can do on whatever data structure is being use to implement the stack.  

In this project are two classes
  -  ArrayStack.java class create a stack backup by un array.  
  -  LinkedStack.java class tack a JDK LinkedList and keeps only the methods that are specific for the stack push, pop, peek. So the class will behave like a stack.  
  
  
  
  
  
 [BACK TO START PAGE](https://github.com/FlorescuAndrei/Start.git)
