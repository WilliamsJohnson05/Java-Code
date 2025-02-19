import java.util.Scanner;
public class flames {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Input two names
            System.out.print("Enter first name: ");
            String name1 = scanner.next().toLowerCase(); 
    
            System.out.print("Enter second name: ");
            String name2 = scanner.next().toLowerCase();
    
            // Remove common characters
            StringBuilder sb1 = new StringBuilder(name1);
            StringBuilder sb2 = new StringBuilder(name2);
    
            for (int i = 0; i < sb1.length(); i++) {
                for (int j = 0; j < sb2.length(); j++) {
                    if (sb1.charAt(i) == sb2.charAt(j)) {
                        sb1.deleteCharAt(i);
                        sb2.deleteCharAt(j);
                        i--; // Adjust index after deletion
                        break;
                    }
                }
            }
    
            // Count remaining characters
            int count = sb1.length() + sb2.length();
    
            // FLAMES logic
            String flames = "FLAMES";
            StringBuilder flamesSB = new StringBuilder(flames);
    
            int index = 0;
            while (flamesSB.length() > 1) {
                index = (count % flamesSB.length()) - 1;
                if (index >= 0) {
                    flamesSB.deleteCharAt(index);
                } else {
                    flamesSB.deleteCharAt(flamesSB.length() - 1);
                }
            }
    
            // Relationship result with Emojis
            char result = flamesSB.charAt(0);
            String relation = switch (result) {
                case 'F' -> "Friends 🤝";
                case 'L' -> "Love ❤️";
                case 'A' -> "Affection 😊";
                case 'M' -> "Marriage 💍";
                case 'E' -> "Enemies 😡";
                case 'S' -> "Siblings 👫";
                default -> "Unknown ❓";
            };
    
            System.out.println("Relationship: " + relation);
    
            scanner.close();
        }
    }
    


