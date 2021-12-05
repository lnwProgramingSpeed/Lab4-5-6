package School;

public class Librarian {
    public static void main(String[] args) {
        Student student;
        Student student2;
        Card card;
        Card card2;

        student = new Student();
        student.setName("Barry Allen");
        student.setEmail("ImaFuqYaMa@cmu.ac.th");
        student.setID(953164);

        card = new Card();
        card.setOwner(student);
        card.checkout(69);

        student2 = new Student();
        student2.setName("John John John");
        student2.setEmail("JohnJohnJohn@cmu.ac.th");
        student2.setID(235168);

        card2 = new Card();
        card2.setOwner(student2);
        card2.checkout(69);

        System.out.println("Card info:");
        System.out.print(card.toString() + "\n");

        System.out.println("Card info:");
        System.out.print(card2.toString() + "\n");
    }
}
