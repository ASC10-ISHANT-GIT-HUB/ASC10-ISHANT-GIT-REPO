import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Base class for Meeting Rooms
abstract class MeetingRoom {
    private String id;
    private int capacity;
    private int floor;

    public MeetingRoom(String id, int capacity, int floor) {
        this.id = id;
        this.capacity = capacity;
        this.floor = floor;
    }

    public String getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFloor() {
        return floor;
    }

    public abstract boolean hasZoomFacility();
}

// Meeting Room with Zoom
class ZoomMeetingRoom extends MeetingRoom {
    private String zoomDeviceId;
    private String zoomAccountId;

    public ZoomMeetingRoom(String id, int capacity, int floor, String zoomDeviceId, String zoomAccountId) {
        super(id, capacity, floor);
        this.zoomDeviceId = zoomDeviceId;
        this.zoomAccountId = zoomAccountId;
    }

    public String getZoomDeviceId() {
        return zoomDeviceId;
    }

    public String getZoomAccountId() {
        return zoomAccountId;
    }

    @Override
    public boolean hasZoomFacility() {
        return true;
    }
}

// Meeting Room without Zoom
class RegularMeetingRoom extends MeetingRoom {
    public RegularMeetingRoom(String id, int capacity, int floor) {
        super(id, capacity, floor);
    }

    @Override
    public boolean hasZoomFacility() {
        return false;
    }
}

// Booking class
class Booking {
    private String employeeId;
    private String meetingRoomId;
    private LocalDate meetingDate;
    private LocalTime meetingTime;
    private int durationMinutes;  // duration in minutes

    public Booking(String employeeId, String meetingRoomId, LocalDate meetingDate, LocalTime meetingTime, int durationMinutes) {
        this.employeeId = employeeId;
        this.meetingRoomId = meetingRoomId;
        this.meetingDate = meetingDate;
        this.meetingTime = meetingTime;
        this.durationMinutes = durationMinutes;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getMeetingRoomId() {
        return meetingRoomId;
    }

    public LocalDate getMeetingDate() {
        return meetingDate;
    }

    public LocalTime getMeetingTime() {
        return meetingTime;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "employeeId='" + employeeId + '\'' +
                ", meetingRoomId='" + meetingRoomId + '\'' +
                ", meetingDate=" + meetingDate +
                ", meetingTime=" + meetingTime +
                ", durationMinutes=" + durationMinutes +
                '}';
    }
}

// Manager to handle rooms and bookings
class MeetingRoomManager {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();

    // Add meeting room
    public void addMeetingRoom(MeetingRoom room) {
        meetingRooms.add(room);
    }

    // Book a meeting room
    public boolean bookRoom(String employeeId, String meetingRoomId, LocalDate date, LocalTime time, int duration) {
        // Check if room exists
        MeetingRoom room = findRoomById(meetingRoomId);
        if (room == null) {
            System.out.println("Meeting room not found");
            return false;
        }

        // Check for conflicting bookings
        boolean conflict = bookings.stream()
                .anyMatch(b -> b.getMeetingRoomId().equals(meetingRoomId) &&
                        b.getMeetingDate().equals(date) &&
                        timeConflict(b.getMeetingTime(), b.getDurationMinutes(), time, duration));

        if (conflict) {
            System.out.println("Booking conflict detected.");
            return false;
        }

        Booking booking = new Booking(employeeId, meetingRoomId, date, time, duration);
        bookings.add(booking);
        System.out.println("Booking successful: " + booking);
        return true;
    }

    private boolean timeConflict(LocalTime start1, int duration1, LocalTime start2, int duration2) {
        LocalTime end1 = start1.plusMinutes(duration1);
        LocalTime end2 = start2.plusMinutes(duration2);

        // Check if times overlap
        return !(end1.isBefore(start2) || end2.isBefore(start1));
    }

    public MeetingRoom findRoomById(String id) {
        return meetingRooms.stream()
                .filter(room -> room.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Get bookings for a specific date
    public List<Booking> getBookingsByDate(LocalDate date) {
        return bookings.stream()
                .filter(b -> b.getMeetingDate().equals(date))
                .collect(Collectors.toList());
    }
}

// Example usage
public class MeetingRoomAppQ1 {
    public static void main(String[] args) {
        MeetingRoomManager manager = new MeetingRoomManager();

        // Add meeting rooms
        manager.addMeetingRoom(new ZoomMeetingRoom("Z101", 10, 5, "ZD1001", "ZA123"));
        manager.addMeetingRoom(new RegularMeetingRoom("R201", 8, 3));

        // Make bookings
        manager.bookRoom("E001", "Z101", LocalDate.of(2025, 9, 26), LocalTime.of(10, 0), 60);
        manager.bookRoom("E002", "R201", LocalDate.of(2025, 9, 26), LocalTime.of(11, 0), 30);

        // Try conflicting booking
        manager.bookRoom("E003", "Z101", LocalDate.of(2025, 9, 26), LocalTime.of(10, 30), 30);

        // Get bookings for a date
        List<Booking> bookings = manager.getBookingsByDate(LocalDate.of(2025, 9, 26));
        System.out.println("Bookings on 2025-09-26:");
        bookings.forEach(System.out::println);
    }
}
