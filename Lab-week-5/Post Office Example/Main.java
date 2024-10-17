// Post sınıfı
class Post {
    private String message;
    private String sourceAddress;
    private String targetAddress;

    // Yapıcı metod (constructor)
    public Post(String message, String sourceAddress, String targetAddress) {
        this.message = message;
        this.sourceAddress = sourceAddress;
        this.targetAddress = targetAddress;
    }

    // Get metodları
    public String getMessage() {
        return message;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }

    public String getTargetAddress() {
        return targetAddress;
    }

    // Post bilgisini ekrana yazdırma
    public void printPostInfo() {
        System.out.println("Message: " + message +
                ", From: " + sourceAddress +
                ", To: " + targetAddress);
    }
}

// PostOffice sınıfı
 class PostOffice {
    private String name;

    // Yapıcı metod (constructor)
    public PostOffice(String name) {
        this.name = name;
    }

    // Posta gönderme fonksiyonu
    public void send(Post post) {
        System.out.println(name + " is sending the following post:");
        post.printPostInfo();
    }

    // Posta alma fonksiyonu
    public void receive(Post post) {
        System.out.println(name + " received the following post:");
        post.printPostInfo();
    }
}

// Test sınıfı (main method içeriyor)
public class Main {
    public static void main(String[] args) {
        // İki postane objesi oluşturuluyor
        PostOffice postOffice1 = new PostOffice("Post Office 1");
        PostOffice postOffice2 = new PostOffice("Post Office 2");

        // Posta oluşturuluyor
        Post post = new Post("Hello World!", "Address A", "Address B");

        // Posta gönderiliyor ve alınıyor
        postOffice1.send(post);
        postOffice2.receive(post);
    }
}