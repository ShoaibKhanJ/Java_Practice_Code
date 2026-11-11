    class Video{
        private String title;
        private int views;   
        static int total_videos = 0;

    Video(String title, int views){
        this.title = title;
        this.views = views;
        total_videos++; 
    }

    public void video_details(){
        System.out.println("Title: "+ this.title);
        System.out.println("Views: "+ this.views);
    }

    public static void displayTotalVideos(){
        System.out.println("Total Videos: "+ total_videos);
    }
}

    class YouTubeVideo extends Video{
        String Channelname;
        int video_likes;
        int video_comments;        

    public YouTubeVideo(String title, int views, String Channelname, int video_likes, int video_comments) {
        super(title, views);
        this.Channelname = Channelname;
        this.video_comments = video_comments;
        this.video_likes = video_likes; 
    }
    void displayDetails() {
    super.video_details(); // Calls inherited method
    System.out.println("Likes: "+ this.video_likes);
    System.out.println("Comments: "+ this.video_comments);
    }
}

    class PremiumVideo extends YouTubeVideo{
        String premiumFeatures;
        boolean subscriptionRequired;

        PremiumVideo(String title, int views, String Channelname, int video_likes, int video_comments, String premiumFeatures, boolean subscriptionRequired){
            super(title, views, Channelname, video_likes, video_comments);
            this.premiumFeatures = premiumFeatures;
            this.subscriptionRequired = subscriptionRequired;
        }

        @Override // declearing overriding intenstionally
        void displayDetails() {
        super.video_details(); // Calls inherited method
        System.out.println("Premium Feature: "+ this.premiumFeatures);
        System.out.println("Subscription Required: "+ this.subscriptionRequired);      }

    }
        


class main{
    public static void main(String[] args) {
        YouTubeVideo v1 = new YouTubeVideo("How Java Actually Works", 250000, "CodeWithHarry", 12500, 450);
        YouTubeVideo v2 = new YouTubeVideo("Building My First Startup", 85000, "Hitesh Choudhary", 6200, 320);
        PremiumVideo v3 = new PremiumVideo("Python for AI Beginners", 430000, "freeCodeCamp", 28000, 890, "4K Quality", true);
        PremiumVideo v4 = new PremiumVideo("Day in the Life of a Software Engineer", 175000, "Apna College", 9800, 510, "4K Quality", true);
        YouTubeVideo v5 = new YouTubeVideo("How to Build a Website", 320000, "Traversy Media", 18500, 720);
        YouTubeVideo v6 = new YouTubeVideo("The Future of Artificial Intelligence", 610000, "TED", 35000, 1200);
        YouTubeVideo v7 = new YouTubeVideo("Java OOP Explained", 95000, "Bro Code", 7800, 280);
   
    System.out.println("_______________________________________________");
    v1.displayDetails();
    System.out.println("_______________________________________________");
    System.out.println("_______________________________________________");
    v2.displayDetails();
    System.out.println("_______________________________________________");
    System.out.println("_______________________________________________");
    v3.displayDetails();
    System.out.println("_______________________________________________");
    System.out.println("_______________________________________________");
    v4.displayDetails();
    System.out.println("_______________________________________________");
    System.out.println("_______________________________________________");
    v5.displayDetails();
    System.out.println("_______________________________________________");
    System.out.println("_______________________________________________");
    v6.displayDetails();
    System.out.println("_______________________________________________");
    System.out.println("_______________________________________________");
    v7.displayDetails();
    System.out.println("_______________________________________________");
    System.out.println("_______________________________________________");
    Video.displayTotalVideos();

    }
}