package module09_oops.classes_and_objects;
// 1. THE CLASS (The shape/template)
class Cookie {
    String flavor; // Each cookie can have its own taste

    public Cookie(String cookieFlavor) {
        this.flavor = cookieFlavor;
    }
}

// 2. THE OBJECTS (The real cookies)
public class CookieExample {
    public static void main(String[] args) {
        // Baking two separate cookies from the template
        Cookie cookie1 = new Cookie("Choco Chip");
        Cookie cookie2 = new Cookie("Vanilla");

        // Checking their flavors
        System.out.println(cookie1.flavor); // Prints: Choco Chip
        System.out.println(cookie2.flavor); // Prints: Vanilla
    }
}

