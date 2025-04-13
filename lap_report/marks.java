import java.util.*;

class MarksManager {
    ArrayList<Integer> marks = new ArrayList<>();

    public void addMark(int mark) {
        marks.add(mark);
    }

    public void displayMarks() {
        if (marks.isEmpty()) {
            System.out.println("No marks to display.");
        } else {
            System.out.println("Marks: " + marks);
        }
    }

    public void updateMark(int index, int newMark) {
        if (index >= 0 && index < marks.size()) {
            marks.set(index, newMark);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void removeMark(int index) {
        if (index >= 0 && index < marks.size()) {
            marks.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void removeMark(Integer value) {
        if (marks.contains(value)) {
            marks.remove(value);
        } else {
            System.out.println("Mark not found.");
        }
    }

    public double calculateAverage() {
        if (marks.isEmpty())
            return 0.0;
        int sum = 0;
        for (int mark : marks)
            sum += mark;
        return (double) sum / marks.size();
    }

    public boolean searchMark(int mark) {
        return marks.contains(mark);
    }

    public int getMaxMark() {
        return marks.isEmpty() ? -1 : Collections.max(marks);
    }

    public int getMinMark() {
        return marks.isEmpty() ? -1 : Collections.min(marks);
    }

    public void sortAscending() {
        Collections.sort(marks);
    }

    public void sortDescending() {
        marks.sort(Collections.reverseOrder());
    }
}

public class marks {
    public static void main(String[] args) {
        MarksManager m = new MarksManager();

        m.addMark(85);
        m.addMark(90);
        m.addMark(75);

        m.displayMarks();

        m.updateMark(1, 95);
        m.displayMarks();

        m.removeMark(Integer.valueOf(75));
        m.displayMarks();

        System.out.println("Average: " + m.calculateAverage());

        System.out.println("Max: " + m.getMaxMark());
        System.out.println("Min: " + m.getMinMark());

        System.out.println("Mark 95 found? " + (m.searchMark(95) ? "Yes" : "No"));

        m.sortAscending();
        System.out.print("Ascending: ");
        m.displayMarks();

        m.sortDescending();
        System.out.print("Descending: ");
        m.displayMarks();

        m.removeMark(10);
        MarksManager empty = new MarksManager();
        System.out.println("Empty average: " + empty.calculateAverage());
    }
}
