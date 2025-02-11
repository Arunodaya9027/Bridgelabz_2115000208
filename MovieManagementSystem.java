class Movie {
    String movieTitle;
    String director;
    int yearOfRelease;
    double rating;
    Movie next;
    Movie prev;

    public Movie(String movieTitle, String director, int yearOfRelease, double rating) {
        this.movieTitle = movieTitle;
        this.director = director;        
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        this.next = this.prev = null;
    }
}

class MovieRecord {
    Movie head;
    Movie tail;

    public int sizeOf() {
        if(head == null)
            return 0;
        
        int count = 0;
        Movie temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void addRecordAtBeginning(Movie node) {
        if (head == null)
            head = tail = node;
        else 
            node.next = head;
            head.prev = node;
            head = node;
        System.out.println("Movie Record is added at the Beginning");
    }

    public void addRecordAtEnd(Movie node) {
        if (head == null)
            head = tail = node;
        else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        System.out.println("Movie Record is added at the very end");
    }

    public void addRecordAtMid(Movie node, int position) {
        if(head == null && position > 1) {
            System.out.printf("List is empty, can't insert at %d position\n", position);
            return;
        }
        else if(position == 1) 
            addRecordAtBeginning(node);
        else if(position > sizeOf()+1 || position < 1)
            System.out.printf("Out of Bounds, can't insert at %d position\n", position);
        else {
            if(position <= sizeOf()/2) {
                Movie temp = head;
                int pointer = position - 1;
                while (--pointer > 0) 
                    temp = temp.next;
                node.next = temp.next;
                node.prev = temp;
                temp.next = node;
                node.next.prev = node;
                System.out.printf("Movie Record is added at your Position %d\n", position);
            }
            else {
                Movie temp = tail;
                int pointer = sizeOf();
                while (pointer-- > position) 
                    temp = temp.prev;
                node.next = temp;
                node.prev = temp.prev;
                temp.prev = node;
                node.prev.next = node;
                System.out.printf("Movie Record is added at your Position %d\n", position);
            }
        }
    }

    public void delete(String movieTitle) {
        if (head == null) {
            System.out.println("List is empty");
        }
        else if (head.movieTitle.equals(movieTitle)) {
            head = head.next;
            System.out.println("Movie Record is deleted");
        }
        else {
            Movie temp = head;
            while (temp.next != null) {
                if (temp.next.movieTitle.equals(movieTitle)) {
                    temp.next = temp.next.next;
                    System.out.println("Movie Record is deleted");
                    return;
                }
                temp = temp.next;
            }

            System.out.printf("Movie Record with title %s doesn't exists, can't be deleted\n", movieTitle);
        }
    }

    public void search(String director) {
        if(head == null)
            System.out.println("List is empty");
        else {
            int position = 1;
            Movie temp = head;
            while(temp != null) {
                if(temp.director.equals(director)) {
                    System.out.printf("Movie directed by %s is found at Position %d\n", director, position);
                    return;
                }
                position++;
                temp = temp.next;
            }

            System.out.printf("Movie directed by %s is doesn't exists!\n", director);
        }
    }

    public void search(double rating) {
        if(head == null)
            System.out.println("List is empty");
        else {
            int position = 1;
            Movie temp = head;
            while(temp != null) {
                if(temp.rating == rating) {
                    System.out.printf("Movie with rating %.1f is found at Position %d\n", rating, position);
                    return;
                }
                position++;
                temp = temp.next;
            }

            System.out.printf("Movie with rating %.1f is doesn't exists!\n", rating);
        }
    }

    public void forwardDisplay() {
        Movie temp = head;
        System.out.println();
        while (temp != null) {
            System.out.println("Movie: " + temp.movieTitle);
            System.out.println("Directed By: " + temp.director);
            System.out.println("Year Of Release: " + temp.yearOfRelease);
            System.out.println("Rating: " + temp.rating);
            System.out.println();
            temp = temp.next;
        }
    }

    public void backwardDisplay() {
        Movie temp = tail;
        System.out.println();
        while (temp != null) {
            System.out.println("Movie: " + temp.movieTitle);
            System.out.println("Directed By: " + temp.director);
            System.out.println("Year Of Release: " + temp.yearOfRelease);
            System.out.println("Rating: " + temp.rating);
            System.out.println();
            temp = temp.prev;
        }
    }

    public void update(String movieTitle, double rating) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            Movie temp = head;
            while (temp != null) {
                if(temp.movieTitle.equals(movieTitle)) {
                    temp.rating = rating;
                    System.out.printf("%s Movie Record is updated\n", movieTitle);
                    return;
                }
                temp = temp.next;
            }
            System.out.printf("%s Movie Record is doesn't exists!\n", movieTitle);
        }
    }
}

public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieRecord movieLog = new MovieRecord();
        Movie movie1 = new Movie("Koi Mil Gaya", "Mr. Roshan", 2007, 8.3);
        Movie movie2 = new Movie("Citadel: Hunny Bunny", "Raj & DK", 2024, 7.4);
        Movie movie3 = new Movie("Kalki 2898AD", "Ashwini K.", 2024, 8.7);
        Movie movie4 = new Movie("The Last of Us", "Neil Druckmann", 2023, 9.2);
        Movie movie5 = new Movie("Animal", "S. Reddy Wanga", 2024, 9.0);

        movieLog.addRecordAtBeginning(movie1);
        movieLog.addRecordAtEnd(movie2);
        movieLog.addRecordAtMid(movie3, 3);
        movieLog.addRecordAtBeginning(movie4);
        movieLog.addRecordAtMid(movie5, 4);
        movieLog.forwardDisplay();
        movieLog.backwardDisplay();

        movieLog.search("Mr. Roshan");
        movieLog.search(9.0);
        movieLog.update("Animal", 9.4);
        movieLog.forwardDisplay();
        movieLog.backwardDisplay();

        movieLog.delete("Koi Mil Gaya");
        movieLog.forwardDisplay();
        movieLog.backwardDisplay();
    }
}
