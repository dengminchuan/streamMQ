# streamMQ
使用java研发的高并发消息队列
### 队列的选择 ###
LinkedBlockingQueue, ArrayBlockingQueue和Concur
rentLinkedQueue，第一个为基于可重入锁的链表实现，第二个为
前者的队列实现，第三个采用CAS(乐观锁)实现。由于消息队
列设计上需要面对高并发，不建议采用CAS实现，同时不应该
给消息队列的长度设限制，因为实践中，消息队列是可以持久化的，同时消息满时也会阻塞将消息放入queue的线程 ，因此采用LinkedBlockingQueue
作为queue的核心实现。
