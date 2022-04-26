import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;

public class CheckCounter {
    public static void main(String[] args) {

        try{
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpPost request = new HttpPost("https://billpaytest.f1soft.com.np/kathmandu/khanepani/counters");
            request.addHeader("Content-Type", "application/json");

            JSONObject post_data = new JSONObject();

            post_data.put("clientusername","f1soft");
            post_data.put("password","0dd565b1830c9f94da1443d678caf506");
            post_data.put("channel","eSewa");


            request.setEntity(new StringEntity(post_data.toString()));
            CloseableHttpResponse response = httpClient.execute(request);
            HttpEntity entity = response.getEntity();
            String output = EntityUtils.toString(entity);

            Gson gson = new Gson();

            CounterResponse counterResponse = gson.fromJson(output,CounterResponse.class);

            System.out.println(counterResponse.getCounters().getName());


        }
        catch (Exception e){
            e.printStackTrace();
        }









    }
}
