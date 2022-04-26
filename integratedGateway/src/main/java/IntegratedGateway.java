import model.ApiResponse;
import model.BankList;
import service.APiHelper;

public class IntegratedGateway {

    public static void main(String[] args) {

        ApiResponse output = APiHelper.execute();
        ApiResponse response = APiHelper.getBankList(output.getAccessToken());

        for(BankList b: response.getPayload().getBankLists()){
            System.out.println("id:"+ b.getId());
            System.out.println("cellpayCode:"+ b.getCellpayCode());
            System.out.println("bankType:"+ b.getBankType());
            System.out.println("operatorsBankCode:"+ b.getOperatorsBankCode());
            System.out.println("bankCode:"+ b.getBankCode());
            System.out.println("bankName:"+ b.getBankName());
            System.out.println("imageUrl:"+ b.getImageUrl());
            System.out.println("status:"+ b.getStatus());
            System.out.println("provider:"+ b.getProvider());




        }

    }

}
