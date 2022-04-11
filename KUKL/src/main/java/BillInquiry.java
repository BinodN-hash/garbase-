import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;

public class BillInquiry {
    public static void main(String[] args) {

        try{
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpPost inquiry = new HttpPost("http://billpaytest.f1soft.com.np/kathmandu/khanepani/billInquiry");

            inquiry.addHeader("Content-Type","application/json");

            JSONObject inquiry_data = new JSONObject();

            inquiry_data.put("requestid","F1S0FT");
            inquiry_data.put("agenttransid","001");
            inquiry_data.put("clientusername","f1soft");
            inquiry_data.put("password","0dd565b1830c9f94da1443d678caf506");
            inquiry_data.put("customercode","6688");
            inquiry_data.put("counter","47:1114");
            inquiry_data.put("type","kukl Payment");


            inquiry.setEntity(new StringEntity(inquiry_data.toString()));
            CloseableHttpResponse response = httpClient.execute(inquiry);

            HttpEntity entity = response.getEntity();
            String result = EntityUtils.toString(entity);

            Gson gson = new Gson();

            InquiryResponse inquiryResponse = gson.fromJson(result,InquiryResponse.class);



            System.out.println("requestId:" +inquiryResponse.getData().getRequestId());
            System.out.println("BillMonth:" +inquiryResponse.getData().getBillMonth());
            System.out.println("Address:"+inquiryResponse.getData().getAddress());
            System.out.println("AreaNumber:" +inquiryResponse.getData().getAreaNumber());
            System.out.println("Penalty:" +inquiryResponse.getData().getPenalty());
            System.out.println("CustomerName:" +inquiryResponse.getData().getCustomerName());
            System.out.println("Amount:" +inquiryResponse.getData().getAmount());
            System.out.println("CustomerCOde:" +inquiryResponse.getData().getCustomerCode());
            System.out.println("CustomerNo:" +inquiryResponse.getData().getCustomerNo());

        }
        catch (Exception e){
            e.printStackTrace();
        }





    }
}
