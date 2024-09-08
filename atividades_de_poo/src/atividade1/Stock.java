package atividade1;
import java.util.ArrayList;
import java.util.Optional;
import java.util.List;

public class Stock {
	List<Product> stock = new ArrayList<>();
	double totalMoney = 0;
	
	public Stock(String productName, double productPrice, double totalMoney) {
		Product product = new Product(productName, productPrice);
		stock.add(product);
		this.totalMoney = totalMoney;
	}
	
	public void buyItem(String itemName, double itemPrice, int itemAmount) {
		Optional<Product> foundProduct = this.getStockItem(itemName);
		double totalCost = itemPrice * itemAmount;
		if(this.totalMoney >= totalCost) {
			if(foundProduct.isPresent()) {
				
					Product currentProduct = foundProduct.get();
					currentProduct.setName(itemName);
					currentProduct.setPrice(itemPrice);
					currentProduct.addItems(itemAmount);	
					this.totalMoney -= totalCost;
			} else {
				Product newProduct = new Product(itemName, itemPrice);
				newProduct.addItems(itemAmount - 1);
				stock.add(newProduct);
			}
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void sellItem(String itemName, int amount) {
		Optional<Product> foundProduct = this.getStockItem(itemName);
		
		if(amount < 0 || amount == 0) {
			System.out.println("Quantidade de itens inválida");
			return;
		}
		
		if(foundProduct.isPresent()) {
			Product currentProduct = foundProduct.get();
			int currentProductAmount = currentProduct.getAmount();				
			
			if(currentProductAmount < amount) {
				System.out.println("Quantidade insuficiente no estoque!");
				return;
			}
			
			currentProduct.removeItems(amount);
			this.totalMoney += currentProduct.getPrice() * amount;
			
			if(currentProduct.getAmount() == 0) {
				stock.removeIf(product -> product.getName() == itemName);
			}
		}
	}
	
	public void showStockItems() {
		for(Product item : stock) {
			System.out.println("Nome " + item.getName());
			System.out.println("Preço " + item.getPrice());
			System.out.println("Quantidade em estoque " + item.getAmount());
			System.out.println("_____________________________");
		}
	}
	
	public Optional<Product> getStockItem(String name) {				
		for(Product currentProduct: stock) {						
			if(currentProduct.name == name) {
				return Optional.of(currentProduct);
			}
		}
		
		return Optional.empty();
	}
	
	public double getStockTotalPrice() {
		if(stock.isEmpty()) {			
			return 0;	
		}
		return stock.stream().map(Product::getPrice).reduce(0.0, Double::sum);		
	}
	
	public double getTotalMoney() {
		return this.totalMoney;
	}
}
