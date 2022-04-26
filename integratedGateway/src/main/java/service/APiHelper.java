package service;

import com.google.gson.Gson;
import model.ApiResponse;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.List;

public class APiHelper {

    private static final String BASE_URL = "https://clientapi.cellpay.com.np/rest/";
    private static final String USERNAME = "cellpay";
    private static final String PASSWORD = "1234";

    private APiHelper() {

    }

    public static ApiResponse execute(){
        ApiResponse output = null;

        CloseableHttpResponse response =null;
        HttpPost post = null;

        try (CloseableHttpClient httpClient = HttpClients.createDefault();) {
            post = new HttpPost(BASE_URL + "access/login");
            List<NameValuePair> data = new ArrayList<>();

            data.add(new BasicNameValuePair("username",USERNAME));
            data.add(new BasicNameValuePair("password",PASSWORD));


            post.setEntity(new UrlEncodedFormEntity(data));
            response = httpClient.execute(post);

            HttpEntity entity = response.getEntity();
            String result = EntityUtils.toString(entity);

            Gson gson = new Gson();
             output = gson.fromJson(result,ApiResponse .class);



        }
        catch (Exception e){
            e.printStackTrace();
        }

        return output;
    }

    public static ApiResponse getBankList(String accessToken){
        ApiResponse output = null;


        CloseableHttpResponse response =null;
        HttpGet get = null;

        try (CloseableHttpClient httpClient = HttpClients.createDefault();) {
            get = new HttpGet(BASE_URL + "getBankList");
            get.addHeader("ACCESS-TOKEN",accessToken);
            response = httpClient.execute(get);

            HttpEntity entity = response.getEntity();
            String result = EntityUtils.toString(entity);

            Gson gson = new Gson();
            output = gson.fromJson(result,ApiResponse.class);



        }
        catch (Exception e){
            e.printStackTrace();
        }

        return  output;
    }
}
