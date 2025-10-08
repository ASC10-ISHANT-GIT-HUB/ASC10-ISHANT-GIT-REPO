#control flow & functions
def add_to_cart(cart, item, quantity=1):
    if item in cart:
        cart[item] += quantity
    else:
        cart[item] = quantity

def print_cart(cart):
        print("Your cart contains:")
        for item, quantity in cart.items():
            print(f"{item}: {quantity}")

def apply_discount(price, discount):
    if 0 < discount < 100:
        return price * (1 - discount / 100)
    else:
        return price
    
cart={}
add_to_cart(cart, "apple", 3)
add_to_cart(cart, "banana")
add_to_cart(cart, "laptop", 2)
add_to_cart(cart, 'unknown_item', 5) #will be skipped in discount

print_cart(cart)