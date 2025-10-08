def count_words(input_string):
    words = input_string.split()
    return len(words)

# --- Example Usage ---
sentence = "Sum of 12 and 20 is 32"
word_count = count_words(sentence)

print(f"Input: \"{sentence}\"")
print(f"Output: {word_count}")

sentence2 = "Python is a versatile language."
print(f"\nInput: \"{sentence2}\"")
print(f"Output: {count_words(sentence2)}")
