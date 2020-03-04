import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "cars")
public class Cars implements Serializable {

    @Id
    @Column(name = "id", unique = true)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private int price;

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
     this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return id + "\t" + name + "\t" + price;
    }
}
