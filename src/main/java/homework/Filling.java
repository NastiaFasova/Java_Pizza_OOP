package homework;

import homework.enums.Cheese;
import homework.enums.Meat;
import homework.enums.Vegetables;

public class Filling {
    private Vegetables vegetables;
    private Cheese cheese;
    private Meat meat;

    public Filling(Vegetables vegetables, Cheese cheese, Meat meat) {
        this.vegetables = vegetables;
        this.cheese = cheese;
        this.meat = meat;
    }

    public Filling() {
    }

    public void setVegetables(Vegetables vegetables) {
        this.vegetables = vegetables;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public Vegetables getVegetables() {
        return vegetables;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public Meat getMeat() {
        return meat;
    }

    // перевизначений hashCode()
    @Override
    public int hashCode() {
        int result = vegetables != null ? vegetables.hashCode() : 0;
        result = 31 * result + (cheese != null ? cheese.hashCode() : 0);
        result = 31 * result + (meat != null ? meat.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Filling{" +
                "vegetables=" + vegetables +
                ", cheese=" + cheese +
                ", meat=" + meat +
                '}';
    }
}
