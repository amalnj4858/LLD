package ProxyPattern;

public class DataManagerProxy implements DataLoader{

    DataManager dataManager;

    String endpoint;

    public DataManagerProxy(String endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public void viewData() {
        if(dataManager ==  null) {
            dataManager = new DataManager(endpoint);
        }
        dataManager.viewData();
    }
}
