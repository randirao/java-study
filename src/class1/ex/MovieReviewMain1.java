package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview inseption = new MovieReview();
        inseption.title = "인셉션";
        inseption.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화";

        System.out.println("영화 제목: " + inseption.title + ", 리뷰: " + inseption.review);
        System.out.println("영화 제목: " + aboutTime.title + ", 리뷰: " + aboutTime.review);
    }
}
