public class Main {
    public static void main(String[] args) {
        String stickerName = "Clan-Mystik Katowice 2014";
        String stickerURL = CreateUrl.generateStickerURL(stickerName);
        
        System.out.println("Sticker Name: " + stickerName);
        System.out.println("Generated URL: " + stickerURL);
    }
}