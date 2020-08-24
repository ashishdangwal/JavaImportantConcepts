class TestMultiTasking1 extends Thread{
    public void run(){
        System.out.println("task one");
    }
    public static void main(String args[]){
        TestMultiTasking1 t1=new TestMultiTasking1();
        TestMultiTasking1 t2=new TestMultiTasking1();
        TestMultiTasking1 t3=new TestMultiTasking1();

        t1.start();
        t2.start();
        t3.start();
    }
}