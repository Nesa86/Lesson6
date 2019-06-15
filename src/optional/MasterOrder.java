package optional;

import java.util.ArrayList;

public class MasterOrder {

	ArrayList<CookieOrder> orders;

	public ArrayList<CookieOrder> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<CookieOrder> orders) {
		this.orders = orders;
	}

	public MasterOrder() {
		orders = new ArrayList<CookieOrder>();
	}

	public void addOrder(CookieOrder cookieOrder) {
		orders.add(cookieOrder);

	}

	public Object getTotalBoxes() {
		int boxes = 0;
		for (int i = 0; i < orders.size(); i++) {
			boxes += orders.get(i).getNumBoxes();
		}
		return boxes;

	}

	public Object removeVariety(String string) {
		int remBoxes = 0;
		for (int i = 0; i < orders.size(); i++) {
			if (orders.get(i).getVariety().equals(string)) {
				remBoxes += orders.get(i).getNumBoxes();
				orders.remove(i);
			}
		}
		return remBoxes;
	}

}