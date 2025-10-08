#VARIABLES
## naming convention for python is Sanke Case (e.g. sanke_case)
## avoid reserved keywords and special characters
store_name = "ShopEase"
welcome_message = f"welcome to {store_name} - Your Online Marketplace!"
print(welcome_message)

item_count = 150 #integer
item_price = 29.99 #float
is_available = True #boolean
item_description = "A versatile gadget for everyday use" #string
item_tags = {"gadget", "electronics", "utility"} #list
item_details = {"brand": "TechCrop", "warranty": "2 years"} #Dictionary
item_id = None #none type
item_code = b'\x54\x45\x43' #bytes
item_dimensions = (10.5, 7.2, 1.3) #tuple
item_colors = {"red", "blue", "green"} #set
print(f"Item Details: {item_details}")
print(f"Item Dimensions: {item_dimensions}")
print(f"Item Colors: {item_colors}")
print(f"Item Code (bytes): {item_code}")
print(f"Item ID: {item_id}")
print(f"Item Tags: {item_tags}")
print(f"Is Item Available: {is_available}")
print(f"Item Price: ${item_price}")
print(f"Item Count: {item_count}")
print(f"Item Description: {item_description}")

#Demonstrating type conversion
total_cost = item_count * item_price #float
total_cost_str = str(total_cost) #converting float to string
print(f"Total Cost for {item_count} items: ${total_cost_str}")
#converting string to float
item_count_str = "200"
item_count_int = int(item_count_str) #converting string to integer
print(f"Converted Item Count: {item_count_int}")
#converting integer to float
item_count_float = float(item_count) #converting integer to float
print(f"Item Count as Float: {item_count_float}")

#the list of conversion functions in python are:
# int() - converts to integer
# float() - converts to float
# str() - converts to string
# list() - converts to list
# tuple() - converts to tuple
# set() - converts to set
# dict() - converts to dictionary
# bytes() - converts to bytes
# bool() - converts to boolean

