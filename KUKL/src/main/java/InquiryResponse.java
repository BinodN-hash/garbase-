public class InquiryResponse {

    private  Inquiry data;
    private String resultCode;
    private String resultDescription;

    public String getResultDescription() {
        return resultDescription;
    }

    public void setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public Inquiry getData() {
        return data;
    }

    public void setData(Inquiry data) {
        this.data = data;
    }
}
