
public class TV {
	
	int channel;
	int volumeLevel;
	boolean on=false;
	public TV() 
	{
		channel=1;
		volumeLevel=1;
	}
	public void turnOn()
	{
		on=true;
	}
	public void turnOff()
	{
		on=false;
	}
	public void setChannel(int newChannel) {
		if(on=true&& newChannel>=1&& newChannel<=120)
			channel=newChannel;
		
	}
	public void setVolume(int newVolumeLevel) {
		if(on=true&& newVolumeLevel>=1&& newVolumeLevel<=7)
			volumeLevel=newVolumeLevel;
		
	}
	public void channelUp() {
		if(on=true&&channel<120)
		{channel++;}
	}
	public void channelDown() {
		if(on=true&&channel>1)
		{channel--;}
	}
	public void volumeUp() {
		if(on=true&&volumeLevel<7)
		{volumeLevel++;}
	}
	public void volumeDown() {
		if(on=true&&volumeLevel>1)
		{volumeLevel--;}
	}
	
}
