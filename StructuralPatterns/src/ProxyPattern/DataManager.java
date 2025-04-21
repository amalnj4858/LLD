package ProxyPattern;

public class DataManager implements DataLoader {
    String endpoint;

    public DataManager(String endpoint) {
        this.endpoint = endpoint;
        loadData();
    }

    public void loadData() {
        System.out.println("Hitting endpoint " + this.endpoint + " to fetch data");
    }

    @Override
    public void viewData() {
        System.out.println("Fetched data from endpoint: " + this.endpoint);
    }
}
