
// En Utils klass (helper-klass) där jag kan samla statiska nyttometoder
// som inte har någon annan logisk hemklass
public class Utils {

    // Kolla om en teckensträng är et heltal
    public static boolean isInt(String str) {
        return str.matches("-?\\d+");
    }

}
