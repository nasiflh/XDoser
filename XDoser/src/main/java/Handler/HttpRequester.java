package Handler;

import okhttp3.*;

import java.io.IOException;

public class HttpRequester {

    private final OkHttpClient client = new OkHttpClient();

    public void run(String courseName) throws Exception {
        OkHttpClient client = new OkHttpClient();

        RequestBody formBody = new FormBody.Builder()
                .add("username", courseName)
                .build();
        Request request = new Request.Builder()
                .url("http://localhost:8444/course")
                .post(formBody)
                .build();

        try {
            Response response = client.newCall(request).execute();
            System.out.println(response.body().string());
            // Do something with the response.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
