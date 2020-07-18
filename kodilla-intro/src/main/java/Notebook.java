public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000){
            System.out.println("This price is good");
        } else {
            System.out.println("This notebook is expensive");
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light");
        } else if (this.weight >= 1000 && this.weight <= 1500) {
            System.out.println("This notebook is quite heavy");
        } else {
            System.out.println("This notebook is very heavy");
    }

    public void checkOffer() {
        if (this.year < 2016 && this.price <= 500) {
            System.out.println("This notebook has normal price");
        } else if (this.year >= 2016 && this.year < 2019 && this.price > 500 && thi.price <= 1000){
            System.out.println("This notebook has quite good price");
        } else if (this.year >= 2019 && this.price > 1000 && this.price <= 1400){
            System.out.println("This notebook has good price");
        } else if (this.price >= 1400);
            System.out.println("This notebook is overpriced");
    }

    }
}
