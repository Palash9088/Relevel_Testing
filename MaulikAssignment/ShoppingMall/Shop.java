package ShoppingMall;//import java.util.*;

public class Shop {
    int maggie;
    int dosa;
    int oilPouches;
    int paniPuri;
    int masale;
    public void setInventory(int maggie, int dosa, int oilPouches,int paniPuri,int masale)
    {
        this.maggie = maggie;
        this.dosa = dosa;
        this.oilPouches = oilPouches;
        this.paniPuri = paniPuri;
        this.masale = masale;
    }
    public void customerShop(int maggie,int dosa,int oilPouches,int paniPuri,int masale)
    {
        if(maggie<=this.maggie)
        {
            this.maggie = this.maggie - maggie;
        }
        else
        {
            System.out.println("Item out of stock");
        }
        if(dosa<=this.dosa)
        {
            this.dosa = this.dosa - dosa;
        }
        else
        {
            System.out.println("Item out of stock");
        }
        if(oilPouches<=this.oilPouches)
        {
            this.oilPouches = this.oilPouches - oilPouches;
        }
        else
        {
            System.out.println("Item out of stock");
        }
        if(paniPuri<=this.paniPuri)
        {
            this.paniPuri = this.paniPuri - paniPuri;
        }
        else
        {
            System.out.println("Item out of stock");
        }
        if(masale<=this.masale)
        {
            this.masale = this.masale - masale;
        }
        else
        {
            System.out.println("Item out of stock");
        }
    }
    public void remainingQnt()
    {
        System.out.println("Available stock of Maggie " + this.maggie);
        System.out.println("Available stock of Dosa " + this.dosa);
        System.out.println("Available stock of oil " +this.oilPouches);
        System.out.println("Available stock of paniPuri " +this.paniPuri);
        System.out.println("Available stock of Masale " +this.masale);
    }
    public void outOfStock()
    {
        if (maggie == 0)
        {
            System.out.println("Maggie out of stock");
        }
        if (dosa == 0)
        {
            System.out.println("Dosa out of stock");
        }
        if (oilPouches == 0)
        {
            System.out.println("Oil out of stock");
        }
        if (masale == 0)
        {
            System.out.println("Masala out of stock");
        }
        if(paniPuri == 0)
        {
            System.out.println("Panipuri out of stock");
        }
    }
    public void availableStock()
    {
        if (maggie != 0)
        {
            System.out.println("Maggie in stock");
        }
        if (dosa != 0)
        {
            System.out.println("Dosa in stock");
        }
        if (oilPouches != 0)
        {
            System.out.println("Oil in stock");
        }
        if (masale != 0)
        {
            System.out.println("Masala in stock");
        }
        if(paniPuri != 0)
        {
            System.out.println("Panipuri in stock");
        }
    }

    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.setInventory(50,20,10,30,40);
        shop.remainingQnt();
        System.out.println();
        shop.customerShop(10,20,4,10,10);
        shop.remainingQnt();
        shop.outOfStock();
        shop.availableStock();

    }

}
