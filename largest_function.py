def find_maximum(num1, num2, num3):
    return max(num1, num2, num3)

a = float(input("Enter first number: "))
b = float(input("Enter second number: "))
c = float(input("Enter third number: "))

print(f"The biggest number is: {find_maximum(a, b, c)}")
