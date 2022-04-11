import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class TransactionIdStatus {
    public static void main(String[] args) {
        String username = "9801977841";
        String password = "999999";

        try{
            String cr = username + ":" + password;
            String base64Credentials = new String(Base64.getEncoder().encode(cr.getBytes(StandardCharsets.UTF_8)));
            String authorizationHeader = "Basic " + base64Credentials;


            CloseableHttpClient httpClient =  HttpClients.createDefault();
            HttpGet request = new HttpGet("https://web.cellpay.com.np/rest/payments/details/285/902955");
            request.addHeader("Authorization", authorizationHeader);
            request.addHeader("accept","application/json");


            CloseableHttpResponse response = httpClient.execute(request);

            System.out.println(response.getStatusLine());

           HttpEntity entity = response.getEntity();
           String result = EntityUtils.toString(entity);

            System.out.println(result);

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }




}
