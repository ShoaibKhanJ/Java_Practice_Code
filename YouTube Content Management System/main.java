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
        int video_likes;
        int video_comments;        

    public YouTubeVideo(String title, int views, int video_likes, int video_comments) {
        super(title, views);
        this.video_comments = video_comments;
        this.video_likes = video_likes; 
    }
    void displayDetails() {
    video_details(); // Calls inherited method
    System.out.println("Likes: "+ video_likes);
    System.out.println("Comments: "+ video_comments);
}

        
}

class main{
    public static void main(String[] args) {
        YouTubeVideo v1 = new YouTubeVideo("How to eat BreakFast?", 150824, 708, 10);
        YouTubeVideo v2 = new YouTubeVideo("How to eat Lunch?", 50824, 7489, 508);
        YouTubeVideo v3 = new YouTubeVideo("How to eat DINNER?", 550824, 7515, 814);

   
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
    Video.displayTotalVideos();

    }
}