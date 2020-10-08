## Collection Framework
<img src="https://github.com/adshre/Java_Notes/blob/main/blob/java-collection-hierarchy.png" width="400" height="256" title="Collection Logo">

The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects into single unit.\
A framework is a set of classes and interfaces which provide a ready-made architecture.

1. Iterable Interface :
    1. Root Interface
    2. provides Iteration functionality for elements in collection, for- each loop
    3. returns Iterator.iterator()
2. Collection Interface : 
    1. Extends Iterable Interface
    2. Provides all general purpose methods which all collections classes must support (or throw UnsupportedOperationException)
3. List Interface :
    1. Represents Ordered Collection of elements
    2. Allows duplicate elements
    2. Implemeted by ArrayList, LinkedList, Vector
4. Queue Interface : 
    1. Maintains FIFO order
    2. Implemented by PriorityQueue, Deque
5. Set Interface : 
    1. Unordered(sorted) collection of elements
    2. No duplicates allowed
    3. Implemented by HashSet, LinkedHashSet
# ArrayList
1. Implements List Interface
2. Provides us with dynamic arrays in Java
3. ArrayList cannot be usedfor primitive types like int, char, etc. Needs Objects
4. Is not Synchronized by default.
5. Internally implemented :
    1. Creates a bigger sized memory on heap memory (for example memory of double size).
    2. Copies the current memory elements to the new memory.
    3. New item is added now as there is bigger memory available now.
    4. Delete the old memory.
