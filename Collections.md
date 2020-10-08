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
