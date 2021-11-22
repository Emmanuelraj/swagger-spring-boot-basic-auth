package in.keepgrowing.springbootswaggeruibasicauth.product;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
@Schema(name = "Product")
public class ProductDto {

    private UUID id;
    private String name;
    private String color;
    private String ean;
    private String countryOfOrigin;
    private String price;
    private int availableQuantity;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getEan() {
		return ean;
	}
	public void setEan(String ean) {
		this.ean = ean;
	}
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getAvailableQuantity() {
		return availableQuantity;
	}
	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	public ProductDto(UUID id, String name, String color, String ean, String countryOfOrigin, String price,
			int availableQuantity) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.ean = ean;
		this.countryOfOrigin = countryOfOrigin;
		this.price = price;
		this.availableQuantity = availableQuantity;
	}
	
	
    
    
}
