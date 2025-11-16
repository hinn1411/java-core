package oop;

class ClientComponent {
    private MyDao myDao;

    public ClientComponent(MyDao myDao) {
        this.myDao = myDao;
    }
}

class MyDao {
    private DataSource dataSource;
    public MyDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}

class DataSourceImpl implements DataSource {

}

interface DataSource {

}

public class DependencyInjection {
}
