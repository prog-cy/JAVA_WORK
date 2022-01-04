package project1;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import java.util.Scanner;

public class AudioPlayer {

	public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException{
		
		Scanner scan = new Scanner(System.in);
		
		File file = new File("C:\\Users\\rupes\\Desktop\\L_Work\\java_work\\AudioFile\\song.wav");
		
		AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);
		
		Clip clip = AudioSystem.getClip();
		clip.open(audiostream);
		
		String response = "";
		
		while(!(response.equals("Q"))) {
			
			System.out.println("P = Play S = Stop R = Reset Q = Quit");
			response = scan.next();
			response = response.toUpperCase();
			
			switch(response) {
				
			case "P": clip.start();
					  break;
			case "S": clip.stop();
					  break;
			case "R": clip.setMicrosecondPosition(0);
					  break;
			case "Q": clip.close();
					  break;
			default: System.out.println("Not a valid response");
			}
		}
		
		System.out.println("Successfully completed...");
		scan.close();
		
		
	}

}
