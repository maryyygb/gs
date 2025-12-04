package com;

import java.util.*;

public class GroceryList {
	private boolean newItemsAdded = false;

	public int idC;
	public String nameC;
	public String sizeC;
	public double priceC;
	public int stocksC;

	private ArrayList<Object[]> fruits;
	private ArrayList<Object[]> vegetables;
	private ArrayList<Object[]> snacks;
	private ArrayList<Object[]> dairy;
	private ArrayList<Object[]> beverages;
	private ArrayList<Object[]> cosmetics;
	private ArrayList<Object[]> household;
	private ArrayList<Object[]> clothes;
	protected ArrayList<Object[]> newItems;

	public GroceryList() {
		fruits = new ArrayList<>();
		vegetables = new ArrayList<>();
		snacks = new ArrayList<>();
		dairy = new ArrayList<>();
		beverages = new ArrayList<>();
		cosmetics = new ArrayList<>();
		household = new ArrayList<>();
		clothes = new ArrayList<>();
		newItems = new ArrayList<>();

		// Fruits (10 items)
		fruits.add(new Object[] { 1, "Apple", "1kg", 120.0, 50 });
		fruits.add(new Object[] { 2, "Banana", "1kg", 60.0, 40 });
		fruits.add(new Object[] { 3, "Mango", "1kg", 150.0, 30 });
		fruits.add(new Object[] { 4, "Orange", "1kg", 100.0, 25 });
		fruits.add(new Object[] { 5, "Grapes", "1kg", 200.0, 20 });
		fruits.add(new Object[] { 6, "Papaya", "1kg", 90.0, 15 });
		fruits.add(new Object[] { 7, "Pineapple", "1kg", 110.0, 10 });
		fruits.add(new Object[] { 8, "Watermelon", "1kg", 180.0, 12 });
		fruits.add(new Object[] { 9, "Avocado", "1kg", 170.0, 18 });
		fruits.add(new Object[] { 10, "Lemon", "1kg", 70.0, 22 });

		// Vegetables (10 items)
		vegetables.add(new Object[] { 11, "Carrot", "1kg", 80.0, 35 });
		vegetables.add(new Object[] { 12, "Potato", "1kg", 70.0, 60 });
		vegetables.add(new Object[] { 13, "Tomato", "1kg", 90.0, 45 });
		vegetables.add(new Object[] { 14, "Onion", "1kg", 85.0, 50 });
		vegetables.add(new Object[] { 15, "Cabbage", "1kg", 60.0, 25 });
		vegetables.add(new Object[] { 16, "Spinach", "1kg", 50.0, 20 });
		vegetables.add(new Object[] { 17, "Broccoli", "1kg", 120.0, 15 });
		vegetables.add(new Object[] { 18, "Eggplant", "1kg", 75.0, 30 });
		vegetables.add(new Object[] { 19, "Bell Pepper", "1kg", 95.0, 28 });
		vegetables.add(new Object[] { 20, "Garlic", "1kg", 150.0, 12 });

		// Snacks (10 items)
		snacks.add(new Object[] { 21, "Chips", "1kg", 250.0, 40 });
		snacks.add(new Object[] { 22, "Cookies", "1kg", 300.0, 35 });
		snacks.add(new Object[] { 23, "Crackers", "1kg", 200.0, 25 });
		snacks.add(new Object[] { 24, "Popcorn", "1kg", 180.0, 20 });
		snacks.add(new Object[] { 25, "Nuts", "1kg", 400.0, 15 });
		snacks.add(new Object[] { 26, "Chocolate", "1kg", 500.0, 18 });
		snacks.add(new Object[] { 27, "Candy", "1kg", 150.0, 50 });
		snacks.add(new Object[] { 28, "Biscuits", "1kg", 220.0, 30 });
		snacks.add(new Object[] { 29, "Pretzels", "1kg", 280.0, 22 });
		snacks.add(new Object[] { 30, "Granola Bar", "1kg", 350.0, 12 });

		// Dairy (10 items)
		dairy.add(new Object[] { 31, "Milk", "1kg", 80.0, 25 });
		dairy.add(new Object[] { 32, "Cheese", "1kg", 120.0, 20 });
		dairy.add(new Object[] { 33, "Yogurt", "1kg", 90.0, 18 });
		dairy.add(new Object[] { 34, "Butter", "1kg", 150.0, 15 });
		dairy.add(new Object[] { 35, "Cream", "1kg", 110.0, 12 });
		dairy.add(new Object[] { 36, "Ice Cream", "1kg", 200.0, 10 });
		dairy.add(new Object[] { 37, "Condensed Milk", "1kg", 95.0, 22 });
		dairy.add(new Object[] { 38, "Evaporated Milk", "1kg", 85.0, 20 });
		dairy.add(new Object[] { 39, "Cottage Cheese", "1kg", 130.0, 14 });
		dairy.add(new Object[] { 40, "Sour Cream", "1kg", 100.0, 16 });

		// Beverages (10 items)
		beverages.add(new Object[] { 41, "Water", "1kg", 20.0, 100 });
		beverages.add(new Object[] { 42, "Juice", "1kg", 60.0, 40 });
		beverages.add(new Object[] { 43, "Soda", "1kg", 50.0, 35 });
		beverages.add(new Object[] { 44, "Coffee", "1kg", 300.0, 25 });
		beverages.add(new Object[] { 45, "Tea", "1kg", 250.0, 30 });
		beverages.add(new Object[] { 46, "Energy Drink", "1kg", 120.0, 20 });
		beverages.add(new Object[] { 47, "Milk Tea", "1kg", 150.0, 18 });
		beverages.add(new Object[] { 48, "Smoothie", "1kg", 180.0, 15 });
		beverages.add(new Object[] { 49, "Lemonade", "1kg", 90.0, 22 });
		beverages.add(new Object[] { 50, "Iced Coffee", "1kg", 200.0, 12 });

		// Cosmetics (10 items)
		cosmetics.add(new Object[] { 51, "Lipstick", "10g", 250.0, 30 });
		cosmetics.add(new Object[] { 52, "Foundation", "30ml", 500.0, 20 });
		cosmetics.add(new Object[] { 53, "Mascara", "15ml", 300.0, 25 });
		cosmetics.add(new Object[] { 54, "Eyeliner", "5ml", 200.0, 40 });
		cosmetics.add(new Object[] { 55, "Blush", "20g", 350.0, 18 });
		cosmetics.add(new Object[] { 56, "Face Powder", "50g", 400.0, 15 });
		cosmetics.add(new Object[] { 57, "Perfume", "100ml", 1200.0, 10 });
		cosmetics.add(new Object[] { 58, "Nail Polish", "10ml", 150.0, 50 });
		cosmetics.add(new Object[] { 59, "Makeup Remover", "100ml", 250.0, 20 });
		cosmetics.add(new Object[] { 60, "Moisturizer", "50ml", 600.0, 12 });

		// Household (10 items)
		household.add(new Object[] { 61, "Detergent", "1kg", 150.0, 40 });
		household.add(new Object[] { 62, "Dish Soap", "500ml", 90.0, 35 });
		household.add(new Object[] { 63, "Broom", "1pc", 120.0, 25 });
		household.add(new Object[] { 64, "Mop", "1pc", 250.0, 20 });
		household.add(new Object[] { 65, "Bucket", "10L", 180.0, 15 });
		household.add(new Object[] { 66, "Trash Bag", "1 roll", 100.0, 50 });
		household.add(new Object[] { 67, "Toilet Cleaner", "500ml", 120.0, 30 });
		household.add(new Object[] { 68, "Air Freshener", "300ml", 200.0, 25 });
		household.add(new Object[] { 69, "Sponge", "1pc", 50.0, 60 });
		household.add(new Object[] { 70, "Laundry Basket", "1pc", 350.0, 12 });

		// Clothes (10 items)
		clothes.add(new Object[] { 71, "T-Shirt", "Medium", 250.0, 40 });
		clothes.add(new Object[] { 72, "Jeans", "32", 800.0, 20 });
		clothes.add(new Object[] { 73, "Jacket", "Large", 1200.0, 15 });
		clothes.add(new Object[] { 74, "Dress", "Small", 950.0, 18 });
		clothes.add(new Object[] { 75, "Shorts", "Medium", 300.0, 25 });
		clothes.add(new Object[] { 76, "Skirt", "Small", 400.0, 22 });
		clothes.add(new Object[] { 77, "Shoes", "Size 8", 1500.0, 10 });
		clothes.add(new Object[] { 78, "Socks", "Free Size", 100.0, 50 });
		clothes.add(new Object[] { 79, "Cap", "Free Size", 200.0, 30 });
		clothes.add(new Object[] { 80, "Sweater", "Large", 900.0, 12 });
	}

	public void addNewItems(int id, String name, String size, double price, int stocks) {
		this.newItems.add(new Object[] { id, name, size, price, stocks });
		this.newItemsAdded = true; // Set a flag if needed
	}

	public String alert() {
		if (this.newItemsAdded == true) {
			return "New Item Added!";
		} else {
			return "Failed to add Item.";
		}
	}

	public void groceryList() {
		System.out.println("\n========== FRUITS ==========");
		System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Weight", "Price", "Stock");
		for (Object[] item : fruits) {
			System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
					item[0], item[1], item[2], item[3], item[4]);
		}

		System.out.println("");

		System.out.println("\n========== VEGETABLES ==========");
		System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Weight", "Price", "Stock");
		for (Object[] item : vegetables) {
			System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
					item[0], item[1], item[2], item[3], item[4]);
		}

		System.out.println("");

		System.out.println("\n========== SNACKS ==========");
		System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Weight", "Price", "Stock");
		for (Object[] item : snacks) {
			System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
					item[0], item[1], item[2], item[3], item[4]);
		}

		System.out.println("");

		System.out.println("\n========== DAIRY ==========");
		System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Weight", "Price", "Stock");
		for (Object[] item : dairy) {
			System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
					item[0], item[1], item[2], item[3], item[4]);
		}

		System.out.println("");

		System.out.println("\n========== BEVERAGES ==========");
		System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Weight", "Price", "Stock");
		for (Object[] item : beverages) {
			System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
					item[0], item[1], item[2], item[3], item[4]);
		}

		System.out.println("");

		// Display Cosmetics
		System.out.println("\n========== COSMETICS ==========");
		System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");
		for (Object[] item : cosmetics) {
			System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
					item[0], item[1], item[2], item[3], item[4]);
		}

		System.out.println("");

		// Display Household
		System.out.println("\n========== HOUSEHOLD ==========");
		System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");
		for (Object[] item : household) {
			System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
					item[0], item[1], item[2], item[3], item[4]);
		}

		System.out.println("");

		// Display Clothes
		System.out.println("\n========== CLOTHES ==========");
		System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");
		for (Object[] item : clothes) {
			System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
					item[0], item[1], item[2], item[3], item[4]);
		}

		System.out.println("");

		// Display New Items Added
		System.out.println("\n========== NEW ITEMS ==========");
		System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");
		for (Object[] item : newItems) {
			System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
					item[0], item[1], item[2], item[3], item[4]);
		}

		System.out.println("");
		System.out.println("");
	}

	// getter Methods to pass when a Customer User wants to add something to their
	// cart

	/*
	 * private ArrayList<Object[]> fruits;
	 * private ArrayList<Object[]> vegetables;
	 * private ArrayList<Object[]> snacks;
	 * private ArrayList<Object[]> dairy;
	 * private ArrayList<Object[]> beverages;
	 * private ArrayList<Object[]> cosmetics;
	 * private ArrayList<Object[]> household;
	 * private ArrayList<Object[]> clothes;
	 * protected ArrayList<Object[]> newItems;
	 */

	public void getFruits(int id) {

		for (Object[] item : fruits) {

			int base = (Integer) item[0];

			if (base == id) {
				idC = (Integer) item[0];
				nameC = (String) item[1];
				sizeC = (String) item[2];
				priceC = (Double) item[3];
				stocksC = (Integer) item[4];

				System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						item[0], item[1], item[2], item[3], item[4]);
				break;

			}

		}

	}

	public void getVegetables(int id) {

		for (Object[] item : vegetables) {

			int base = (Integer) item[0];

			if (base == id) {
				idC = (Integer) item[0];
				nameC = (String) item[1];
				sizeC = (String) item[2];
				priceC = (Double) item[3];
				stocksC = (Integer) item[4];

				System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						item[0], item[1], item[2], item[3], item[4]);
				break;

			}

		}

	}

	public void getSnacks(int id) {

		for (Object[] item : snacks) {

			int base = (Integer) item[0];

			if (base == id) {
				idC = (Integer) item[0];
				nameC = (String) item[1];
				sizeC = (String) item[2];
				priceC = (Double) item[3];
				stocksC = (Integer) item[4];

				System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						item[0], item[1], item[2], item[3], item[4]);
				break;

			}

		}

	}

	public void getDairy(int id) {

		for (Object[] item : dairy) {

			int base = (Integer) item[0];

			if (base == id) {
				idC = (Integer) item[0];
				nameC = (String) item[1];
				sizeC = (String) item[2];
				priceC = (Double) item[3];
				stocksC = (Integer) item[4];

				System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						item[0], item[1], item[2], item[3], item[4]);
				break;

			}

		}

	}

	public void getBeverages(int id) {

		for (Object[] item : beverages) {

			int base = (Integer) item[0];

			if (base == id) {
				idC = (Integer) item[0];
				nameC = (String) item[1];
				sizeC = (String) item[2];
				priceC = (Double) item[3];
				stocksC = (Integer) item[4];

				System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						item[0], item[1], item[2], item[3], item[4]);
				break;

			}

		}

	}

	public void getCosmetics(int id) {

		for (Object[] item : cosmetics) {

			int base = (Integer) item[0];

			if (base == id) {
				idC = (Integer) item[0];
				nameC = (String) item[1];
				sizeC = (String) item[2];
				priceC = (Double) item[3];
				stocksC = (Integer) item[4];

				System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						item[0], item[1], item[2], item[3], item[4]);
				break;

			}

		}

	}

	public void getHousehold(int id) {

		for (Object[] item : household) {

			int base = (Integer) item[0];

			if (base == id) {
				idC = (Integer) item[0];
				nameC = (String) item[1];
				sizeC = (String) item[2];
				priceC = (Double) item[3];
				stocksC = (Integer) item[4];

				System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						item[0], item[1], item[2], item[3], item[4]);
				break;

			}

		}

	}

	public void getClothes(int id) {

		for (Object[] item : clothes) {

			int base = (Integer) item[0];

			if (base == id) {
				idC = (Integer) item[0];
				nameC = (String) item[1];
				sizeC = (String) item[2];
				priceC = (Double) item[3];
				stocksC = (Integer) item[4];

				System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						item[0], item[1], item[2], item[3], item[4]);
				break;

			}

		}

	}

	public void getNewArrivals(int id) {

		for (Object[] item : newItems) {

			int base = (Integer) item[0];

			if (base == id) {
				idC = (Integer) item[0];
				nameC = (String) item[1];
				sizeC = (String) item[2];
				priceC = (Double) item[3];
				stocksC = (Integer) item[4];

				System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						item[0], item[1], item[2], item[3], item[4]);
				break;

			}

		}

	}

	// FIND PRODUCT FROM THE GROCERY LIST
	public Object[] findProductInAllLists(int targetId) {
		// A single list of all your category lists
		List<ArrayList<Object[]>> allCategories = List.of(
				fruits, vegetables, snacks, dairy, beverages,
				cosmetics, household, clothes, newItems);

		for (ArrayList<Object[]> categoryList : allCategories) {
			for (Object[] item : categoryList) {
				// Compare the ID (first element) with the targetId
				if (((Integer) item[0]).intValue() == targetId) {
					return item; // Found the matching product array, return it
				}
			}
		}

		return null; // If the loop finishes without finding anything
	}

	// UPDATE PRODUCT FROM THE GROCERY LIST
	public void updateProductInAllLists(int id, String name, String size, double price, int stock) {
		if (id >= 1 && id <= 10) {

			System.out.println("");

			System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

			for (Object[] a : fruits) {
				if (id == (Integer) a[0]) {
					a[1] = name;
					a[2] = size;
					a[3] = price;
					a[4] = stock;
				}
				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						a[0], a[1], a[2], a[3], a[4]);
			}

			System.out.println("");
		} else if (id >= 11 && id <= 20) {

			System.out.println("");

			System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

			for (Object[] a : vegetables) {
				if (id == (Integer) a[0]) {
					a[1] = name;
					a[2] = size;
					a[3] = price;
					a[4] = stock;
				}
				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						a[0], a[1], a[2], a[3], a[4]);
			}

			System.out.println("");
		} else if (id >= 21 && id <= 30) {

			System.out.println("");

			System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

			for (Object[] a : snacks) {
				if (id == (Integer) a[0]) {
					a[1] = name;
					a[2] = size;
					a[3] = price;
					a[4] = stock;
				}
				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						a[0], a[1], a[2], a[3], a[4]);
			}

			System.out.println("");
		} else if (id >= 31 && id <= 40) {

			System.out.println("");

			System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

			for (Object[] a : dairy) {
				if (id == (Integer) a[0]) {
					a[1] = name;
					a[2] = size;
					a[3] = price;
					a[4] = stock;
				}
				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						a[0], a[1], a[2], a[3], a[4]);
			}

			System.out.println("");
		} else if (id >= 41 && id <= 50) {

			System.out.println("");

			System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

			for (Object[] a : beverages) {
				if (id == (Integer) a[0]) {
					a[1] = name;
					a[2] = size;
					a[3] = price;
					a[4] = stock;
				}
				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						a[0], a[1], a[2], a[3], a[4]);
			}

			System.out.println("");
		} else if (id >= 51 && id <= 60) {

			System.out.println("");

			System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

			for (Object[] a : cosmetics) {
				if (id == (Integer) a[0]) {
					a[1] = name;
					a[2] = size;
					a[3] = price;
					a[4] = stock;
				}
				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						a[0], a[1], a[2], a[3], a[4]);
			}

			System.out.println("");
		} else if (id >= 61 && id <= 70) {

			System.out.println("");

			System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

			for (Object[] a : household) {
				if (id == (Integer) a[0]) {
					a[1] = name;
					a[2] = size;
					a[3] = price;
					a[4] = stock;
				}
				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						a[0], a[1], a[2], a[3], a[4]);
			}

			System.out.println("");
		} else if (id >= 71 && id <= 80) {

			System.out.println("");

			System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

			for (Object[] a : clothes) {
				if (id == (Integer) a[0]) {
					a[1] = name;
					a[2] = size;
					a[3] = price;
					a[4] = stock;
				}
				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						a[0], a[1], a[2], a[3], a[4]);
			}

			System.out.println("");
		} else if (id >= 81 && id <= 100) {

			System.out.println("");

			System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

			for (Object[] a : newItems) {
				if (id == (Integer) a[0]) {
					a[1] = name;
					a[2] = size;
					a[3] = price;
					a[4] = stock;
				}
				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						a[0], a[1], a[2], a[3], a[4]);
			}

			System.out.println("");
		}

	}

	// DELETE PRODUCT FROM THE GROCERY LIST
	public void deleteProductInAllLists(int id, String name, String size, double price, int stock) {
		if (id >= 1 && id <= 10) {

			boolean check = false;

			System.out.println("");

			Iterator<Object[]> iterator = fruits.iterator();
			while (iterator.hasNext()) {

				Object[] item = iterator.next();

				if (id == (Integer) item[0]) {
					iterator.remove(); // safely remove during iteration

					System.out.println("--------------------------------------------------");
					System.out.println("");
					System.out.println(item[1] + " has been deleted successfully!");
					System.out.println("");
					System.out.println("--------------------------------------------------");

					check = true;
					break;

				} else {

					check = false;
				}

			}

			if (check == false) {

				System.out.println("--------------------------------------------------");
				System.out.println("");
				System.out.println("Item with ID " + id + " not found.");
				System.out.println("");
				System.out.println("--------------------------------------------------");
			}

			System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

			for (Object[] a : fruits) {
				if (id == (Integer) a[0]) {
					a[1] = name;
					a[2] = size;
					a[3] = price;
					a[4] = stock;
				}
				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						a[0], a[1], a[2], a[3], a[4]);
			}

			System.out.println("");

		} else if (id >= 11 && id <= 20) {

			boolean check = false;

			System.out.println("");

			Iterator<Object[]> iterator = vegetables.iterator();
			while (iterator.hasNext()) {

				Object[] item = iterator.next();

				if (id == (Integer) item[0]) {
					iterator.remove(); // safely remove during iteration

					System.out.println("--------------------------------------------------");
					System.out.println("");
					System.out.println(item[1] + " has been deleted successfully!");
					System.out.println("");
					System.out.println("--------------------------------------------------");

					check = true;
					break;

				} else {

					check = false;
				}

			}

			if (check == false) {

				System.out.println("--------------------------------------------------");
				System.out.println("");
				System.out.println("Item with ID " + id + " not found.");
				System.out.println("");
				System.out.println("--------------------------------------------------");
			}

			System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

			for (Object[] a : fruits) {
				if (id == (Integer) a[0]) {
					a[1] = name;
					a[2] = size;
					a[3] = price;
					a[4] = stock;
				}
				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						a[0], a[1], a[2], a[3], a[4]);
			}

			System.out.println("");

		} else if (id >= 21 && id <= 30) {

			boolean check = false;

			System.out.println("");

			Iterator<Object[]> iterator = snacks.iterator();
			while (iterator.hasNext()) {

				Object[] item = iterator.next();

				if (id == (Integer) item[0]) {
					iterator.remove(); // safely remove during iteration

					System.out.println("--------------------------------------------------");
					System.out.println("");
					System.out.println(item[1] + " has been deleted successfully!");
					System.out.println("");
					System.out.println("--------------------------------------------------");

					check = true;
					break;

				} else {

					check = false;
				}

			}

			if (check == false) {

				System.out.println("--------------------------------------------------");
				System.out.println("");
				System.out.println("Item with ID " + id + " not found.");
				System.out.println("");
				System.out.println("--------------------------------------------------");
			}

			System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

			for (Object[] a : fruits) {
				if (id == (Integer) a[0]) {
					a[1] = name;
					a[2] = size;
					a[3] = price;
					a[4] = stock;
				}
				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						a[0], a[1], a[2], a[3], a[4]);
			}

			System.out.println("");

		} else if (id >= 31 && id <= 40) {

			boolean check = false;

			System.out.println("");

			Iterator<Object[]> iterator = dairy.iterator();
			while (iterator.hasNext()) {

				Object[] item = iterator.next();

				if (id == (Integer) item[0]) {
					iterator.remove(); // safely remove during iteration

					System.out.println("--------------------------------------------------");
					System.out.println("");
					System.out.println(item[1] + " has been deleted successfully!");
					System.out.println("");
					System.out.println("--------------------------------------------------");

					check = true;
					break;

				} else {

					check = false;
				}

			}

			if (check == false) {

				System.out.println("--------------------------------------------------");
				System.out.println("");
				System.out.println("Item with ID " + id + " not found.");
				System.out.println("");
				System.out.println("--------------------------------------------------");
			}

			System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

			for (Object[] a : fruits) {
				if (id == (Integer) a[0]) {
					a[1] = name;
					a[2] = size;
					a[3] = price;
					a[4] = stock;
				}
				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						a[0], a[1], a[2], a[3], a[4]);
			}

			System.out.println("");

		} else if (id >= 41 && id <= 50) {

			boolean check = false;

			System.out.println("");

			Iterator<Object[]> iterator = beverages.iterator();
			while (iterator.hasNext()) {

				Object[] item = iterator.next();

				if (id == (Integer) item[0]) {
					iterator.remove(); // safely remove during iteration

					System.out.println("--------------------------------------------------");
					System.out.println("");
					System.out.println(item[1] + " has been deleted successfully!");
					System.out.println("");
					System.out.println("--------------------------------------------------");

					check = true;
					break;

				} else {

					check = false;
				}

			}

			if (check == false) {

				System.out.println("--------------------------------------------------");
				System.out.println("");
				System.out.println("Item with ID " + id + " not found.");
				System.out.println("");
				System.out.println("--------------------------------------------------");
			}

			System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

			for (Object[] a : fruits) {
				if (id == (Integer) a[0]) {
					a[1] = name;
					a[2] = size;
					a[3] = price;
					a[4] = stock;
				}
				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						a[0], a[1], a[2], a[3], a[4]);
			}

			System.out.println("");

		} else if (id >= 51 && id <= 60) {

			boolean check = false;

			System.out.println("");

			Iterator<Object[]> iterator = cosmetics.iterator();
			while (iterator.hasNext()) {

				Object[] item = iterator.next();

				if (id == (Integer) item[0]) {
					iterator.remove(); // safely remove during iteration

					System.out.println("--------------------------------------------------");
					System.out.println("");
					System.out.println(item[1] + " has been deleted successfully!");
					System.out.println("");
					System.out.println("--------------------------------------------------");

					check = true;
					break;

				} else {

					check = false;
				}

			}

			if (check == false) {

				System.out.println("--------------------------------------------------");
				System.out.println("");
				System.out.println("Item with ID " + id + " not found.");
				System.out.println("");
				System.out.println("--------------------------------------------------");
			}

			System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

			for (Object[] a : fruits) {
				if (id == (Integer) a[0]) {
					a[1] = name;
					a[2] = size;
					a[3] = price;
					a[4] = stock;
				}
				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						a[0], a[1], a[2], a[3], a[4]);
			}

			System.out.println("");

		} else if (id >= 61 && id <= 70) {

			boolean check = false;

			System.out.println("");

			Iterator<Object[]> iterator = household.iterator();
			while (iterator.hasNext()) {

				Object[] item = iterator.next();

				if (id == (Integer) item[0]) {
					iterator.remove(); // safely remove during iteration

					System.out.println("--------------------------------------------------");
					System.out.println("");
					System.out.println(item[1] + " has been deleted successfully!");
					System.out.println("");
					System.out.println("--------------------------------------------------");

					check = true;
					break;

				} else {

					check = false;
				}

			}

			if (check == false) {

				System.out.println("--------------------------------------------------");
				System.out.println("");
				System.out.println("Item with ID " + id + " not found.");
				System.out.println("");
				System.out.println("--------------------------------------------------");
			}

			System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

			for (Object[] a : fruits) {
				if (id == (Integer) a[0]) {
					a[1] = name;
					a[2] = size;
					a[3] = price;
					a[4] = stock;
				}
				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						a[0], a[1], a[2], a[3], a[4]);
			}

			System.out.println("");

		} else if (id >= 71 && id <= 80) {

			boolean check = false;

			System.out.println("");

			Iterator<Object[]> iterator = clothes.iterator();
			while (iterator.hasNext()) {

				Object[] item = iterator.next();

				if (id == (Integer) item[0]) {
					iterator.remove(); // safely remove during iteration

					System.out.println("--------------------------------------------------");
					System.out.println("");
					System.out.println(item[1] + " has been deleted successfully!");
					System.out.println("");
					System.out.println("--------------------------------------------------");

					check = true;
					break;

				} else {

					check = false;
				}

			}

			if (check == false) {

				System.out.println("--------------------------------------------------");
				System.out.println("");
				System.out.println("Item with ID " + id + " not found.");
				System.out.println("");
				System.out.println("--------------------------------------------------");
			}

			System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

			for (Object[] a : fruits) {
				if (id == (Integer) a[0]) {
					a[1] = name;
					a[2] = size;
					a[3] = price;
					a[4] = stock;
				}
				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						a[0], a[1], a[2], a[3], a[4]);
			}

			System.out.println("");

		} else if (id >= 81 && id <= 100) {

			boolean check = false;

			System.out.println("");

			Iterator<Object[]> iterator = newItems.iterator();
			while (iterator.hasNext()) {

				Object[] item = iterator.next();

				if (id == (Integer) item[0]) {
					iterator.remove(); // safely remove during iteration

					System.out.println("--------------------------------------------------");
					System.out.println("");
					System.out.println(item[1] + " has been deleted successfully!");
					System.out.println("");
					System.out.println("--------------------------------------------------");

					check = true;
					break;

				} else {

					check = false;
				}

			}

			if (check == false) {

				System.out.println("--------------------------------------------------");
				System.out.println("");
				System.out.println("Item with ID " + id + " not found.");
				System.out.println("");
				System.out.println("--------------------------------------------------");
			}

			System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

			for (Object[] a : fruits) {
				if (id == (Integer) a[0]) {
					a[1] = name;
					a[2] = size;
					a[3] = price;
					a[4] = stock;
				}
				System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
						a[0], a[1], a[2], a[3], a[4]);
			}

			System.out.println("");

		}

	}

}