package javatraining.javacollectionsandsortingexercise;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class MainApp {

	public static void main(String[] args) {
		Customer cust1 = new Customer(1l, "Stefan Walker", 1);
		Customer cust2 = new Customer(2l, "Daija Von", 1);
		Customer cust3 = new Customer(3l, "Ariane Rodriguez", 1);
		Customer cust4 = new Customer(4l, "Marques Nikolaus", 2);
		Customer cust5 = new Customer(5l, "Rachelle Greenfelder", 0);
		Customer cust6 = new Customer(6l, "Larissa White", 2);
		Customer cust7 = new Customer(7l, "Fae Heidenreich", 1);
		Customer cust8 = new Customer(8l, "Dino Will", 2);
		Customer cust9 = new Customer(9l, "Eloy Stroman", 1);
		Customer cust10 = new Customer(10l, "Brisa O'Connell", 1);

		Product prod1 = new Product(1l, "omnis quod consequatur", "Games", 184.83);
		Product prod2 = new Product(2l, "vel libero suscipit", "Toys", 12.66);
		Product prod3 = new Product(3l, "non nemo iure", "Grocery", 498.02);
		Product prod4 = new Product(4l, "voluptatem voluptas aspernatur", "Toys", 536.80);
		Product prod5 = new Product(5l, "animi cum rem", "Games", 458.20);
		Product prod6 = new Product(6l, "dolorem porro debitis", "Toys", 146.52);
		Product prod7 = new Product(7l, "aspernatur rerum qui", "Books", 656.42);
		Product prod8 = new Product(8l, "deleniti earum et", "Baby", 41.46);
		Product prod9 = new Product(9l, "voluptas ut quidem", "Books", 697.57);
		Product prod10 = new Product(10l, "eos sed debitis", "Baby", 366.90);
		Product prod11 = new Product(11l, "laudantium sit nihil", "Toys", 95.50);
		Product prod12 = new Product(12l, "ut perferendis corporis", "Grocery", 302.19);
		Product prod13 = new Product(13l, "sint voluptatem ut", "Toys", 295.37);
		Product prod14 = new Product(14l, "quos sunt ipsam", "Grocery", 534.64);
		Product prod15 = new Product(15l, "qui illo error", "Baby", 623.58);
		Product prod16 = new Product(16l, "aut ex ducimus", "Books", 551.39);
		Product prod17 = new Product(17l, "accusamus repellendus minus", "Books", 240.58);
		Product prod18 = new Product(18l, "aut accusamus quia", "Baby", 881.38);
		Product prod19 = new Product(19l, "doloremque incidunt sed", "Games", 988.49);
		Product prod20 = new Product(20l, "libero omnis velit", "Baby", 177.61);
		Product prod21 = new Product(21l, "consectetur cupiditate sunt", "Toys", 95.46);
		Product prod22 = new Product(22l, "itaque ea qui", "Baby", 677.78);
		Product prod23 = new Product(23l, "non et nulla", "Grocery", 70.49);
		Product prod24 = new Product(24l, "veniam consequatur et", "Books", 893.44);
		Product prod25 = new Product(25l, "magnam adipisci voluptate", "Grocery", 366.13);
		Product prod26 = new Product(26l, "reiciendis consequuntur placeat", "Toys", 359.27);
		Product prod27 = new Product(27l, "dolores ipsum sit", "Toys", 786.99);
		Product prod28 = new Product(28l, "ut hic tempore", "Toys", 316.09);
		Product prod29 = new Product(29l, "quas quis deserunt", "Toys", 772.78);
		Product prod30 = new Product(30l, "excepturi nesciunt accusantium", "Toys", 911.46);

		Order order1 = new Order(1l, LocalDate.of(2021, 2, 28), LocalDate.of(2021, 3, 8), "NEW", 5l);
		Order order2 = new Order(2l, LocalDate.of(2021, 2, 28), LocalDate.of(2021, 3, 5), "NEW", 3l);
		Order order3 = new Order(3l, LocalDate.of(2021, 4, 10), LocalDate.of(2021, 4, 18), "DELIVERED", 5l);
		Order order4 = new Order(4l, LocalDate.of(2021, 3, 22), LocalDate.of(2021, 3, 27), "PENDING", 3l);
		Order order5 = new Order(5l, LocalDate.of(2021, 3, 4), LocalDate.of(2021, 3, 12), "NEW", 1l);
		Order order6 = new Order(6l, LocalDate.of(2021, 3, 30), LocalDate.of(2021, 4, 7), "DELIVERED", 9l);
		Order order7 = new Order(7l, LocalDate.of(2021, 3, 5), LocalDate.of(2021, 3, 9), "PENDING", 8l);
		Order order8 = new Order(8l, LocalDate.of(2021, 3, 27), LocalDate.of(2021, 4, 5), "NEW", 4l);
		Order order9 = new Order(9l, LocalDate.of(2021, 4, 14), LocalDate.of(2021, 4, 18), "NEW", 10l);
		Order order10 = new Order(10l, LocalDate.of(2021, 3, 10), LocalDate.of(2021, 3, 19), "NEW", 8l);
		Order order11 = new Order(11l, LocalDate.of(2021, 4, 1), LocalDate.of(2021, 4, 4), "DELIVERED", 1l);
		Order order12 = new Order(12l, LocalDate.of(2021, 2, 24), LocalDate.of(2021, 2, 28), "PENDING", 5l);
		Order order13 = new Order(13l, LocalDate.of(2021, 3, 15), LocalDate.of(2021, 3, 21), "NEW", 5l);
		Order order14 = new Order(14l, LocalDate.of(2021, 3, 30), LocalDate.of(2021, 4, 7), "PENDING", 4l);
		Order order15 = new Order(15l, LocalDate.of(2021, 3, 13), LocalDate.of(2021, 3, 14), "DELIVERED", 5l);
		Order order16 = new Order(16l, LocalDate.of(2021, 3, 13), LocalDate.of(2021, 3, 21), "NEW", 1l);
		Order order17 = new Order(17l, LocalDate.of(2021, 3, 31), LocalDate.of(2021, 3, 31), "DELIVERED", 6l);
		Order order18 = new Order(18l, LocalDate.of(2021, 3, 25), LocalDate.of(2021, 3, 31), "PENDING", 9l);
		Order order19 = new Order(19l, LocalDate.of(2021, 2, 28), LocalDate.of(2021, 3, 9), "DELIVERED", 9l);
		Order order20 = new Order(20l, LocalDate.of(2021, 3, 23), LocalDate.of(2021, 3, 30), "NEW", 5l);
		Order order21 = new Order(21l, LocalDate.of(2021, 3, 19), LocalDate.of(2021, 3, 24), "DELIVERED", 9l);
		Order order22 = new Order(22l, LocalDate.of(2021, 2, 27), LocalDate.of(2021, 3, 1), "NEW", 5l);
		Order order23 = new Order(23l, LocalDate.of(2021, 4, 19), LocalDate.of(2021, 4, 24), "PENDING", 4l);
		Order order24 = new Order(24l, LocalDate.of(2021, 3, 24), LocalDate.of(2021, 3, 24), "DELIVERED", 1l);
		Order order25 = new Order(25l, LocalDate.of(2021, 3, 3), LocalDate.of(2021, 3, 10), "NEW", 1l);
		Order order26 = new Order(26l, LocalDate.of(2021, 3, 17), LocalDate.of(2021, 3, 26), "NEW", 10l);
		Order order27 = new Order(27l, LocalDate.of(2021, 3, 20), LocalDate.of(2021, 3, 25), "NEW", 1l);
		Order order28 = new Order(28l, LocalDate.of(2021, 4, 9), LocalDate.of(2021, 4, 16), "DELIVERED", 2l);
		Order order29 = new Order(29l, LocalDate.of(2021, 4, 6), LocalDate.of(2021, 4, 8), "PENDING", 1l);
		Order order30 = new Order(30l, LocalDate.of(2021, 4, 19), LocalDate.of(2021, 4, 20), "DELIVERED", 1l);
		Order order31 = new Order(31l, LocalDate.of(2021, 3, 3), LocalDate.of(2021, 3, 4), "NEW", 3l);
		Order order32 = new Order(32l, LocalDate.of(2021, 3, 15), LocalDate.of(2021, 3, 24), "DELIVERED", 2l);
		Order order33 = new Order(33l, LocalDate.of(2021, 4, 18), LocalDate.of(2021, 4, 24), "PENDING", 1l);
		Order order34 = new Order(34l, LocalDate.of(2021, 3, 28), LocalDate.of(2021, 3, 28), "NEW", 6l);
		Order order35 = new Order(35l, LocalDate.of(2021, 3, 15), LocalDate.of(2021, 3, 17), "NEW", 1l);
		Order order36 = new Order(36l, LocalDate.of(2021, 3, 4), LocalDate.of(2021, 3, 8), "DELIVERED", 2l);
		Order order37 = new Order(37l, LocalDate.of(2021, 3, 18), LocalDate.of(2021, 3, 25), "NEW", 8l);
		Order order38 = new Order(38l, LocalDate.of(2021, 4, 11), LocalDate.of(2021, 4, 20), "NEW", 8l);
		Order order39 = new Order(39l, LocalDate.of(2021, 4, 12), LocalDate.of(2021, 4, 17), "NEW", 9l);
		Order order40 = new Order(40l, LocalDate.of(2021, 3, 12), LocalDate.of(2021, 3, 12), "PENDING", 3l);
		Order order41 = new Order(41l, LocalDate.of(2021, 2, 24), LocalDate.of(2021, 2, 26), "NEW", 5l);
		Order order42 = new Order(42l, LocalDate.of(2021, 4, 8), LocalDate.of(2021, 4, 14), "DELIVERED", 9l);
		Order order43 = new Order(43l, LocalDate.of(2021, 3, 3), LocalDate.of(2021, 3, 11), "NEW", 3l);
		Order order44 = new Order(44l, LocalDate.of(2021, 3, 12), LocalDate.of(2021, 3, 14), "DELIVERED", 4l);
		Order order45 = new Order(45l, LocalDate.of(2021, 4, 1), LocalDate.of(2021, 4, 6), "DELIVERED", 1l);
		Order order46 = new Order(46l, LocalDate.of(2021, 3, 16), LocalDate.of(2021, 3, 22), "NEW", 10l);
		Order order47 = new Order(47l, LocalDate.of(2021, 4, 7), LocalDate.of(2021, 4, 12), "PENDING", 2l);
		Order order48 = new Order(48l, LocalDate.of(2021, 4, 5), LocalDate.of(2021, 4, 6), "NEW", 2l);
		Order order49 = new Order(49l, LocalDate.of(2021, 4, 10), LocalDate.of(2021, 4, 13), "NEW", 7l);
		Order order50 = new Order(50l, LocalDate.of(2021, 3, 18), LocalDate.of(2021, 3, 21), "NEW", 9l);

		Set<Customer> customerSet = new HashSet<Customer>();
		customerSet.add(cust1);
		customerSet.add(cust2);
		customerSet.add(cust3);
		customerSet.add(cust4);
		customerSet.add(cust5);
		customerSet.add(cust6);
		customerSet.add(cust7);
		customerSet.add(cust8);
		customerSet.add(cust9);
		customerSet.add(cust10);

		Set<Product> productSet = new HashSet<Product>();
		productSet.add(prod1);
		productSet.add(prod2);
		productSet.add(prod3);
		productSet.add(prod4);
		productSet.add(prod5);
		productSet.add(prod6);
		productSet.add(prod7);
		productSet.add(prod8);
		productSet.add(prod9);
		productSet.add(prod10);
		productSet.add(prod11);
		productSet.add(prod12);
		productSet.add(prod13);
		productSet.add(prod14);
		productSet.add(prod15);
		productSet.add(prod16);
		productSet.add(prod17);
		productSet.add(prod18);
		productSet.add(prod19);
		productSet.add(prod20);
		productSet.add(prod21);
		productSet.add(prod22);
		productSet.add(prod23);
		productSet.add(prod24);
		productSet.add(prod25);
		productSet.add(prod26);
		productSet.add(prod27);
		productSet.add(prod28);
		productSet.add(prod29);
		productSet.add(prod30);

		Set<Order> orderSet = new HashSet<Order>();
		orderSet.add(order1);
		orderSet.add(order2);
		orderSet.add(order3);
		orderSet.add(order4);
		orderSet.add(order5);
		orderSet.add(order6);
		orderSet.add(order7);
		orderSet.add(order8);
		orderSet.add(order9);
		orderSet.add(order10);
		orderSet.add(order11);
		orderSet.add(order12);
		orderSet.add(order13);
		orderSet.add(order14);
		orderSet.add(order15);
		orderSet.add(order16);
		orderSet.add(order17);
		orderSet.add(order18);
		orderSet.add(order19);
		orderSet.add(order20);
		orderSet.add(order21);
		orderSet.add(order22);
		orderSet.add(order23);
		orderSet.add(order24);
		orderSet.add(order25);
		orderSet.add(order26);
		orderSet.add(order27);
		orderSet.add(order28);
		orderSet.add(order29);
		orderSet.add(order30);
		orderSet.add(order31);
		orderSet.add(order32);
		orderSet.add(order33);
		orderSet.add(order34);
		orderSet.add(order35);
		orderSet.add(order36);
		orderSet.add(order37);
		orderSet.add(order38);
		orderSet.add(order39);
		orderSet.add(order40);
		orderSet.add(order41);
		orderSet.add(order42);
		orderSet.add(order43);
		orderSet.add(order44);
		orderSet.add(order45);
		orderSet.add(order46);
		orderSet.add(order47);
		orderSet.add(order48);
		orderSet.add(order49);
		orderSet.add(order50);

		System.out.println(
				"*********************************************************************************************");
		customerSet.forEach(System.out::println);
		System.out.println(
				"*********************************************************************************************");
		productSet.forEach(System.out::println);
		System.out.println(
				"*********************************************************************************************");
		orderSet.forEach(System.out::println);
		System.out.println(
				"*********************************************************************************************");

		System.out.println("\n1.Obtain a list of products belongs to category “Books” with price > 100\n");
		Set<Product> productBook = new HashSet<Product>();
		for (Product item1 : productSet) {
			if (item1.getCategory() == "Books" && item1.getPrice() > 100) {
				productBook.add(item1);
			}
		}
		productBook.forEach(System.out::println);

		System.out.println(
				"\n*********************************************************************************************\n");

		System.out.println("\n2.Obtain a list of order with products belong to category “Baby”\n" + "");
		Set<Product> productBaby = new HashSet<Product>();
		for (Product item2 : productSet) {
			if (item2.getCategory() == "Baby") {
				productBaby.add(item2);
			}
		}

		productBaby.forEach(System.out::println);

		System.out.println(
				"\n*********************************************************************************************\n");

		System.out.println("\n3.Obtain a list of product with category = “Toys” and then apply 10% discount\n");

		Set<Product> productToys = new HashSet<Product>();
		for (Product item3 : productSet) {
			if (item3.getCategory() == "Toys") {
				item3.Discount(10.0);
				productToys.add(item3);
			}
		}

		productToys.forEach(System.out::println);

		System.out.println(
				"\n*********************************************************************************************\n");
		System.out.println(
				"\n4.Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021\r\n"
						+ "\n");

//		Set<Customer> customerTier=new HashSet<Customer>();
//		for(Customer item4: customerSet) {
//			if(item4.getTier().equals(2)) {
//				customerTier.add(item4);
//			}
//		}

		Set<Product> productOrderBetweenDates = new HashSet<Product>();
		for (Order item5 : orderSet) {
			if (item5.getOrderDate().isAfter(LocalDate.of(2021, 2, 1))
					&& item5.getOrderDate().isBefore(LocalDate.of(2021, 4, 1))) {
				for (Customer item6 : customerSet) {
					if (item6.getTier() == 2) {
						for (Product item7 : productSet) {
							productOrderBetweenDates.add(item7);
						}
					}
				}
			}

			productOrderBetweenDates.forEach(System.out::println);

		}

		System.out.println(
				"\n*********************************************************************************************\n");
		System.out.println(
				"\n*********************************************************************************************\n");

		System.out.println("\n5.Get the cheapest products of “Books” category\r\n" + "\n");

		double cheapestBookPrice = Double.MAX_VALUE;
		Product cheapestBook = null;
		for (Product book : productSet) {
			// If the current book's price is cheaper than the current cheapest book price
			if (book.getPrice() < cheapestBookPrice) {
				// Update the cheapest book price
				cheapestBookPrice = book.getPrice();
				// Update the cheapest book
				cheapestBook = book;
			}
		}
		// Print the result
		System.out.println("The cheapest book is: " + cheapestBook.getName() + " with price: " + cheapestBookPrice);

	}

}
