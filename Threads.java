// THREADS IMPLEMENTATION USING THREAD CLASS

// public class Threads extends Thread {
//     public static void main(String[] args) {
//         Threads thread = new Threads();
//         thread.start();
//         System.out.println("This code is outside the thread");
//         }
//         public void run(){
//             System.out.println("This code is running inside the thread");
//     }
// }

// THREADS IMPLEMENTATION USING RUNNABLE INTERFACE
public class Threads implements Runnable{
    public static void main(String[] args) {
        
        Threads obj = new Threads();
        Thread thread = new Thread(obj);

        thread.start();
        System.out.println("this code is running outside the thread");

       
    }
     public void run(){
        System.out.println("This code is running inside thread");        
    }
}