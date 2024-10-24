import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class App {
    private static List<Category> category_List = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Read categories and books from CSV file
        readFromCSV("input.csv");

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add a Book");
            System.out.println("2. Display Categories and Books");
            System.out.println("3. Write to CSV");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    addBook(sc);
                    break;
                case 2:
                    printDetail(category_List);
                    break;
                case 3:
                    writeToCSV("output.csv");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }

    private static void readFromCSV(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, ",");
                if (tokenizer.countTokens() < 3) {
                    System.out.println("Skipping invalid line: " + line);
                    continue;
                }
                int categoryId = Integer.parseInt(tokenizer.nextToken());
                String categoryName = tokenizer.nextToken();
                String isbn = tokenizer.nextToken();
                String bookName = tokenizer.nextToken();
                String authorName = tokenizer.nextToken();

                // Check if category already exists
                Category category = category_List.stream()
                        .filter(c -> c.getCname().equalsIgnoreCase(categoryName))
                        .findFirst()
                        .orElseGet(() -> {
                            Category newCategory = new Category(categoryId, categoryName);
                            category_List.add(newCategory);
                            return newCategory;
                        });

                category.addBook(new Book(isbn, bookName, authorName));
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    private static void addBook(Scanner sc) {
        // Display available categories with IDs
        System.out.println("Choose a category by entering the corresponding ID:");
        for (Category category : category_List) {
            System.out.println(category);
        }

        int categoryId = sc.nextInt();
        sc.nextLine(); // Consume the newline

        if (categoryId < 1 || categoryId > category_List.size()) {
            System.out.println("Invalid category ID. Please try again.");
            return;
        }

        System.out.println("Enter the details (ISBN, Book Name, Author Name) separated by commas:");
        String input = sc.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(input, ",");

        if (tokenizer.countTokens() < 3) {
            System.out.println("Please provide all three details.");
            return;
        }

        String isbn = tokenizer.nextToken().trim();
        String bookName = tokenizer.nextToken().trim();
        String authorName = tokenizer.nextToken().trim();

        Category selectedCategory = category_List.get(categoryId - 1);
        selectedCategory.addBook(new Book(isbn, bookName, authorName));
        System.out.println("Book added successfully to " + selectedCategory.getCname() + "!");
    }

    private static void writeToCSV(String filePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Category category : category_List) {
                for (Book book : category.getCbookList()) {
                    bw.write(category.getId() + "," + category.getCname() + "," + book.toString());
                    bw.newLine();
                }
            }
            System.out.println("Data successfully written to " + filePath);
        } catch (IOException e) {
            System.out.println("Error writing the file: " + e.getMessage());
        }
    }

    public static void printDetail(List<Category> categoryList) {
        for (Category category : categoryList) {
            System.out.println(category);
            for (Book book : category.getCbookList()) {
                System.out.println("  - " + book);
            }
        }
    }
}
