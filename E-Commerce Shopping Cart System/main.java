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


class main{
    public static void main(String[] args) {
        Video v1 = new Video("How to eat BreakFast?", 150824);
        Video v2 = new Video("How to eat Lunch?", 50824);
        Video v3 = new Video("How to eat DINNER?", 550824);
   
    System.out.println("_______________________________________________");
    v1.video_details();
    System.out.println("_______________________________________________");
    System.out.println("_______________________________________________");
    v2.video_details();
    System.out.println("_______________________________________________");
    System.out.println("_______________________________________________");
    v3.video_details();
    System.out.println("_______________________________________________");
    System.out.println("_______________________________________________");
    Video.displayTotalVideos();

    }
}