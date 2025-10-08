class Room:
    def __init__(self, identifier, max_capacity, floor):
        self.identifier = identifier
        self.max_capacity = max_capacity
        self.floor = floor

    def __repr__(self):
        return f"Room {self.identifier} | Capacity: {self.max_capacity} | Floor: {self.floor}"

class ZoomRoom(Room):
    def __init__(self, identifier, max_capacity, floor, device_id, account_id):
        super().__init__(identifier, max_capacity, floor)
        self.device_id = device_id
        self.account_id = account_id

    def __repr__(self):
        base = super().__repr__()
        return f"{base} | Zoom Device: {self.device_id} | Zoom Account: {self.account_id}"

class Reservation:
    bookings_by_date = {}

    def __init__(self, employee_id, room, date, start_time, length_minutes):
        self.employee_id = employee_id
        self.room = room
        self.date = date
        self.start_time = start_time
        self.length_minutes = length_minutes

        if date not in Reservation.bookings_by_date:
            Reservation.bookings_by_date[date] = []
        Reservation.bookings_by_date[date].append(self)

    def __repr__(self):
        return (f"Reservation for {self.room.identifier} on {self.date} at {self.start_time} "
                f"for {self.length_minutes} minutes by Employee {self.employee_id}")

    @classmethod
    def get_reservations_for_date(cls, date):
        return cls.bookings_by_date.get(date, [])

def input_room():
    room_type = input("Is the room Zoom-enabled? (yes/no): ").strip().lower()
    room_id = input("Enter room ID: ")
    capacity = int(input("Enter room capacity: "))
    floor_loc = input("Enter floor location: ")

    if room_type == 'yes':
        zoom_device = input("Zoom device ID: ")
        zoom_account = input("Zoom account ID: ")
        return ZoomRoom(room_id, capacity, floor_loc, zoom_device, zoom_account)
    else:
        return Room(room_id, capacity, floor_loc)

def input_reservation(room_list):
    emp_id = input("Employee ID: ")
    meeting_date = input("Date (YYYY-MM-DD): ")
    meeting_start = input("Start time (HH:MM): ")
    duration = int(input("Duration (minutes): "))

    print("\nRooms available:")
    for idx, rm in enumerate(room_list, start=1):
        print(f"{idx}. {rm}")

    choice = int(input("Choose a room by number: "))
    chosen_room = room_list[choice - 1]

    res = Reservation(emp_id, chosen_room, meeting_date, meeting_start, duration)
    print("\nReservation confirmed:")
    print(res)

def show_reservations():
    date = input("Enter date to check reservations (YYYY-MM-DD): ")
    reservations = Reservation.get_reservations_for_date(date)
    if not reservations:
        print("No reservations for that date.")
    else:
        print(f"Reservations for {date}:")
        for r in reservations:
            print(r)

if __name__ == "__main__":
    rooms = []

    print("Add meeting rooms:")
    while True:
        rooms.append(input_room())
        if input("Add another room? (y/n): ").strip().lower() != 'y':
            break

    print("\nCreate bookings:")
    while True:
        input_reservation(rooms)
        if input("Add another booking? (y/n): ").strip().lower() != 'y':
            break

    print("\nView bookings by date:")
    while True:
        show_reservations()
        if input("Check another date? (y/n): ").strip().lower() != 'y':
            print("Exiting program.")
            break
