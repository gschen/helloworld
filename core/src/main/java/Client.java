import sun.net.www.http.HttpClient;

/**
 * Created by apple on 2/20/14.
 */
public class Client {
    public static void main(String[] args) {
//        System.out.println("hello,world");

        HelloWorld hw = new HelloWorld("gschen"){
            private String password;

            @Override
            public void run() {
                System.out.println("this is next::run()");
            }
        };

        hw.run();

    }
}
