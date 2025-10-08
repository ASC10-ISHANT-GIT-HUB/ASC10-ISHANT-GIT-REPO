# A dictionary is a collection of key-value pairs, where each key is unique and maps to a value. 
# Dictionaries are defined using curly braces {} with key-value pairs separated by commas. 
# Each key is separated from its value by a colon (:).

#Product Catalog: Each key is a product ID, and the value is another dictionary containing product details.
# A simple dictionary to store product information
product = {
    "name": "Wireless Mouse",
    "price": 25.99,
    "stock": 12,
}

print(f"Product Name: {product['name']}")
print(f"Product Price: ${product['price']}")
print(f"Product Stock: {product['stock']} units")

catalog = {
    "P001": {"name": "Wireless Mouse", "price": 25.99, "stock": 12},
    "P002": {"name": "Keyboard", "price": 45.00, "stock": 7},
    "P003": {"name": "Monitor", "price": 150.75, "stock": 5},
}

#1. Access product details 
print(catalog["P001"])  #woreless mouse
print(catalog["P001"]["price"])  #25.5

#2. Update stock after a purchase
product_id = "P002"
quantity_bought = 2
catalog[product_id]["stock"] -= quantity_bought
print(f"Updated stock for {catalog[product_id]['name']}: {catalog[product_id]['stock']} units")

#3. Add a new product to the catalog
catalog["P004"] = {"name": "USB-C Hub", "price": 34.99, "stock": 20}

#4.Loop through the catalog and print product details
for pid, details in catalog.items():
    print(f"Product ID: {pid}, Name: {details['name']}, Price: ${details['price']}, Stock: {details['stock']} units")