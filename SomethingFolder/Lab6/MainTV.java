package Lab6;

public class MainTV {
    public static void main(String[] args) {
        TV newTV = new TV();

        System.out.println("The initial states of TV object are " + newTV.getState());
        System.out.println("Current Channel is: " + newTV.getChannel());
        System.out.println("Current Volume is: " + newTV.getVolume());
        System.out.println("Current States is: " + newTV.getState());

        newTV.setState();
        newTV.setChannel(20);
        newTV.setVolumeUp();
        newTV.setVolumeUp();

        System.out.println("The initial states of TV object are " + newTV.getState());
        System.out.println("Current Channel is: " + newTV.getChannel());
        System.out.println("Current Volume is: " + newTV.getVolume());
        System.out.println("Current States is: " + newTV.getState());

    }
}
