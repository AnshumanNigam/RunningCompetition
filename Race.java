public class Race
{
    public static void main(String [] args)
    {
        runner Runner= new runner();

        Thread thread1= new Thread(Runner,"Runner1");
        Thread thread2=new Thread(Runner,"Runner2");
        Thread thread3=new Thread(Runner,"Runner3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
class runner implements Runnable
{
  private int goal=100;
  private int min=2;
  private int max=17;

  public void run()
  {
      int i=0;

      while(i<=goal)
      {
          System.out.println("Currently the runner winning is---> "+Thread.currentThread().getName());
          try {
              Thread.sleep(1000);
          }catch(InterruptedException e)
          {
              e.printStackTrace();
          }
          int random = (int)Math.floor(Math.random()*(max-min+1)+min);
          i=i+random;
          //System.out.println(random);
          if(i>=goal)
          {
              System.out.println(Thread.currentThread().getName()+" Wins the Race!!!");
              break;
          }

      }
  }

}
