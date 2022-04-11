import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class GenerateToken {

    public static void main(String[] args) {

         String username = "9860876238";
         String password = "123456";

        try{
            String plainCredientials = username + ":" + password;
            String base64Credentials = new String(Base64.getEncoder().encode(plainCredientials.getBytes(StandardCharsets.UTF_8)));
            String authorizationHeader = "Basic " + base64Credentials;


            CloseableHttpClient httpClient =  HttpClients.createDefault();
            HttpPost request = new HttpPost("https://test.cellpay.com.np/rest/access/login");
            request.addHeader("Authorization", authorizationHeader);
            request.addHeader("Content-Type","application/json");

            JSONObject json = new JSONObject();

            json.put("authType","ACCESS_TOKEN");

            request.setEntity(new StringEntity(json.toString()));
            CloseableHttpResponse response = httpClient.execute(request);
            HttpEntity entity = response.getEntity();

            String resutl = EntityUtils.toString(entity);
            System.out.println(resutl);





        }

        catch (Exception e){
            e.printStackTrace();
        }






    }
}
