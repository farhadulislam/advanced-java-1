public class Worker {
    private int count = 0;

    public void main() {
      System.out.println();

    }

    public void stageOne(){
        try {
            Thread.sleep(1);
        } catch (Exception e) {
            //TODO: handle exception
        }

       new Thread(new Runnable(){
           public void run(){
                for (int i = 0; i < 100; i++) {
                    count++;
                }

           }

       });
    }
       
    public void stageTwo() {
        try {
            Thread.sleep(1);
        } catch (Exception e) {
            //TODO: handle exception
        }

        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    count++;
                }

            }

        });

        
     
    }

    

}