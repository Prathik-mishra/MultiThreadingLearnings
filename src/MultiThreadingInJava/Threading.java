package MultiThreadingInJava;

//way 1 by extending thread class
class MyThread extends Thread{

    public void run(){ //run method acts like a main method

        while(true){
            System.out.println("Inside the Thread class 1");
        }


        /*
        while(true){
            try{
                System.out.println("The thread will sleep for 7 seconds now");
                Thread.sleep(7000);
                System.out.println("Thread woke up");

            }catch (Exception e){
                throw new RuntimeException(e);
            }
            System.out.println("Doing its tasks");
        }
         */
    }
}

class MyThread2 implements Runnable{
    @Override
    public void run() {

        while(true){
            System.out.println("Inside the Thread class 2");
        }
    }
}
public class Threading {
    public static void main(String[] args) {
        //Thread starts from here

        MyThread myThread = new MyThread();
        myThread.start();
        myThread.setPriority(10);

        Thread myThread2 = new Thread(new MyThread2());
        myThread2.start();

        while(true){
            System.out.println("inside the main class");
        }

    }
}


/*
Notes :-

Features / usecase
it is used in priority

0 --------------------------------------- 7 -------------------------------------- 14
(highest priority) <<<<<<<<<<<<<<<<< (default priority) >>>>>>>>>>>>>>>>>>> (lowest priority)


 */