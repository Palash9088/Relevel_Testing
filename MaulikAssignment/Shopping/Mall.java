package Shopping;//import java.util.*;

public class Mall {
    int items;
    String customerName;
    String paymentMethod;
    boolean needBill;
    boolean haveCarrybag;

    public void itemAddedToCart(int items)
    {
        this.items = items;
    }
    public void customerName(String customerName)
    {
        this.customerName = customerName;
    }
    public void paymentDoneUsing(String paymentMethod)
    {
        this.paymentMethod = paymentMethod;
    }
    public void displayCustomerInfo()
    {
        System.out.println("Name of customer is " + customerName);
        decideSection();
    }
    public void needBill(boolean flag)
    {
        this.needBill = flag;
    }
    public void haveCarryBag(boolean flag)
    {
        this.haveCarrybag = flag;
    }
    public void decideSection()
    {
        if (items<=10 && paymentMethod == "cash")
        {
            System.out.println("Section A");
        }
        else if (items>10 && paymentMethod == "visa")
        {
            System.out.println("Section 1B");
        }
        else if (items>10 && paymentMethod == "cash")
        {
            System.out.println("Section 1C");
        }
        else if (items<10 && paymentMethod == "visa")
        {
            System.out.println("Section 1D");
        }
    }

    public static void main(String[] args) {

        Mall mall = new Mall();
        mall.customerName("Rahul");
        mall.itemAddedToCart(12);
        mall.paymentDoneUsing("visa");
        mall.needBill(true);
        mall.haveCarryBag(true);
        mall.displayCustomerInfo();

    }
}
