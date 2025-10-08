#string
s= "Hello, World!"
print("original string: ", s)
print("string in uppercase: ", s.upper())
print("string in lowercase: ", s.lower())
print("replace 'World' with 'Python': ", s.replace("World", "Python"))
print("Split string by comma: ", s.split(","))

#numbers
a = 10
b=3
print("a =", a, ", b =", b)
print("Addition: a + b =", a + b)
print("Subtraction: a - b =", a - b)
print("Multiplication: a * b =", a * b)
print("Division: a / b =", a / b)
print("integer division: ", a // b)
print("power: a ** b =", a ** b)

#lists
my_list = [1, 2, 3, 4, 5]
print("original list: ", my_list)
my_list.append(6)
print("after appending 6: ", my_list)
my_list.remove(2)
print("after removing 2: ", my_list)
print("list sliced: ", my_list[1:4])
print("sum of list: ", sum(my_list))

#deep dive: lists
print("\nDeep Dive: Lists")
# List comprehensions
squared = [x**2 for x in my_list]
print("List of squares from 0 to 5: ", squared)

# Sorting
unsorted_list = [5, 2, 9, 1, 5, 6]
print("Unsorted List: ", unsorted_list)
unsorted_list.sort()
print("Sorted List: ", unsorted_list)

#reversing
unsorted_list.reverse()
print("Reversed List: ", unsorted_list)

#indexing and membership
print("Index of 6 in list: ", my_list.index(4))
print("Is 2 in list? ", 2 in my_list)
print("Is 10 in list? ", 10 in my_list)

#copying lists
my_list_copy = my_list.copy()
my_list_copy.append(7)
print("Original List: ", my_list)
print("modified copy: ", my_list_copy)


