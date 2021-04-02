package spring_boot_15.demo;

import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String ssn;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "laptop_id",referencedColumnName = "id")
    private Laptop laptop;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop lap) {
        this.laptop = lap;
    }
}
