package Youtube;//import java.util.*;

public class YouTube {

    int subscriberCount;
    String channelType;
    String ChannelName;
    int videosView;
    public void subscriberCount(int subscriberCount)
    {
        this.subscriberCount = subscriberCount;
    }
    public void channelType(String channelType)
    {
        this.channelType = channelType;
    }
    public void channelName(String ChannelName)
    {
        this.ChannelName = ChannelName;
    }
    public void videosView(int videosView)
    {
        this.videosView = videosView;
    }
    public void displayChannelInfo()
    {
        if (subscriberCount <= 10000)
        {
            System.out.println(ChannelName + " is having silver title");
        }
        else if (subscriberCount>=10000 && subscriberCount<=100000 )
        {
            System.out.println(ChannelName + " is having gold title");
        }
        else if (subscriberCount>=100000 && subscriberCount<=1000000 )
        {
            System.out.println(ChannelName + " is having platinum title");
        }
        else if (subscriberCount>=1000000 && subscriberCount<=10000000)
        {
            System.out.println(ChannelName + " is having diamond title");
        }
    }

    public static void main(String[] args) {
        YouTube youtube = new YouTube();

        youtube.channelName("Techburner");
        youtube.subscriberCount(5000);
        youtube.displayChannelInfo();

        youtube.channelName("UnboxTherapy");
        youtube.subscriberCount(10001);
        youtube.displayChannelInfo();

        youtube.channelName("CoolFunnyTshirt");
        youtube.subscriberCount(100001);
        youtube.displayChannelInfo();

        youtube.channelName("T-Series");
        youtube.subscriberCount(1000000);
        youtube.displayChannelInfo();


    }
}
