package constructor;

import java.util.ArrayList;

public class TestMovie2 {
    public static void main(String[] args) {
        Movie m1 = new Movie("战狼2", 9.6, "吴京");
        Movie m2 = new Movie("让子弹飞", 9.5, "姜文");
        Movie m3 = new Movie("英雄本色", 9.4, "周润发");

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        for (int i = 0; i < movies.size(); i++) {
            Movie m = movies.get(i);
            System.out.println("电影名称："+ m.getName());
            System.out.println("评分："+ m.getScore());
            System.out.println("主演："+ m.getActor());
            System.out.println("----------------------");
        }
    }
}
