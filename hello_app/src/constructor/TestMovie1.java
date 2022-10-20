package constructor;

public class TestMovie1 {
    public static void main(String[] args) {
        Movie m1 = new Movie("战狼2", 9.6, "吴京");
        Movie m2 = new Movie("让子弹飞", 9.5, "姜文");
        Movie m3 = new Movie("英雄本色", 9.4, "周润发");

        Movie[] movies = new Movie[3];
        movies[0] = m1;
        movies[1] = m2;
        movies[2] = m3;

        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println("电影名：" + m.getName());
            System.out.println("评分：" + m.getScore());
            System.out.println("主演：" + m.getActor());
            System.out.println("-----------------");
        }
    }
}
