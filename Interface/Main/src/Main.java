public class Main {
    public static void main(String[] args) {
        ITelephone iTelephone;
        iTelephone = new DeskPhone(123456789);
        iTelephone.powerOn();
        iTelephone.callPhone(123456789);
        iTelephone.answer();

        iTelephone = new MobilePhone(456789);
        iTelephone.powerOn();
        iTelephone.dial(456789);
        iTelephone.callPhone(456789);
        iTelephone.answer();
    }
}