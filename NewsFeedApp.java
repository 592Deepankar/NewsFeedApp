import java.util.ArrayList;
import java.util.Scanner;

public class NewsFeedApp {

    // Class to represent a news article
    public static class NewsArticle {
        private String title;
        private String content;
        private String author;
        private String date;

        public NewsArticle(String title, String content, String author, String date) {
            this.title = title;
            this.content = content;
            this.author = author;
            this.date = date;
        }

        // Getters
        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public String getDate() {
            return date;
        }

        // toString method to display the article details
        @Override
        public String toString() {
            return "Title: " + title + "\nAuthor: " + author + "\nDate: " + date + "\nContent: " + content;
        }
    }

    // Main application logic
    public static void main(String[] args) {
        ArrayList<NewsArticle> newsFeed = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select a choice:");
            System.out.println("1. Add News Article");
            System.out.println("2. View News Feed");
            System.out.println("3. Exit");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                // Add a new article
                System.out.print("Enter article title: ");
                String title = scanner.nextLine();

                System.out.print("Enter article content: ");
                String content = scanner.nextLine();

                System.out.print("Enter author name: ");
                String author = scanner.nextLine();

                System.out.print("Enter publication date: ");
                String date = scanner.nextLine();

                NewsArticle article = new NewsArticle(title, content, author, date);
                newsFeed.add(article);

                System.out.println("News article added successfully!");
            } else if (choice.equals("2")) {
                // View all articles in the news feed
                System.out.println("News Feed:");
                for (NewsArticle article : newsFeed) {
                    System.out.println(article);
                    System.out.println("--------------");
                }
            } else if (choice.equals("3")) {
                // Exit the application
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}