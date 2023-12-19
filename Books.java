package Classes;
public class Books
{
    protected String bookID, bookName, bookAuthor, bookEdition;
    
    public Books(String bookID)
    {
        this.bookID = bookID;
    }
    
    public Books(String bookID, String bookName, String bookAuthor, String bookEdition)
    {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookEdition =bookEdition;
    }

    /* ============= Getters and Setters ============= */
    
    public void setBookID(String bookID)
    {
        this.bookID = bookID;
    }

    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor)
    {
        this.bookAuthor = bookAuthor;
    }

    public void setBookEdition(String bookEdition)
    {
        this.bookEdition = bookEdition;
    }

    public String getBookID()
    {
        return bookID;
    }
    public String getBookName()
    {
        return bookName;
    }
    public String getBookAuthor()
    {
        return bookAuthor;
    }
    public String getBookEdition()
    {
        return bookEdition;
    }
}