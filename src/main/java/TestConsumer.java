import java.util.Date;
import java.util.function.Consumer;

class Movie{
    private String name;
    private String actor;
    private Date releaseDate;
    public Movie(String name, String actor, Date releaseDate) {
        this.name = name;
        this.actor = actor;
        this.releaseDate = releaseDate;
    }
    public String getName() {
        return name;
    }
    public String getActor() {
        return actor;
    }
    public Date getReleaseDate() {
        return releaseDate;
    }
}
public class TestConsumer {
    public static void main(String[] args) {
        Consumer<Movie>c=m->{
            System.out.println(m.getName());
            System.out.println(m.getActor());
            System.out.println(m.getReleaseDate());
        };
        Movie m1=new Movie("Sethupathi","Vjs",new Date());
        c.accept(m1);
    }
}
