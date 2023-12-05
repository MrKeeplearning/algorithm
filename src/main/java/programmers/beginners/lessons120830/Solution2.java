package programmers.beginners.lessons120830;

// 객체지향스러운 코드
public class Solution2 {
    public int solution(int n, int k) {
        int lambTotalPrice = totalPrice(Menu.LAMB, n);
        int drinkTotalPrice = totalPrice(Menu.DRINK, k);
        int discountPrice = discount(Menu.DRINK, n);

        return lambTotalPrice + drinkTotalPrice - discountPrice;
    }

    private int totalPrice(Menu menu, int quantity) {
        return menu.getPrice() * quantity;
    }

    private int discount(Menu menu, int quantity) {
        int benefit = quantity / 10;
        return menu.getPrice() * benefit;
    }

    public enum Menu {
        LAMB("양꼬치", 12000),
        DRINK("음료수", 2000);
        private final String name;
        private final int price;

        Menu(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }
}


