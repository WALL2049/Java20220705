package constructor;

public class Movie {
    private String name;
    private double score;
    private String actor;

    public Movie(){
    }

    public Movie(String name, double score, String actor){
        this.name = name;
        this.score = score;
        this.actor = actor;
    }

    public String getName(){
        return this.name;
    }
    public double getScore(){
        return this.score;
    }
    public String getActor(){
        return this.actor;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setScore(double score){
        this.score = score;
    }
    public void setActor(String actor){
        this.actor = actor;
    }
}


