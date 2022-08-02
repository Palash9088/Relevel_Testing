public class ProgramAbs {
    public static void main(String[] args) {

        XiaomiPhone obj = new XiaomiPhone();
        obj.Softversion();
        obj.memory();
        obj.isPhone5G();

        System.out.println();

        SamsungPhone samsungPhone = new SamsungPhone();
        samsungPhone.Softversion();
        samsungPhone.memory();
        samsungPhone.isPhone5G();
    }
}
