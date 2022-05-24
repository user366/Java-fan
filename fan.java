class fanChain {
    private int velocity;
    public fanChain() {
        velocity  = 0;
    }
    public void pull() {
        if (velocity == 0) {
            velocity = 1;
            System.out.println("speed 1");
        } else if (velocity== 1) {
            velocity= 2;
            System.out.println("speed2");
        } else if (velocity== 2) {
            velocity = 3;
            System.out.println("speed3");
        } else {
            velocity= 0;
            System.out.println("turning off");
        }
    }
}
public class operatingFan{
    public static void main(String[] args) {
        fanChain chain = new fanChain();
        while (true) {
            System.out.print("Press ENTER");
            getLine();
            chain.pull();
        }
    }
    static String getLine() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return line;
    }
}
