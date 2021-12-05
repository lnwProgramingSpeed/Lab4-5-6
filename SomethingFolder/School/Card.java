package School;

public class Card {
    // Number of book that is borrow
    private int borrowbook;
    //number of book that return
    private int handinbook;
    // Owner name or the student name
    private Student card;

    public Card() {
        handinbook = 0;
        borrowbook = 0;
        card = null;
    }

    // Book that plus the old book that is rent
    public void checkout(int bookcheckout) {
        borrowbook = borrowbook + bookcheckout;
    }

    public void checkin(int bookcheckin) {
        borrowbook = borrowbook - bookcheckin;
    }

    public int getNumberOfBook() {
        return borrowbook;
    }

    public int getNumberOfReturnBook(){
        return handinbook;
    }

    public String getOwnerName() {
        return card.getName();
    }

    public void setOwner(Student student) {
        card = student;
    }

    public void setReturn(int handin) {
        handinbook = handin;
    }

    public String toString() {
        return "Owner name = " + card.getName() + "\n" + 
        "Email: " + card.getEmail() + "\n" + 
        "Student ID:" + card.getID() + "\n" + 
        "Books Borrowed: " + borrowbook + "\n" + 
        "Return Book:" + handinbook;
    }

    public String toString2() {
        return "Owner name = " + card.getName() + "\n" + 
        "Email: " + card.getEmail() + "\n" + 
        "Student ID:" + card.getID() + "\n" + 
        "Books Borrowed: " + borrowbook + "\n" + 
        "Return Book:" + handinbook;    }
}
