public class Threading {

public static void main(String[] args) {

System.out.println("start chatting!!!");

Sender send = new Sender();

ThreadedSend S1 = new ThreadedSend(" Hi ", send);

ThreadedSend S2 = new ThreadedSend(" Bye ", send);

// Start two threads of ThreadedSend type
S1.start();
S2.start();

// wait for threads to end
try {
S1.join(); //
S2.join(); //
} catch (Exception e) {
System.out.println("Interrupted");
}

System.out.println("Done chatting!!!");
}

}

class Sender {

public synchronized void send(String msg) {
System.out.println("Sending\t" + msg);
try {
Thread.sleep(1000); // 1 sec
} catch (Exception e) {
System.out.println("Thread interrupted.");
}
System.out.println("\n" + msg + "Sent");
}

}

// Class for send a message using Threads
class ThreadedSend extends Thread {
private String msg;
Sender sender;

// Receives a message object and a string
// message to be sent
ThreadedSend(String m, Sender obj) {
msg = m;
sender = obj;
}

public void run() {
// Only one thread can send a message
// at a time.
// synchronized (sender) {
// synchronizing the send object
sender.send(msg);
// }

}
}


/* 1. context switching - is bad
2. Thread starvation -

3. Thread priority - weightage given to a thread..
1 to 10 = Thread priorit range ( 10 is highest)
5 - default thread priority

4. shychronization
shyncronization / synchronized
method /block
5. Critical section -

6. monitor / lock -

7. deadlock

Thread Dump

8. Race condition -

*/