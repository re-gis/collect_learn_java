package enumsLearn;

enum LapTopEnum {
    HP,
    THINKPAD,
    Dell,
    Lenovo;
    private int price;

    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public static void initializePrices() throws Exception {
        for (LapTopEnum laptop : LapTopEnum.values()) {
            switch (laptop) {
                case HP:
                    laptop.setPrice(200);
                    break;
                case THINKPAD:
                    laptop.setPrice(150);
                    break;
                case Dell:
                    laptop.setPrice(250);
                    break;
                case Lenovo:
                    laptop.setPrice(300);
                    break;

                    default:
                    throw new Exception("Laptop not found!");
            }
        }
    }


    
}


public class LapTop {
    public static void main(String[] args)throws Exception {
        LapTopEnum.initializePrices();
        for (LapTopEnum e : LapTopEnum.values()) {
            System.out.println(e+": $" + e.getPrice());
        }
    }
    
}