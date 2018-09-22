package test;

import bean.Addresslist;
import bean.AddresslistEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import service.Address;

public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");

//        TestService testService = (TestService)applicationContext.getBean("testService");
//        testService.hello();

        Address address = (Address) applicationContext.getBean("address");
        Addresslist addresslist = new Addresslist();
        addresslist.setName("iPanda");
        addresslist.setPhone("123456789");
        address.add(addresslist);
    }

}
