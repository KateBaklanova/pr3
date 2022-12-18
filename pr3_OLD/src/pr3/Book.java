package pr3;

public class Book
{
    private String title;
    private int pages;
    private boolean illustration;

    public Book (int pages, String title, boolean illustration)
    {
        this.title = title;
        this.pages = pages;
        this.illustration = illustration;

    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setPages (int pages)
    {
        this.pages = pages;
    }

    public int getPages ()
    {
        return pages;
    }

    public void setIllustration (boolean illustration)
    {
        this.illustration = illustration;
    }

    public boolean getIllustration ()
    {
        return illustration;
    }

    @Override
    public String toString ()
    {
        String output;
        output = title + " название \n" + pages + " кол-во страниц \n";
        if (illustration) {
            output += "с картинками ";
        }
        else {
            output += "без картинок ";
        }

        return output;
    }
}
