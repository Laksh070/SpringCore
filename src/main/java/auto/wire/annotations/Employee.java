package auto.wire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    private Address address;

    public Address getAddress() {
        return address;
    }

    @Autowired
    @Qualifier("address1")
    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee(){
        super();
    }

    public Employee(Address address){
        System.out.println("Setting value");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
