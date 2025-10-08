#Simple Calculator: add, subtract, multiply, divide two numbers
def simple_calculator(x, y):
    #print the result of addition
    print(f"Adding {x} + {y} = {x + y}")
    #print the result of subtraction
    print(f"Subtracting {x} - {y} = {x - y}")
    #print the result of multiplication
    print(f"Multiplying {x} * {y} = {x * y}")
    #print the result of division
    if y != 0:
        print(f"Dividing {x} / {y} = {x / y}")
    else:
        print("Division by zero is undefined.")

#use a try-except block to handle invalid inputs
#the try block will attempt to execute the code
try:
    #take two numbers as input from the user
    num1 = float(input("Enter first number: "))
    num2 = float(input("Enter second number: "))
    #call the simple_calculator function with the user inputs
#catch any excaption that occurs and print an error message
except ValueError:
    print("Invalid input. Please enter numeric values.")
    exit(1)

simple_calculator(num1, num2)