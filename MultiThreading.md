## Multi Threading: 
concurrent execution of two or more parts of a program for maximum utilization of CPU. 

# Process Vs Thread 
| Process        | Thread      |
| :------------- | :----------: |
|  Program in execution/ task | Subset/ segment of process in execution| 
| Heavy Weight  | Light- weight Process|
| Always stroed in main memory and has own address, stack space | Shares resources and memory allocated to the process by kernel|
| More time for creation, termination, context switching | less time|

# Lifecycle and state of Thread
A thread lies only in one of the shown states at any instant:
* New
* Runnable
* Blocked
* Waiting
* Time Waiting
* Terminated

1. New : When new thread is created but not yet started to run. 
2. Runnable : When thread is ready to run or running, scheduler's responsibility to give thread time to run.
3. Blocked/Waiting :
    1. When thread is temporarily inactive
    2. Any thread in these states does not consume any CPU cycle.
    3. Blocked => Cause : Waiting for I/O to finish, accessing protected section of code that is currently locked by some other thread.
    4. Waiting => wait for other thread on condition.
4. Time Waiting : Thread lies in timed waiting state when it calls a method with a time out parameter. A thread lies in this state until the timeout is completed or until a notification is received.
5. Terminated : A thread is in terminated or dead state when its run() method exits.

# Thread Creation
* Extending thread class
* Implementing Runnable Interface
    * Thread Class vs Runnable Interface
        1. Extend Thread class than no other class can be extended as no multiple inheritence supported
        2. But possible with implementing Runnable
        3. Thread has more method including yield() , Runnable has sibgle abstract method run()
 
# Interthread Communication

Polling : Testing a condition repeatedly until it becomes true, wasting CPU cycle\
Multi Threading tackels this problem.\
Inter-thread communication is a mechanism in which a thread is paused running in its critical section and another thread is allowed to enter (or lock) in the same critical section to be executed. It is implemented by following methods of Object class:
* wait() : It tells the calling thread to give up the lock and go to sleep until some other thread enters the same monitor and calls notify().
* notify() : It wakes up one single thread that called wait() on the same object. It should be noted that calling notify() does not actually give up a lock on a resource.
* notifyAll() : It wakes up all the threads that called wait() on the same object
