class ArrayStore:
    def __init__(self):
        """Initializes an empty list to store integers."""
        self.data = []

    def accept_integers(self):
        """Accepts 10 integers from the user and stores them."""
        print("Please enter 10 integers, one at a time.")
        while len(self.data) < 10:
            try:
                num = int(input(f"Enter number {len(self.data) + 1}: "))
                self.data.append(num)
            except ValueError:
                print("Invalid input. Please enter an integer.")

    def display_with_for(self):
        """Displays all elements using a for loop."""
        print("\n--- Displaying with for loop ---")
        if not self.data:
            print("The list is empty.")
            return
        for item in self.data:
            print(item, end=" ")
        print()

    def display_with_while(self):
        """Displays all elements using a while loop."""
        print("\n--- Displaying with while loop ---")
        if not self.data:
            print("The list is empty.")
            return
        i = 0
        while i < len(self.data):
            print(self.data[i], end=" ")
            i += 1
        print()

    def sort_list(self):
        """Sorts the list in ascending order."""
        self.data.sort()
        print("\nList has been sorted in ascending order.")

    def count_occurrences(self, number):
        """Returns how many times a number appears in the list."""
        count = self.data.count(number)
        print(f"\nThe number {number} appears {count} time(s).")
        return count

    def insert_at_position(self, number, position):
        """Inserts a number at a specific position."""
        if 0 <= position <= len(self.data):
            self.data.insert(position, number)
            print(f"\nInserted {number} at position {position}.")
        else:
            print(f"Error: Position {position} is out of bounds.")

    def get_unique_elements(self):
        """Returns a new list containing only unique elements."""
        unique_list = list(set(self.data))
        print("\n--- Unique Elements ---")
        print(unique_list)
        return unique_list

# --- Main Execution ---
if __name__ == "__main__":
    store = ArrayStore()

    # 1. Accept 10 integers
    store.accept_integers()

    # 2. Display elements
    store.display_with_for()
    store.display_with_while()

    # 3. Sort the list
    store.sort_list()
    store.display_with_for()

    # 4. Count occurrences
    num_to_find = int(input("\nEnter a number to count its occurrences: "))
    store.count_occurrences(num_to_find)

    # 5. Insert a number
    num_to_insert = int(input("\nEnter a number to insert: "))
    pos_to_insert = int(input(f"Enter the position to insert {num_to_insert}: "))
    store.insert_at_position(num_to_insert, pos_to_insert)
    store.display_with_for()

    # 6. Get unique elements
    store.get_unique_elements()