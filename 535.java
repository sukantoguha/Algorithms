//Encode and Decode TinyURL
public class Codec {
    String host = "http://tinyurl.com/";
    Map<Integer,String> map = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int key = longUrl.hashCode();
        map.put(key,longUrl);
        System.out.println(key);
        return host+key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int in = Integer.parseInt(shortUrl.replace(host,""));
        return map.get(in);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));