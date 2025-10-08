def digits_to_words(number_str):
    digit_words = ["zero", "one", "two", "three", "four", "five", 
                   "six", "seven", "eight", "nine"]
    words = [digit_words[int(d)] for d in number_str]
    print("Digits in words:", ' '.join(words))

user_input = input("Enter a three-digit number: ")

if user_input.isdigit() and len(user_input) == 3:
    digits_to_words(user_input)
else:
    print("Invalid input! Please enter exactly three digits.")
