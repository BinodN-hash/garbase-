public class CounterResponse {

    private Counter counters;
    private String resultCode;
    private String resultDescription;

    public Counter getCounters() {
        return counters;
    }

    public void setCounters(Counter counters) {
        this.counters = counters;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultDescription() {
        return resultDescription;
    }

    public void setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
    }
}
