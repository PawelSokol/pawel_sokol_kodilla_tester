public class Notebook {
    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000){
            System.out.println("This price is good");
        } else {
            System.out.println("This notebook is expensive");
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light");
        } else if (this.weight > 1000 && this.weight < 1500) {
            System.out.println("This notebook is quite heavy");
        } else {
            System.out.println("This notebook is very heavy");
    }

    public void checkYear() {
        if (this.year < 2016) {
            System.out.println("This notebook is old");
        } else if (this.price < 600 && this.year < 2016){
            System.out.println("This notebook is a bargain");
        } else if (this.price < 1100 && this.year <= 2018){
            System.out.println("This notebook is reasonably priced");
        } else if (this.price >= 1500);
            System.out.println("This laptop is overpriced");
    }

    }
}
