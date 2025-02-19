public class PattanakarnBranch extends Product {

    public int payUnit() {
        return getUnit();
    }

    public int freeUnit() {
        return getUnit();
    }

    public int getTotalprice() {
        return getUnit() * 100;
    }

    public String toString() {
        return "You buy " + payUnit() + " units, get free " + freeUnit() + " units " + "(" + getTotalprice() + ")";
    }
}
