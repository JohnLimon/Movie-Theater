public class MovieTheatre {
    private String[][] seats = null;

    // Setting up a two-dimensional array for theatre seating
    public MovieTheatre(int numberOfRows, int numberOfCols) {
        this.seats = new String [numberOfRows][numberOfCols];
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[0].length; col++) {
                seats[row][col] = "O"; // "O" indicates the seat is "open" or available
            }
        }
    }

    public void displaySeating() {
        for (int row = 1; row < seats.length; row++) {
            for (int col = 1; col < seats[row].length; col++) {
                System.out.print(seats[row][col] + " ");
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }

    public void reserveSeat(int row, int col) {
        try {
            if (seats[row][col].equals("O")) {
                seats[row][col] = "X";
                System.out.println("Your seat at row " + row + " aisle " + col + " has been successfully reserved");
                System.out.println();
            } else {
                System.out.println("This seat is already occupied, please select a different seat");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please select a seat within the displayed options");
        }
    }

    public static void main(String[] args) {
        MovieTheatre movieTheatre = new MovieTheatre(10,10);
        movieTheatre.reserveSeat(5,3);
        movieTheatre.displaySeating();
        System.out.println();
        movieTheatre.reserveSeat(5,3);
    }
}
