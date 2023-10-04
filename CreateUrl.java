import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class CreateUrl {
    public static String generateStickerURL(String stickerName) {
        try {
            String encodedStickerName = URLEncoder.encode(stickerName, StandardCharsets.UTF_8.toString());

            encodedStickerName = encodedStickerName.replace("+", "%20");

            String baseURL = "https://steamcommunity.com/market/search";
            String queryString = "?q=%22" + encodedStickerName + "%22&descriptions=1&category_730_ItemSet%5B%5D=any&category_730_Weapon%5B%5D=any&category_730_Quality%5B%5D=#p1_price_asc";

            String finalURL = baseURL + queryString;

            return finalURL;
        } catch (UnsupportedEncodingException e) {
            // handle exception if endocing fails
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String stickerName = "Clan-Mystik Katowice 2014";
        String stickerURL = generateStickerURL(stickerName);

        System.out.println("Sticker Name: " + stickerName);
        System.out.println("Generated URL: " + stickerURL);
    }
}