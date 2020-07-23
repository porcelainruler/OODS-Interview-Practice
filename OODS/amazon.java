package OODS;

import java.util.ArrayList;

public class amazon {

    private int c_num = 0;
    private int i_num = 0;

    // A Map with Item.id  <-->  Item.category  Assume Name = categ_map {HashMap<Integer, String>}

    public class item {
        private int p_id;
        private int price;

        private String category;

        item() {
            this.p_id = 0;
            this.price = 0;
            this.category = "";
        }

        item(int p_id, int price) {
            this.p_id = p_id;
            this.price = price;
        }

    };

    public class customer {
        private int c_id;
        private String c_name;

        private ArrayList<item> pref;
        
        customer() {
            this.c_id = 0;
            this.c_name = "";
            this.pref = new ArrayList<>();
        }

        customer(int c_id, String c_name) {
            this.c_id = c_id;
            this.c_name = c_name;
        }

    };

    public class cart {
        private int c_id;
        private ArrayList<item> items;

        cart() {
            this.c_id = 0;
            this.items = new ArrayList<>();
        }

        cart(int c_id) {
            this.c_id = c_id;
        }

        public boolean add_item(item it) {
            this.items.add(it);

            // To add Category to Customer <For future Suggestions> && Review Allowed(only when delivered)

            return true;
        }

        public boolean remove_item(item it) {
            for (int idx=0 ; idx<this.items.size() ; idx++) {
                if (it.p_id == items.get(idx).p_id) {
                    this.items.remove(idx);
                    return true;
                }
            }

            // To Remove if any Review for this article

            return false;
        }

    };

    public class review {
        private int rating;
        private int p_id;
        private int c_id;

        review(int rating, int p_id, int c_id) {
            this.rating = rating;
            this.p_id = p_id;
            this.c_id = c_id;
        }
    };

    public static void main(String[] args) {
      amazon store = new amazon();
      amazon.item it1 = store.new item();

      System.out.println(it1.p_id + " " + it1.price);
    }

}