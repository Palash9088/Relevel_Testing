public class Switch_top_brands {
    public static void main(String[] args) {
        // Determine the Top 10 Mobile Brands
        int Brands = 8;

        switch (Brands)
        {
            case 1:
                System.out.println("This is top 1 brand 'Samsung' ");
                break;
            case 2:
                System.out.println(" This is top 2 brandApple");
                break;
            case 3:
                System.out.println("This is top 3 brand Huawei");
                break;
            case 4:
                System.out.println("This is top 4 brand Xiaomi");
                break;
            case 5:
                System.out.println(" This is top 5 brand OPPO");
                break;
            case 6:
                System.out.println("This is top 6 brand Vivo");
                break;
            case 7:
                System.out.println(" This is top 7 brand Motorola");
                break;
            case 8:
                System.out.println("This is top 8 brand Lenovo");
                break;
            case 9:
                System.out.println("This is top 9 brand LG");
                break;
            case 10:
                System.out.println("This is top 10 brand Nokia");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
