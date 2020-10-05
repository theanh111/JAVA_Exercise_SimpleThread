public class NumberGenerator implements Runnable {
    private String name;

    public NumberGenerator(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Thread thread = new Thread();
        System.out.println(name + " hashcode is: " + thread.hashCode());
        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println(name + " : " + i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
