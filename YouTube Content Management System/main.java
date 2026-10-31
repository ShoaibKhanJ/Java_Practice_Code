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
        String channelname;

    public YouTubeVideo(String title, int views, String channelname) {
        super(title, views); 
        this.channelname = channelname;
    }
    void displayDetails() {
    video_details(); // Calls inherited method
    System.out.println("Channel: " + this.channelname);
}

        
}

class main{
    public static void main(String[] args) {
        YouTubeVideo v1 = new YouTubeVideo("How to eat BreakFast?", 150824, "Ducky Bhai");
        YouTubeVideo v2 = new YouTubeVideo("How to eat Lunch?", 50824, "Ducky Bhai");
        YouTubeVideo v3 = new YouTubeVideo("How to eat DINNER?", 550824, "Ducky Bhai");

   
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